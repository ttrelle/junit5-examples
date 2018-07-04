package junit4;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.TestName;
import junit4.marker.Mathematisch;
import junit4.marker.Wichtig;

public class SimpleTest {

    @Rule
    public TestName testName = new TestName();

    @BeforeClass
    public static void einmal() {
        print("Globale Initialisierung ...");
    }

    @Before
    public void init() {
        print("\tStarte Test " + testName.getMethodName() + " ...");
    }

    @Test
    @Category({Mathematisch.class, Wichtig.class})
    public void foo() {
        assertTrue(3 == 2 + 1, () -> "Addition kaputt");
    }

    @Ignore
    @Test
    public void hamcrestMatcher() {
        assertThat(1 + 2, is(3));
    }

    @After
    public void fertig() {
        print("\tBeende Test " + testName.getMethodName());
    }

    @AfterClass
    public static void einmalFertig() {
        print("Globaler Cleanup ...");
    }

    static void print(Object o) {
        System.out.println(o);
    }

}
