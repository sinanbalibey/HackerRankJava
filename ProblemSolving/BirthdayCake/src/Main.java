import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> arr=new ArrayList<>();

        arr.add(4);
        arr.add(4);
        arr.add(4);
        arr.add(4);

        Collections.sort(arr);
        int tekrar=1;
        for(int i=arr.size()-1;i>0;i--){
            if(arr.get(i)==arr.get(i-1))
                tekrar+=1;
        }
        System.out.println(tekrar);
    }
}
class Result{
    public static int birthdayCakeCandles(List<Integer> candles){
        Collections.sort(candles);
        int tekrar=1;
        for(int i=candles.size()-1;i>0;i--){
            if(candles.get(i)==candles.get(i-1))
                tekrar+=1;
        }

        return tekrar;
    }
}