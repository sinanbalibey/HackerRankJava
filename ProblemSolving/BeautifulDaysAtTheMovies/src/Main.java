import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        int a= beautifulDays(20,23,6);
        System.out.println(a);

    }
    public static int reverseInt(int sayi){
        int reverse=0;

        while (sayi!=0){
            int sonRakam=sayi%10;
            reverse=reverse*10+sonRakam;
            sayi=sayi/10;
        }
        return reverse;
    }
    public static int beautifulDays(int i, int j, int k) {
        // Write your code here
        int count=0;
        while (i<=j){
            if(Math.abs(i-reverseInt(i))%k==0){
                count++;
            }
            i++;
        }
        return count;
    }
}