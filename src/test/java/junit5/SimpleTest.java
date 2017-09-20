package junit5;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class SimpleTest {

	@BeforeEach void setUp(TestInfo ti) {
		out(ti.getDisplayName());
	}
	
	@Test 
	@DisplayName(";-)")
	@Tag("wichtig") 	@Tag("mathematisch")
	void foo(TestInfo ti) {
		assertTrue(3 == 2+1, () -> "Addition kaputt" );
		out("Tags: " + ti.getTags());
	}
	
	static void out(Object o) {
		System.out.println(o);
	}
}
