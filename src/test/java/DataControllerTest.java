import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DataControllerTest {
    @Test
    void testDataEndpoint() {
        DataController controller = new DataController();
        assertEquals("{\"message\": \"Hello from backend!\"}", controller.getData());
    }
}
