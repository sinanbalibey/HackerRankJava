import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int breadth= scn.nextInt();
        int height=scn.nextInt();

        if(breadth>0&&height>0)
        {

            System.out.println(breadth*height);
        }
        else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

    }
}