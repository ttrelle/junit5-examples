package junit5;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

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
            "*Alle* Assertions werden durchlaufen", //
            () -> assertEquals(0, 1), //
            () -> assertEquals(2, 2), //
            () -> assertEquals(3, 4), //
            () -> print(ti.getDisplayName() + " fertig.")//
        );
    }

    static void print(Object o) {
        System.out.println(o);
    }

}
