import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
class Result {

    /*
     * Complete the 'bonAppetit' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY bill
     *  2. INTEGER k
     *  3. INTEGER b
     */

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here
        //k=annanın yemediği
        //b annanın ödüyeceği

        int n=bill.size();
        int toplamAnna=0;
        for(int i=0;i<n;i++){
            toplamAnna+=bill.get(i);
        }

        if((toplamAnna-bill.get(k))/2==b){
            System.out.println("Bon Appetit");
        }
        else {
            System.out.println(b-(toplamAnna-bill.get(k))/2);
        }
    }

}