import java.util.ArrayList;

public class AverageIntegerLists {


    public int count(ArrayList<Integer> aa) {

        return aa.size();
    }

    public int sum(ArrayList<Integer> aa) {
         int total = 0;
        for(int i =0;i< aa.size();i++){
            total = total + aa.get(i);
        }
        return total;
    }

    public int average(ArrayList<Integer> aa) {
        int total = 0;
        if(aa.size() == 0)
            return 0;
        
        for(int i = 0; i<aa.size();i++) {
            total = total + aa.get(i);
        }
        int avg = total/aa.size();

        return avg;
    }
}
