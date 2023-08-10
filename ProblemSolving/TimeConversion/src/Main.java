import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.SimpleTimeZone;

public class Main {
    public static void main(String[] args) {
        String s=Result.timeConversion("07:05:45PM");
        System.out.println(s);
    }
    class Result{
        public static String timeConversion(String s) {
            int saat=Integer.parseInt(s.substring(0,2))%12;
            if(s.endsWith("PM"))
                saat+=12;
            return String.format("%02d",saat)+s.substring(2,8);
        }

    }
}
