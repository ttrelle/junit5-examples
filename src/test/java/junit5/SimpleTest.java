package junit5;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class SimpleTest {

    @BeforeAll
    static void einmal() {
        print("Globale Initialisierung ...");
    }

    @BeforeEach
    void init(TestInfo ti) {
        print("\tStarte Test " + ti.getDisplayName() + " ...");
    }

    @Test
    @DisplayName(";-)")
    @Tag("mathematisch")
    @Tag("wichtig")
    void foo(TestInfo ti) {
        assertTrue(3 == 2 + 1, () -> "Addition kaputt");
        print("\t\tTags: " + ti.getTags());
    }

    @Disabled
    @Test
    void hamcrestMatcher() {
        assertThat(1 + 2, is(3));
    }

    @AfterEach
    void fertig(TestInfo ti) {
        print("\tBeende Test " + ti.getDisplayName());
    }

    @AfterAll
    static void einmalFertig() {
        print("Globaler Cleanup ...");
    }

    static void print(Object o) {
        System.out.println(o);
    }

}
