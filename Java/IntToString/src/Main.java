import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        try {
            String s=new String(String.valueOf(a));
            System.out.println("Good job");
        }catch (Exception e){
            System.out.println("Wrong answer");
        }
    }
}