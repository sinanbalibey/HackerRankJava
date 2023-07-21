import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Result{


    public static long aVeryBigSum(List<Long> ar){
        long sum=0;

        for(long a: ar ){
            sum+=a;
        }

        return sum;
    }
}