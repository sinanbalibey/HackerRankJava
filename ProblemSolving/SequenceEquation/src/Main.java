import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr=new ArrayList<>();
        List<Integer> p=new ArrayList<>();
        p.add(5);
        p.add(2);
        p.add(1);
        p.add(3);
        p.add(4);
        System.out.println("Sırasız Dizi: "+p);
        int temp=0;
        for(int i=0;i<p.size()-1;i++){

            for(int j=i+1;j<p.size();j++){
                if(p.get(j)<p.get(i)){
                    temp=p.get(i);
                    p.set(i,p.get(j));
                    p.set(j,temp);

                }
            }
            System.out.println("i: "+i+"  "+p);

        }
        System.out.println("Sıralı Dizi: "+p);
        System.out.println(arr);
    }
    public static List<Integer> permutationEquation(List<Integer> p) {
        // Write your code here
        List<Integer> arr=new ArrayList<>();

        int min=p.get(0);
        for(int i=0;i<p.size();i++){

            for(int j=1;j<p.size();j++){
                if(min<p.get(j)){
                    arr.add(2);
                }
            }
        }




        return arr;
    }

}