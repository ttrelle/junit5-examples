package junit5;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

/**
 * @author xd99326
 */
public class AssertAllTest {

    @Test
    void failFast(TestInfo ti) {
        assertEquals(0, 1);
        assertEquals(2, 2);
        // ...
        print(ti.getDisplayName() + " fertig.");
    }

    @Test
    void testAll(TestInfo ti) {
        assertAll( //
            () -> assertEquals(0, 1), //
            () -> assertEquals(2, 2), //
            () -> print(ti.getDisplayName() + " fertig.")//
        );
    }

    static void print(Object o) {
        System.out.println(o);
    }

}
