package de.flyndre.flompiler.scannerparserlexer;

import de.flyndre.flompiler.Flassertions;
import de.flyndre.flompiler.TestConstants;
import de.flyndre.flompiler.results.attribute_assignments.BooleanAssignmentResults;
import de.flyndre.flompiler.results.attribute_assignments.CharAssignmentResults;
import de.flyndre.flompiler.results.attribute_assignments.IntegerAssignmentResults;
import de.flyndre.flompiler.results.attribute_assignments.StringAssignmentResults;
import de.flyndre.flompiler.results.attributes.BooleanClassResults;
import de.flyndre.flompiler.results.attributes.CharClassResults;
import de.flyndre.flompiler.results.attributes.IntegerClassResults;
import de.flyndre.flompiler.results.attributes.StringClassResults;
import de.flyndre.flompiler.results.basic.EmptyClassResults;
import de.flyndre.flompiler.results.methods.BooleanMethodClassResults;
import de.flyndre.flompiler.results.methods.StringMethodClassResults;
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Program;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ScannerParserLexerTest {

    /**
     * Tests if a .java file can be successfully parsed by the `ScannerParserLexer`.
     * @param inputFilePath path to the .java file
     * @param expected the expected AST
     */
    private void testSuccess(String inputFilePath, Program expected) {
        final var inputPath = TestConstants.RESOURCES_ROOT + inputFilePath;
        final String inputString;
        try {
            inputString = Files.readString(Path.of(inputPath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        final var actual = ScannerParserLexer.compile(inputString);
        Flassertions.assertDeeplyAlike(expected, actual);
    }

    /**
     * Tests if a faulty .java file produces an exception when parsed.
     * @param inputFilePath path to the .java file
     */
    private void testFailure(String inputFilePath) {
        final var inputPath = TestConstants.RESOURCES_ROOT + inputFilePath;
        final String inputString;
        try {
            inputString = Files.readString(Path.of(inputPath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        final Executable executable = () -> ScannerParserLexer.compile(inputString);
        Assertions.assertThrows(Exception.class, executable);
    }



    // EMPTY CLASS

    @Test
    @DisplayName("ScannerParserLexer: Empty Class")
    public void testEmptyClass() {
        testSuccess("/basic/EmptyClass.java", EmptyClassResults.AST);
    }

    @Test
    @DisplayName("ScannerParserLexer: Defective Empty Class")
    public void testDefectiveEmptyClass() {
        testFailure("/basic/defective/DefectiveEmptyClass.java");
    }



    // EMPTY ATTRIBUTES

    // Success

    @Test
    @DisplayName("ScannerParserLexer: Boolean Attribute Class")
    public void testAttributeBooleanClass() {
        testSuccess("/attributes/BooleanClass.java", BooleanClassResults.AST);
    }

    @Test
    @DisplayName("ScannerParserLexer: Integer Attribute Class")
    public void testAttributeIntegerClass() {
        testSuccess("/attributes/IntegerClass.java", IntegerClassResults.AST);
    }

    @Test
    @DisplayName("ScannerParserLexer: Char Attribute Class")
    public void testAttributeCharClass() {
        testSuccess("/attributes/CharClass.java", CharClassResults.AST);
    }

    @Test
    @DisplayName("ScannerParserLexer: String Attribute Class")
    public void testAttributeStringClass() {
        testSuccess("/attributes/StringClass.java", StringClassResults.AST);
    }

    // Failure

    @Test
    @DisplayName("ScannerParserLexer: Defective Boolean Attribute Class")
    public void testAttributeDefectiveBooleanClass() {
        testFailure("/attributes/defective/DefectiveBooleanClass.java");
    }



    // INITIALLY SET ATTRIBUTES

    // Success

    @Test
    @DisplayName("ScannerParserLexer: Boolean Assigned Attribute Class")
    public void testAttributeAssignedBooleanClass() {
        testSuccess("/attribute_assignments/BooleanAssignment.java", BooleanAssignmentResults.AST);
    }

    @Test
    @DisplayName("ScannerParserLexer: Integer Assigned Attribute Class")
    public void testAttributeAssignedIntegerClass() {
        testSuccess("/attribute_assignments/IntegerAssignment.java", IntegerAssignmentResults.AST);
    }

    @Test
    @DisplayName("ScannerParserLexer: Char Assigned Attribute Class")
    public void testAttributeAssignedCharClass() {
        testSuccess("/attribute_assignments/CharAssignment.java", CharAssignmentResults.AST);
    }

    @Test
    @DisplayName("ScannerParserLexer: String Assigned Attribute Class")
    public void testAttributeAssignedStringClass() {
        testSuccess("/attribute_assignments/StringAssignment.java", StringAssignmentResults.AST);
    }

    // Failure

    // TODO



    // EMPTY METHODS

    @Test
    @DisplayName("ScannerParserLexer: Parameterless Boolean Method Class")
    public void testMethodBooleanParameterlessClass() {
        testSuccess("/methods/parameterless/BooleanMethod.java", BooleanMethodClassResults.AST);
    }

    @Test
    @DisplayName("ScannerParserLexer: Parameterless String Method Class")
    public void testMethodStringParameterlessClass() {
        testSuccess("/methods/parameterless/StringMethod.java", StringMethodClassResults.AST);
    }

}