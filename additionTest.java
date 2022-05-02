import static org.junit.Assert.*;
import org.junit.*;

public class additionTest{
    @Test
    public void testAddition(){
        assertEquals(Addition.add(1,1), 2);
    }
}