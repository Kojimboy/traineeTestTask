import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class WithProblemsTests {

    private final String CONST = "Value";
    private final static String bd = "pui";
    @Test
    public void equalsStringOneToOne(){
        assertEquals("1", "1");
    }


    @Test
    public void assignValueToConstVar(){
        assertEquals("Value", CONST);
    }

    @Test
    public void equalsIntOneToOne(){
        assertEquals(1, 1);
    }



    @Test
    public void stringsMustBeEquals(){
        String res = "a";

        if (bd.equals("pui"))
            res = "asd";
        assertEquals("asd", res);
    }

    @Test
    public void successfullyRemovingFirstElementFromList(){
        List<String> sourceData = new ArrayList<>();
        sourceData.add("1");
        sourceData.add("viskas");
        sourceData.add("chupocabra");
        sourceData.remove(0);
        assertFalse(sourceData.contains("1"));
    }


}
