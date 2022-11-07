public class AverageIntArrays {

// Complete these methods

    public int count(int[] aa) {

        return aa.length;
    }

    public int sum(int[] aa) {
        int total = 0;
        for(int i = 0;i<aa.length;i++){
            total = total + aa[i];
        }

        return total;
    }

    public int average(int[] aa) {
        int total = 0;

        if(aa.length == 0)
            return 0;

        for(int i=0;i<aa.length;i++){
            total = total +aa[i];
            }
         int avg = total / aa.length;

        return avg;
    }

}
