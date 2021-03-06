package junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class DataDrivenCsvTest {

    @ParameterizedTest(name = "{index}: {0} + {1} = {2}")
    @CsvFileSource(resources = "/addition.csv")
    void addition(int a, int b, int c) {
        assertEquals(c, a + b);
    }
}
