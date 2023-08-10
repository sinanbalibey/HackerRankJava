import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<List<Integer>> aList= new ArrayList<>();

        ArrayList<Integer> a1=new ArrayList<>();
        a1.add(11);
        a1.add(2);
        a1.add(4);
        aList.add(a1);

        ArrayList<Integer> a2=new ArrayList<>();
        a2.add(4);
        a2.add(5);
        a2.add(6);
        aList.add(a2);

        ArrayList<Integer> a3=new ArrayList<>();
        a3.add(10);
        a3.add(8);
        a3.add(-12);
        aList.add(a3);

        Result.diagonalDifference(aList);
    }
}
class Result{
    public static int diagonalDifference(List<List<Integer>> arr){
            int rightLeft=0;
            int leftRight=0;
            for(int i=0;i< arr.size();i++){
                leftRight+=arr.get(i).get(i);
            }
            for(int i=arr.size()-1;i>=0;i--){
                rightLeft+=arr.get(i).get(arr.size()-1-i);
            }
        return Math.abs(rightLeft-leftRight);
    }
}