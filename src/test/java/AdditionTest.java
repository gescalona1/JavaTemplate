import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AdditionTest {

    @Test
    public void add() {

        Assertions.assertEquals(Adder.add(5,5), 10, "The sum of 5 + 5 was not 10!");
    }
}
