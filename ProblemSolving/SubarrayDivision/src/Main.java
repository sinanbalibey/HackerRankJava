import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(1);
        Result.birthday(arr,3,2);

    }
}
class Result {
    public static int birthday(List<Integer> s, int d, int m) {
        //d==Ron'un doğum günü==toplamları
        //m=Ron'un dogum ayı==verilecek kare sayısı
        //s==> çikolatadaki karelerinin her biri üzerindeki sayılar

        int result=0;
        int count=0;
        for(int i=0; i<s.size()-m+1; i++){
            for(int j=i; j<i+m; j++){
                count+=s.get(j);
            }
            if(count==d){
                result++;
            }
            count=0;
        }
        return result;
    }

}