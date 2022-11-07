import java.util.ArrayList;
import java.text.DecimalFormat;

public class AverageDoubleLists {

    // write out these too
    public Double count(ArrayList<Double> aa) {

        return Double.valueOf((aa.size()));
    }
    public Double sum(ArrayList<Double> aa) {

        double sum = 0.0;
        for(double d : aa) {
            sum += d;
        }
        return (double) Math.round(sum * 100)/100;
    }
    public Double average(ArrayList<Double> aa) {
        double sum = 0.0;
        for(double d : aa) {
            sum += d;
        }
        double avg = sum/aa.size();

        return (double) Math.round (avg * 100)/100;
    }

}
