import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //char boolean byte short int long float double
        //8 bit = 1 Byte
        //byte 8 bit  -128 to 127
        //short 16 bit  -32.768 to 32767
        //int 32 bit    -2^31 to 2^31-1
        //long 64 bit  -2^63 to 2^63-1

        Scanner scan=new Scanner(System.in);

        int n=scan.nextInt();
        scan.nextLine();
        for(int i=0;i<n;i++){
            String value=scan.nextLine();
            try{
                Long variable=Long.parseLong(value);
                System.out.println(variable+" can be fitted in:");
                if(variable>= (-Math.pow(2,7))&&variable<=(Math.pow(2,7)-1)){
                    System.out.println("* byte");
                }
                if(variable>=(-Math.pow(2,15))&& variable<=(Math.pow(2,15)-1)){
                    System.out.println("* short");
                }
                if(variable>=(-Math.pow(2,31))&& variable<=(Math.pow(2,31)-1)){
                    System.out.println("* int");
                }
                if(variable>=(-Math.pow(2,63))&& variable<=(Math.pow(2,63)-1)){
                    System.out.println("* long");
                }
            }catch (Exception e){
                System.out.println(value+" can't be fitted anywhere.");
            }

        }

    }
}