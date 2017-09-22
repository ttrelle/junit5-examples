package junit5;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.Test;

public class AssertionTest {

	@Test
	void expectException() {
		// gegeben sei
		String n = null;
		
		// dann
		assertThrows(NullPointerException.class,
				// wenn
				() -> n.toString()
		);
	}
	
	@Test
	void timeout() {
		assertTimeout(Duration.ofSeconds(1), ()-> Thread.sleep(2000L));
	}
	
}
