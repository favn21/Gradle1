import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TipServiceTest {

    private TipService tipService = new TipService();

    @ParameterizedTest
    @CsvSource({
            "500, 550",
            "1500, 1575",
            "1000, 1050"
    })
    @DisplayName("Округление чаевых")
    public void testRoundTips(BigDecimal amount, BigDecimal expected) {
        assertEquals(expected, tipService.roundTips(amount));
    }
}