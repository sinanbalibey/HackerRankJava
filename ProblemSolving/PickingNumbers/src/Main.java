import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      List<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(4);
        arr.add(4);
        arr.add(5);
        arr.add(5);
        arr.add(5);
        Collections.sort(arr);
        int count=0;
        for(int i=1;i<arr.size();i++){
            if(arr.get(i)-arr.get(i-1)<=1){
                count++;
            }
        }
        System.out.println(count);
    }
    class Result {

        public static int pickingNumbers(List<Integer> a) {
            // Write your code here
            return  3;
        }

    }
}