import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> arr= new ArrayList<>();
        arr.add(0);
        arr.add(-1);
        arr.add(2);
        arr.add(1);
        String s=angryProfessor(2,arr);
        System.out.println(s);


    }
    public static String angryProfessor(int k, List<Integer> a) {
        // Write your code here
        //k=> eşik öğrenci sayısı
        //a öğrenci varış zamanı
        //a[i]>0 öğrencinin a[i] dakika geciktiğini gösterir.

        int gelen=0;
        for(int i=0;i<a.size();i++){
            if(a.get(i)<=0)
                gelen++;
        }

        if(gelen<k){
            return "YES";
        }else
            return "NO";

    }
}