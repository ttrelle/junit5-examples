package junit5;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class ExceptionTest {

    @Test
    void expectException() {
        // gegeben sei
        String n = null;

        // dann
        assertThrows(NullPointerException.class,
            // wenn
            () -> n.toString());
    }

}
