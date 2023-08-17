
import java.time.DayOfWeek;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {


        String a=Result.findDay(8,05,2015);
        System.out.println(a);
    }
}
class Result {

    public static String findDay(int month, int day, int year) {

        LocalDate tarih = LocalDate.of(year, month, day);
        DayOfWeek gunAdi = tarih.getDayOfWeek();

        return String.valueOf(gunAdi);
    }

}