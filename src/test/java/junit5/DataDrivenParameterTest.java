package junit5;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class DataDrivenParameterTest {

	@ParameterizedTest(name = "{index}: {0}")
	@ValueSource(strings = { "foo", "bar", "baz" })
	void strings(String s) {
		assertNotNull(s);
	}
}
