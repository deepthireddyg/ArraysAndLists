public class AverageDoubleArrays {


// Complete these methods

    public int count(double[] aa)
    {
        return aa.length;

    }

    public int  sum(double[] aa) {

        double result = 0;
        for (double value : aa)
            result += value;
        return (int) result;
    }

    public int average(double[] aa) {
        if(aa.length>0)
        return Math.round(sum(aa) / aa.length);
        else
        return 0;
    }

}
