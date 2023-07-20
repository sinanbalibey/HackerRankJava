import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> a=new ArrayList<>();
        a.add(12);
        a.add(12);
        a.add(12);
        List<Integer> b=new ArrayList<>();
        b.add(7);
        b.add(6);
        b.add(5);

       List<Integer> c=Result.compareTriplets(a,b);
       for(int i=0;i<c.size();i++){
           c.get(i);
       }


       c.stream().forEach((k)->{
           System.out.print(k+" ");
       });

    }
}
class  Result{
    public static List<Integer> compareTriplets(List<Integer> a,List<Integer> b){
            List<Integer> arr=new ArrayList<>();
            int aCount=0;
            int bCount=0;
            for(int i=0;i<a.toArray().length;i++){
                if(a.get(i)>b.get(i)){
                    aCount++;
                } else if (a.get(i)<b.get(i)) {
                    bCount++;
                }
            }
            arr.add(aCount);
            arr.add(bCount);
            return arr;
    }
}