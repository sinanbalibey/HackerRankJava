import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> apple=new ArrayList<>();
        List<Integer> orange=new ArrayList<>();
      apple.add(1);
      apple.add(4);
      apple.add(4);
      orange.add(-3);
      orange.add(-2);
      orange.add(-4);

       Result.countApplesAndOranges(7,10,4,12,apple,orange);
    }
    class Result {
        public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
            //s=sam house başlangıç
            //t=sam house bitiş
            //a=elma ağacının konuum
            //b=Portakal agacı konumu
        /*    ArrayList<Integer> samHouseA=new ArrayList<>();
            ArrayList<Integer> samHouseO=new ArrayList<>();

           for(int i=0;i<apples.size();i++){
               samHouseA.add(apples.get(i)+a);
               samHouseO.add(b+oranges.get(i));
            }
            int orange=0;
            int apple=0;
            for(int i=s;i<=t;i++){
                for(int item:samHouseA){
                    if(item==i){
                        apple++;
                    }
                }
                for(int item:samHouseO){
                    if(item==i){
                        orange++;
                    }
                }
            }

            System.out.println(apple);
            System.out.println(orange);*/

          /*  int apple = 0;
            int orange = 0;

            for (int i = 0; i < apples.size(); i++) {
                int applePosition = apples.get(i) + a;
                int orangePosition = b + oranges.get(i);

                if (applePosition >= s && applePosition <= t) {
                    apple++;
                }
                if (orangePosition >= s && orangePosition <= t) {
                    orange++;
                }
            }

            System.out.println(apple);
            System.out.println(orange);*/

            int appleCount =0, orangeCount =0;

            for (Integer apple : apples) {
                if((a+apple)>=s && (a+apple <=t))
                    appleCount++;
            }

            for (Integer orange : oranges) {
                if((b+orange)>=s && (b+orange <=t))
                    orangeCount++;

            }

            System.out.println(appleCount +"\n"+orangeCount);
        }

    }
}