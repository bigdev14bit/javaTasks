import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackToSenderTest {

    @Test
    public void testLessThat50Percent() {
        assertEquals(9000, BackToSenderMethod.calculateWage(25));
    }

    @Test
    public void test50To59Percent() {
        assertEquals(16000, BackToSenderMethod.calculateWage(55));
    }

    @Test
    public void test60To69Percent() {
        assertEquals(21250, BackToSenderMethod.calculateWage(65));
    }

    @Test
    public void test70PercentAndAbove() {
        assertEquals(45000, BackToSenderMethod.calculateWage(80));
    }
}
