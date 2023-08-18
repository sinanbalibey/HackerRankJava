import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String A=scan.nextLine();
        String B=scan.nextLine();
        System.out.println(A.length()+B.length());
        int twoTask=A.compareTo(B);

        if(twoTask>0){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        String firstA= String.valueOf(A.toUpperCase().charAt(0));
        String firstB=String.valueOf(B.toUpperCase().charAt(0));
        System.out.println(firstA+A.substring(1).toLowerCase()+" "+firstB+B.substring(1).toLowerCase());

    }
}