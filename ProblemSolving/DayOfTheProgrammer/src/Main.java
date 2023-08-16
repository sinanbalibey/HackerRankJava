import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int year=2000;
        boolean g= !(year%100==0)&&((year%400==0)||(year%4==0));
        System.out.println(g);
      String s=Result.dayOfProgrammer(2000);
        System.out.println(s);
    }
}

class Result {

    public static String dayOfProgrammer(int year) {
        // 1700 2700 yıllar arası
        //yılın 256. günü
        //rusya
        boolean j=year%4==0;
        boolean g= !(year%100==0)&&((year%400==0)||(year%4==0));
       if(year<1918){
           if(j){
               return "12.09."+year;
           }
           return "13.09."+year;
       }
       else if (year==1918){
            return "26.09."+year;
       }
       else if(year>1918){
           if(g|year==2000|year==2400){
               return "12.09."+year;
           }
           return "13.09."+year;
       }
        return " ";
    }
}