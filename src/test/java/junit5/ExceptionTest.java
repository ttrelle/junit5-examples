package junit5;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class ExceptionTest {

    @Test
    void expectException() {
        // gegeben sei
        String n = null;

        // dann
        NullPointerException npe = assertThrows(NullPointerException.class,
            // wenn
            () -> n.toString());
        // assertEquals(npe.getLocalizedMessage(), "irgendwas");
    }

}
