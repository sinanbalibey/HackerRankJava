import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {


        String path="DUDDDUUDUU";
        int steps=10;
        int b=0;
        int countt=0;
        List<Integer> arr=new ArrayList<>();

        for(int i=0;i<steps;i++){

            if(path.charAt(i)=='U'){
                b++;
                arr.add(b);

            }else if(path.charAt(i)=='D'){
                b--;
                arr.add(b);
            }

            if(arr.get(i)==0&&arr.get(i-1)<0)
                countt++;

        }

       System.out.println(arr);
        int count=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==0&&arr.get(i-1)<0){
                count++;
            }
        }

        System.out.println(count);
        System.out.println(countt);

    }
}

class Result {
    //yukarı==>U
    //assagi==>D
    public static int countingValleys(int steps, String path) {

        int b=0;
        int count=0;
        List<Integer> arr=new ArrayList<>();

        for(int i=0;i<steps;i++){

            if(path.charAt(i)=='U'){
                b++;
                arr.add(b);

            }else if(path.charAt(i)=='D'){
                b--;
                arr.add(b);
            }

            if(arr.get(i)==0&&arr.get(i-1)<0)
                count++;

        }
        return count;
    }

}