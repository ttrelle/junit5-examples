package junit5;

import static org.junit.jupiter.api.Assertions.assertTimeout;
import java.time.Duration;
import org.junit.jupiter.api.Test;

public class TimeoutTest {

    @Test
    void timeout() {
        assertTimeout(Duration.ofSeconds(2), () -> Thread.sleep(1500L));
    }

}
