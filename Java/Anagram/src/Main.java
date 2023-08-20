import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String a=scan.nextLine();
        String b=scan.nextLine();

        List<String> a1=new ArrayList<>();
        List<String> b1=new ArrayList<>();



        for(int i=0;i<a.length();i++){
            a1.add(i, String.valueOf(a.charAt(i)));
            b1.add(i,String.valueOf(b.charAt(i)));
        }
        Collections.reverse(b1);
        int temp=0;

        System.out.println(temp);
        System.out.println(a1);
        System.out.println(b1);


    }
}