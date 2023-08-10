import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> arr=new ArrayList<>();
        arr.add(-4);
        arr.add(3);
        arr.add(-9);
        arr.add(0);
        arr.add(4);
        arr.add(1);

        Result.plusMinus(arr);

    }
}
class Result{
    public static void plusMinus(List<Integer> arr) {
        int n=arr.size();

        DecimalFormat decfor=new DecimalFormat("0.000000");

        double positive=0;
        double zero=0;
        double negative=0;
        for(int i=0;i<n;i++){

            if(arr.get(i)>0)
                positive++;
            else if(arr.get(i)<0)
                negative++;
            else
                zero++;
        }
        positive/=n;
        negative/=n;
        zero/=n;
        System.out.println(decfor.format(positive));
        System.out.println(decfor.format(negative));
        System.out.println(decfor.format(zero));

    }
}