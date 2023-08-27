import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String a=scan.nextLine();
        String b=scan.nextLine();


        a=a.toLowerCase();
        b=b.toLowerCase();

        char[] arra=a.toCharArray();
        char[] arrb=b.toCharArray();

        Arrays.sort(arra);
        Arrays.sort(arrb);

        a=new String(arra);
        b=new String(arrb);
       
        if(a.equals(b)){
            System.out.println("Anagrams");
        }else {
            System.out.println("Not Anagrams");
        }
        System.out.println(a.equals(b));
       /* int i,j;
        int count=0;
        for(i=0,j=b.length()-1;i<a.length()&&j>=0;i++,j--){
            if(a.charAt(i)==b.charAt(j)){
                count++;
            }
        }
        if(count==a.length()){
            System.out.println("Anagrams");
        }else {
            System.out.println("Not Anagrams");
        }*/





    }

}