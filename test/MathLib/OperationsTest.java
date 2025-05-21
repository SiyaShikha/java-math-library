package MathLib;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OperationsTest {
    @Test
    void name() {
        assertEquals(1,1);
    }

    @Test
    void add() {
//        Operations operations = new Operations();
        assertEquals(3, Operations.add(1,2));
    }

    @Test
    void sub() {
//        Operations operations = new Operations();
        assertEquals(1,Operations.sub(2,1));
    }
}