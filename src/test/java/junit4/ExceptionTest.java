package junit4;

import static org.junit.Assert.fail;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExceptionTest {

    @Test
    public void umstaendlich() {
        // gegeben sei
        String n = null;

        try {
            // wenn
            n.toString();
            fail();
        } catch (NullPointerException e) {
            // dann: erwarte Exception
        }
    }

    @Test(expected = NullPointerException.class)
    public void besser() {
        // gegeben sei
        String n = null;

        // wenn
        n.toString();

        // dann: erwarte Exception
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void gut() {
        // gegeben sei
        String n = null;
        thrown.expect(NullPointerException.class);
        // thrown.expectMessage("irgendwas");

        // wenn
        n.toString();

        // dann: erwarte Exception
    }

}
