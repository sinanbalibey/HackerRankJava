import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int a= scan.nextInt();

        int b=scan.nextInt();

       int toplam= solveMeFirst(a,b);

        System.out.println(toplam);
    }
    static int solveMeFirst(int a,int b){

        return (a+b);
    }

}