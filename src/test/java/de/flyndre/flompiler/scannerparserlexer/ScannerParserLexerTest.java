package de.flyndre.flompiler.scannerparserlexer;

import de.flyndre.flompiler.results.if_condition.DynamicIfElseResults;
import de.flyndre.flompiler.results.if_condition.DynamicIfResults;
import de.flyndre.flompiler.results.if_condition.StaticIfElseResults;
import de.flyndre.flompiler.results.if_condition.StaticIfResults;
import de.flyndre.flompiler.results.methods.*;
import de.flyndre.flompiler.testing.Flassertions;
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
import de.flyndre.flompiler.scannerparserlexer.syntaxtree.Program;
import de.flyndre.flompiler.testing.Fleflection;
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
        try {
            final var inputPath = TestConstants.RESOURCES_ROOT + inputFilePath;
            final String inputString;
            inputString = Files.readString(Path.of(inputPath));
            final var actual = ScannerParserLexer.compile(inputString);
            Flassertions.assertDeeplyAlike(expected, actual);
        } catch (Exception e) {
            throw new RuntimeException(e);
        };
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

    @Test
    @DisplayName("ScannerParserLexer: Defective Boolean Assigned Attribute Class")
    public void testDefectiveAttributeAssignedBooleanClass() {
        testFailure("/attribute_assignments/defective/BooleanAssignment.java");
    }

    @Test
    @DisplayName("ScannerParserLexer: Defective Integer Assigned Attribute Class")
    public void testDefectiveAttributeAssignedIntegerClass() {
        testFailure("/attribute_assignments/defective/IntegerAssignment.java");
    }

    @Test
    @DisplayName("ScannerParserLexer: Defective Char Assigned Attribute Class")
    public void testDefectiveAttributeAssignedCharClass() {
        testFailure("/attribute_assignments/defective/CharAssignment.java");
    }



    // METHODS

    @Test
    @DisplayName("ScannerParserLexer: Parameterless Boolean Method Class")
    public void testMethodBooleanParameterlessClass() {
        testSuccess("/methods/parameterless/BooleanMethod.java", BooleanMethodClassResults.AST);
    }

    @Test
    @DisplayName("ScannerParserLexer: Boolean Method Class With Parameters")
    public void testMethodBooleanParameterlessReturnClass() {
        testSuccess("/methods/parameters/BooleanMethodReturn.java", BooleanMethodReturnClassResults.AST);
    }

    @Test
    @DisplayName("ScannerParserLexer: Integer Method Class With Parameters")
    public void testMethodIntegerParameterlessClass() {
        testSuccess("/methods/parameters/IntegerMethod.java", IntegerMethodClassResults.AST);
    }

    @Test
    @DisplayName("ScannerParserLexer: Char Method Class With Parameters")
    public void testMethodCharParameterlessClass() {
        testSuccess("/methods/parameters/CharMethod.java", CharMethodClassResults.AST);
    }



    // STATIC IF AND IF-ELSE

    @Test
    @DisplayName("Flompiler: Static If Condition")
    public void testFlompilerStaticIf() {
        testSuccess("/if_condition/StaticIf.java", StaticIfResults.AST);
    }

    @Test
    @DisplayName("Flompiler: Static If-Else Condition")
    public void testFlompilerStaticIfElse() {
        testSuccess("/if_condition/StaticIfElse.java", StaticIfElseResults.AST);
    }



    // DYNAMIC IF AND IF-ELSE

    @Test
    @DisplayName("Flompiler: Dynamic If Condition")
    public void testFlompilerDynamicIf() {
        testSuccess("/if_condition/DynamicIf.java", DynamicIfResults.AST);
    }

    @Test
    @DisplayName("Flompiler: Dynamic If-Else Condition")
    public void testFlompilerDynamicIfElse() {
        testSuccess("/if_condition/DynamicIfElse.java", DynamicIfElseResults.AST);
    }
}