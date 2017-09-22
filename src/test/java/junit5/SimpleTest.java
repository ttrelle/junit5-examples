package junit5;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class SimpleTest {

	@BeforeEach void setUp(TestInfo ti) {
		System.out.println(ti.getDisplayName());
	}
	
//	@Disabled	
	@Test 
	@DisplayName(";-)")
	@Tag("mathematisch")
	@Tag("wichtig") 
	void foo(TestInfo ti) {
		assertTrue(3 == 2+1, () -> "Addition kaputt" );
		System.out.println("Tags: " + ti.getTags());
	}
	
	@Test
	void hamcrestMatcher() {
		assertThat( 1 + 2, is(3) );
	}
}
