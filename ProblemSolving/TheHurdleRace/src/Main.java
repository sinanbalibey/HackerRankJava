import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(6);
        arr.add(3);
        arr.add(5);
        arr.add(2);


        int a=hurdleRace(4,arr);
        System.out.println(a);
    }
    public static int hurdleRace(int k, List<Integer> height) {

        int result =0;
        int enBuyuk=height.get(0);
        for(int i=0;i<height.size();i++){
            if(height.get(i)>enBuyuk){
                enBuyuk=height.get(i);
            }
        }
        if(enBuyuk>=k){
            result=enBuyuk-k;
        }else {
            result=0;
        }


        return result;
    }
}