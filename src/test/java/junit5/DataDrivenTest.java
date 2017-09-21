package junit5;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class DataDrivenTest {

	@ParameterizedTest(name = "{index}: {0} + {1} = {2}")
	@CsvFileSource(resources = "/addition.csv")
	void addition(int a, int b, int c) {
		assertTrue(a + b == c);
	}
	
}
