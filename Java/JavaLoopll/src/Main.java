import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int q=scanner.nextInt();
        for(int j=0;j<q;j++){

            int a=scanner.nextInt();

            int b=scanner.nextInt();

            int n=scanner.nextInt();

            int sonuc=0;
            for(int i=0;i<n;i++){
                sonuc= (int) (sonuc+(b*Math.pow(2,i)));

                System.out.print((sonuc+a+" "));

            }
            System.out.println();
        }

    }
}