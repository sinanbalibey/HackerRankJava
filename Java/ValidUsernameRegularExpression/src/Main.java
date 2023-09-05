import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        //8<length<30
        //length[0]=rakam olmamalıdır.
        //username rakam harf ve _ olmalıdır.
        Scanner scan=new Scanner(System.in);
        
        String s=scan.nextLine();
        System.out.println(isValid(s));



    }
    public static boolean isValid(String s){
        String number = "^[0-9]";
        String harfs="^[0-9a-zA-Z]";
        Pattern pattern = Pattern.compile(number);
        Matcher matcher = pattern.matcher(s);

        if(s.length()<8&&s.length()>30){
            return false;
        } else if (!matcher.find()&&s.equals(harfs)) {
            return true;
        }

        return  false;
    }
}