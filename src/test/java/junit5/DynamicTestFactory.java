package junit5;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

class DynamicTestFactory {

    @TestFactory
    Stream<DynamicTest> dynamicTests() {
        return IntStream.range(1, 1 + new Random().nextInt(10))
                        .mapToObj(i -> dynamicTest("rndTest" + i, () -> assertTrue(i > 0)));
    }
}
