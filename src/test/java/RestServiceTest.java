import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.RestService;

public class RestServiceTest {

    @Test
    public void testCase1() {
        RestService service = new RestService();
        int actual = service.calculate(10_000, 3_000, 20_000);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCase2() {
        RestService service = new RestService();
        int actual = service.calculate(100_000, 60_000, 150_000);
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }
}