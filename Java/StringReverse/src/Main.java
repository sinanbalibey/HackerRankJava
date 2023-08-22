import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        String words=scan.nextLine();

        int i,j;
        boolean a=true;
        for(i=0,j=words.length()-1;i<words.length()&&j>=0;i++,j--){
            if(words.charAt(i)!=words.charAt(j)){
                a=false;
            }
        }
        if(a){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}