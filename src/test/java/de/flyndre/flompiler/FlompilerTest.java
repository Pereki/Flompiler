package de.flyndre.flompiler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class FlompilerTest {

    /**
     * Prepares the compilation of the given file.
     * @param inputFilePath the path to the .java file
     * @return an executable which attempts to compile the file
     */
    private Executable createCompilationExecutable(String inputFilePath) {
        final var inputPath = TestConstants.RESOURCES_ROOT + inputFilePath;
        final String[] args = { inputPath };
        return () -> Flompiler.main(args);
    }

    /**
     * Tries to compile the given file.
     * If successful, the compilation produces a `.class` file next to the given `.java` file.
     * @param inputFilePath the path to the .java file
     */
    private void testParsingSuccess(String inputFilePath) {
        Assertions.assertDoesNotThrow(createCompilationExecutable(inputFilePath));
    }

    /**
     * Tries to compile the given file and expects the compilation to fail.
     * @param inputFilePath the path to the `.java` file
     */
    private void testParsingFailure(String inputFilePath) {
        Assertions.assertThrows(Exception.class, createCompilationExecutable(inputFilePath));
    }

    /**
     * Creates an instance of the given class.
     * @param inputFileFolder the folder in which the class' class file lays
     * @param inputClassName the name of the class (not the class file!)
     * @return an instance of the class
     */
    public Object getReflectionInstance(String inputFileFolder, String inputClassName) {
        try {
            File inputFolder = new File( TestConstants.RESOURCES_ROOT + inputFileFolder);
            URLClassLoader classLoader = new URLClassLoader(
                    new URL[]{ inputFolder.toURI().toURL() },
                    Thread.currentThread().getContextClassLoader()
            );
            Class<?> clazz = Class.forName(inputClassName, true, classLoader);
            return clazz.getDeclaredConstructor().newInstance();
        } catch (MalformedURLException e) {
            throw new RuntimeException("The folder path is malformed.", e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("There is no class with name " + inputClassName + ".", e);
        } catch (InstantiationException e) {
            throw new RuntimeException("The given class cannot be instanced (is abstract).", e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("The given class cannot be instanced (constructor is not public).", e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("The given class cannot be instanced (no matching constructor).", e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException("The given class cannot be instanced (its constructor threw an exception).", e);
        }
    }



    // EMPTY CLASS

    @Test
    @DisplayName("Flompiler: Empty Class")
    public void testFlompilerEmptyClass() {
        testParsingSuccess("/basic/EmptyClass.java");
        Object instance = getReflectionInstance("/basic", "EmptyClass");
        Assertions.assertEquals(instance.getClass().getName(), "EmptyClass");
    }

    @Test
    @DisplayName("Flompiler: Defective Empty Class")
    public void testFlompilerDefectiveEmptyClass() {
        testParsingFailure("/basic/defective/DefectiveEmptyClass.java");
    }



    // ATTRIBUTES

    @Test
    @DisplayName("Flompiler: Boolean Attribute Class")
    public void testFlompilerBooleanAttributeClass() {
        testParsingSuccess("/attributes/BooleanClass.java");
    }

    @Test
    @DisplayName("Flompiler: Defective Boolean Attribute Class")
    public void testFlompilerDefectiveBooleanAttributeClass() {
        testParsingFailure("/attributes/defective/DefectiveBooleanClass.java");
    }



    // METHODS (NO PARAMETERS)

    @Test
    @DisplayName("Flompiler: Boolean Method Class")
    public void testFlompilerBooleanMethodClass() {
        testParsingSuccess("/methods/parameterless/BooleanMethod.java");
    }

    @Test
    @DisplayName("Flompiler: Defective Boolean Method Class")
    public void testFlompilerDefectiveBooleanMethodClass() {
        testParsingFailure("/methods/parameterless/defective/BooleanMethod.java");
    }



    // METHODS WITH PARAMETERS

    @Test
    @DisplayName("Flompiler: Boolean Method Class with Boolean Parameter")
    public void testFlompilerBooleanMethodParametersClass() {
        testParsingSuccess("/methods/parameters/BooleanMethod.java");
    }

    @Test
    @DisplayName("Flompiler: Boolean Method Class with returned Boolean Parameter")
    public void testFlompilerBooleanMethodReturnedParametersClass() {
        testParsingSuccess("/methods/parameters/BooleanMethodReturn.java");
    }

    @Test
    @DisplayName("Flompiler: Integer Method Class with increased Integer Parameter")
    public void testFlompilerIntegerMethodParametersClass() {
        testParsingSuccess("/methods/parameters/IntegerMethod.java");
    }

    @Test
    @DisplayName("Flompiler: Char Method Class with returned Char Parameter")
    public void testFlompilerCharMethodParametersClass() {
        testParsingSuccess("/methods/parameters/CharMethod.java");
    }



    // STATIC IF AND IF-ELSE

    @Test
    @DisplayName("Flompiler: Static If Condition")
    public void testFlompilerStaticIf() {
        testParsingSuccess("/if_condition/StaticIf.java");
    }

    @Test
    @DisplayName("Flompiler: Static If-Else Condition")
    public void testFlompilerStaticIfElse() {
        testParsingSuccess("/if_condition/StaticIfElse.java");
    }



    // DYNAMIC IF AND IF-ELSE

    @Test
    @DisplayName("Flompiler: Dynamic If Condition")
    public void testFlompilerDynamicIf() {
        testParsingSuccess("/if_condition/DynamicIf.java");
    }

    @Test
    @DisplayName("Flompiler: Dynamic If-Else Condition")
    public void testFlompilerDynamicIfElse() {
        testParsingSuccess("/if_condition/DynamicIfElse.java");
    }
}
