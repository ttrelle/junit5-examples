package junit5.mockito;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.BDDMockito.given;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class PlutimikationTest {

    @InjectMocks
    Multiplizierer multiplizierer;

    @Mock
    Addierer addierer;

    @Test
    @DisplayName("2 x 3 macht 4 ...")
    void plutimikation() {
        // gegeben sei
        given(addierer.addiere(0, 3)).willReturn(2);

        // wenn
        int plutimikationsErgebnis = multiplizierer.multipliziere(2, 3);

        // dann
        assertThat(plutimikationsErgebnis, is(4));
    }

}
