import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    List<Integer> arr=new ArrayList<>();

        arr.add(10);
        arr.add(20);
        arr.add(20);
        arr.add(10);
        arr.add(10);
        arr.add(30);
        arr.add(50);
        arr.add(10);
        arr.add(20);

        Collections.sort(arr);
        System.out.println(arr);
        int couple=0;
        for(int i=1;i<arr.size();i++){
            if(arr.get(i)==arr.get(i-1)){
                couple++;
                i++;
            }

        }
        System.out.println(couple);
    }
}
class Result {

    public static int sockMerchant(int n, List<Integer> ar) {
        Collections.sort(ar);
        int couple=0;
        for(int i=1;i<n;i++){
            if(ar.get(i)==ar.get(i-1)){
                couple++;
                i++;
            }
        }

        return couple;
    }

}
/*      arr.add(4);arr.add(4);arr.add(4);arr.add(4);arr.add(4);
        arr.add(5);arr.add(5);arr.add(5);arr.add(5);arr.add(5);arr.add(5);
        arr.add(6);arr.add(6);arr.add(6);arr.add(6);arr.add(6);
        arr.add(1);arr.add(1);
        arr.add(3);arr.add(3);*/