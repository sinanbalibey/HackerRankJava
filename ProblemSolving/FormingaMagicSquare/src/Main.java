import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<List<Integer>> arr=new ArrayList<>();

        List<Integer> arr1=new ArrayList<>();
        arr1.add(5);
        arr1.add(3);
        arr1.add(4);
        arr.add(arr1);
        List<Integer> arr2=new ArrayList<>();
        arr2.add(1);
        arr2.add(5);
        arr2.add(8);
        arr.add(arr2);
        List<Integer> arr3=new ArrayList<>();
        arr3.add(6);
        arr3.add(4);
        arr3.add(2);
        arr.add(arr3);
        System.out.println(arr);
        // ... ... ... -->15
        // ... ... ... -->15
        // ... ... ... -->15


       for(List ar:arr){
           onBesMi(ar);
       }


    }
    public static int onBesMi(List<Integer> dizi){

        int result=0;
        for(Integer ar:dizi){
            result+=ar;
        }
        if(result!=15){
           return tamamla(dizi);
        }else {
            return 0;
        }
    }
    public static int tamamla(List<Integer> dizi){

        int result=0;
        for(int i=0;i<dizi.size();i++){

        }

        return result;
    }

    public static int formingMagicSquare(List<List<Integer>> s) {
        //15

        for(List ar:s){
            onBesMi(ar);
        }
        return 4;

    }
}