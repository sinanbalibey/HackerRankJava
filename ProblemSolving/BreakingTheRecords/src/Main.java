import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr=new ArrayList<>();
        arr.add(3);
        arr.add(4);
        arr.add(21);
        arr.add(36);
        arr.add(10);
        arr.add(28);
        arr.add(35);
        arr.add(5);
        arr.add(24);
        arr.add(42);

       /* arr.add(10);
        arr.add(5);
        arr.add(20);
        arr.add(20);
        arr.add(4);
        arr.add(5);
        arr.add(2);
        arr.add(25);
        arr.add(1);*/

      /*  arr.add(12);
        arr.add(24);
        arr.add(10);
        arr.add(24);*/
        List<Integer> a=Result.breakingRecords(arr);
        System.out.println(a);
        
    }
}
class Result {


    public static List<Integer> breakingRecords(List<Integer> scores) {

        List<Integer> arr=new ArrayList<>();
        int min,max;
        int sayacMax=0;
        int sayacMin=0;
        min=scores.get(0);
        max=scores.get(0);
        for(int i=1;i<scores.size();i++){

            if(scores.get(i)>max){
                max=scores.get(i);
                sayacMax++;
            }
            else if(scores.get(i)<min){
                min=scores.get(i);
                sayacMin++;
            }
        }

            arr.add(sayacMax);
            arr.add(sayacMin);

        return arr;
    }

}