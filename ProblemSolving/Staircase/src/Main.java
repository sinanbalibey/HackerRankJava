public class Main {
    public static void main(String[] args) {

        Result.staircase(4);

    }
}
class Result{

    public static void staircase(int n){

        for(int i = n; i >= 1; i--)
        {
            for(int j = 1; j <= n; j++)
            {
                if(j >= i) System.out.print("#");
                else System.out.print(" ");
            }
            System.out.println();
        }



    }
}