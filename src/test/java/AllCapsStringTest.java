import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

// Junit: Open source unit testing framework
// unit under test: the unit (method, class, interface, etc.) that we are testing
// test class: normal java class it contains tests (methods with the @Test annotation)
// convention: slap "Test" on the end of the name of the class under test
public class AllCapsStringTest {

    //use the @After and @Before annotations
    // to set up a "test fixture"
    // test fixture: a fixed state of the unit under test
    // used for each test method
    // @Before setup() --> sets up the state of unit under test
    // @After tearDown() --> cleans up the state of unit under test

    @Before
    public void setUp() {
        System.out.println("Hello from setup()");
    }

    @After
    public void tearDown() {
        System.out.println("Hello from tearDown()");
    }

    // test method: normal java method with @Test annotation to denote it is a test
    // convention: "test<unit name>" or "should<do something>"
    // how do we execute tests?
    // -IDE (like IntelliJ) or build tool/system (like Gradle or Maven)
    // execute tests directly (no main())
    // -main() and run a "test suite"
    @Test
    public void testConstructor() {
        AllCapsString allCapsString = new AllCapsString("hello");
        assertEquals(allCapsString.getCapStr(), "HELLO");
        // actual value, expected value
    }

    @Test
    public void testSetter() {
        AllCapsString allCapsString = new AllCapsString("hello");
        allCapsString.setCapStr("goodbye");
        assertEquals(allCapsString.getCapStr(), "GOODBYE");
    }
}
