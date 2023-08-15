import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(4);
        arr.add(4);
        arr.add(4);
        arr.add(5);
        arr.add(3);
        int a= Result.migratoryBirds(arr);
        System.out.println(a);




    }
}
class Result {

    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
        int type1=0;
        int type2=0;
        int type3=0;
        int type4=0;
        int type5=0;
        List<Integer> arrTip=new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            switch (arr.get(i)){
                case 1:
                    type1++;
                    break;
                case 2:
                    type2++;
                    break;
                case 3:
                    type3++;
                    break;
                case 4:
                    type4++;
                    break;
                case 5:
                    type5++;
                    break;
            }
        }
        arrTip.add(type1);
        arrTip.add(type2);
        arrTip.add(type3);
        arrTip.add(type4);
        arrTip.add(type5);

        int maxIndex=0;
        int maxValue=arrTip.get(0);

        for(int i=1;i<arrTip.size();i++){
            if(arrTip.get(i)>maxValue){
                maxValue=arrTip.get(i);
                maxIndex=i;
            }
        }
        return maxIndex+1;
    }

}