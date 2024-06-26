import org.testng.annotations.*;
public class PROJECT2_CalculatorTest {

        private Calculator calculator;

        @BeforeSuite
        public void beforeSuite() {
            System.out.println("Before Suite: Initialize resources required for the entire suite");
        }

        @AfterSuite
        public void afterSuite() {
            System.out.println("After Suite: Clean up resources used for the entire suite");
        }

        @BeforeTest
        public void beforeTest() {
            System.out.println("Before Test: Set up test environment for the test tag");
        }

        @AfterTest
        public void afterTest() {
            System.out.println("After Test: Tear down test environment for the test tag");
        }

        @BeforeClass
        public void beforeClass() {
            System.out.println("Before Class: Initialize resources required for the test class");
        }

        @AfterClass
        public void afterClass() {
            System.out.println("After Class: Clean up resources used by the test class");
        }

        @BeforeMethod
        public void beforeMethod() {
            System.out.println("Before Method: Initialize the Calculator object before each test method");
            calculator = new Calculator();
        }

        @AfterMethod
        public void afterMethod() {
            System.out.println("After Method: Clean up after each test method");
            calculator = null;
        }

        @Test
        public void testAddition() {
            System.out.println("Test Addition: Running test for addition");
            int result = calculator.add(2, 3);
            assert result == 5 : "Addition test failed";
        }

        @Test
        public void testSubtraction() {
            System.out.println("Test Subtraction: Running test for subtraction");
            int result = calculator.subtract(5, 3);
            assert result == 2 : "Subtraction test failed";
        }

        @DataProvider(name = "multiplicationData")
        public Object[][] createMultiplicationData() {
            return new Object[][] {
                    {2, 3, 6},
                    {4, 5, 20}
            };
        }

        @Test(dataProvider = "multiplicationData")
        public void testMultiplication(int a, int b, int expected) {
            System.out.println("Test Multiplication: Running test for multiplication with data provider");
            int result = calculator.multiply(a, b);
            assert result == expected : "Multiplication test failed";
        }

        @Parameters({"a", "b"})
        @Test
        public void testDivision(@Optional("10") int a, @Optional("2") int b) {
            System.out.println("Test Division: Running test for division with parameters");
            int result = calculator.divide(a, b);
            assert result == 5 : "Division test failed";
        }

        @BeforeGroups("arithmetic")
        public void beforeGroups() {
            System.out.println("Before Groups: Setup for arithmetic group tests");
        }

        @AfterGroups("arithmetic")
        public void afterGroups() {
            System.out.println("After Groups: Teardown for arithmetic group tests");
        }

        @Test(groups = "arithmetic")
        public void testModulo() {
            System.out.println("Test Modulo: Running test for modulo in arithmetic group");
            int result = calculator.modulo(10, 3);
            assert result == 1 : "Modulo test failed";
        }

        // Calculator class for the sake of completeness
        class Calculator {
            public int add(int a, int b) {
                return a + b;
            }
            public int subtract(int a, int b) {
                return a - b;
            }
            public int multiply(int a, int b) {
                return a * b;
            }
            public int divide(int a, int b) {
                return a / b;
            }
            public int modulo(int a, int b) {
                return a % b;
            }
        }
    }


