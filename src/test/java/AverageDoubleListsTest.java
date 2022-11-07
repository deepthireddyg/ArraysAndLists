import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class AverageDoubleListsTest {

    @Test
    void count() {
        ArrayList<Double> aa=new ArrayList<Double>(Arrays.asList(5.60,7.80,9.20));
        Double expected=3.00;
        AverageDoubleLists obj=new AverageDoubleLists();
        assertEquals(expected, obj.count(aa));
    }

    @Test
    void sum() {
        ArrayList<Double> aa=new ArrayList<Double>(Arrays.asList(5.60,4.80,9.20));
        Double expected=19.60;
        AverageDoubleLists obj=new AverageDoubleLists();
        assertEquals(expected, obj.sum(aa));
    }



    @Test
    void average() {
        ArrayList<Double> aa=new ArrayList<Double>(Arrays.asList(5.60,4.80,9.20));
        Double expected=6.53;
        AverageDoubleLists obj=new AverageDoubleLists();
        assertEquals(expected, obj.average(aa));

    }
}