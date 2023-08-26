import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //1,2-3,4-5,6-7;
        //1,2-3,4-5,6-7,8;

        int n=4;
        int p=4;
        int count1=0;
        int count2=0;
        if(n%2==0){
            for(int i=1;i<n;i=i+2){
                if(p==i||p==i-1)
                    break;

                count1++;
            }
            for(int i=n;i>=1;i=i-2){
                if(p==i||p==i+1)
                    break;

                count2++;
            }
        }else {
            for(int i=1;i<n;i=i+2){
                if(p==i||p==i-1)
                    break;

                count1++;
            }
            for(int i=n;i>=1;i=i-2){
                if(p==i||p==i-1)
                    break;

                count2++;
            }
        }



        System.out.println("count1: "+count1);
        System.out.println("count2: "+count2);

    }
}
class Result {
    public static int pageCount(int n, int p) {
        //n=kitabın uzunluğu
        //p geçmek istediği sayfa sayısı
        //return çevirilecek sayfa sayısı
        int count1=0;
        int count2=0;
        if(n%2==0){
            for(int i=1;i<n;i=i+2){

                if(p==i||p==i-1)
                    break;
                count1++;
            }
            for(int i=n;i>=1;i=i-2){

                if(p==i||p==i+1)
                    break;

                count2++;
            }
        }else{
            for(int i=1;i<n;i=i+2){
                if(p==i||p==i-1)
                    break;

                count1++;
            }
            for(int i=n;i>=1;i=i-2){
                if(p==i||p==i-1)
                    break;

                count2++;
            }
        }

        if(n%2==1&&p==n-1){
            count2=0;
        }

        return count1<=count2?count1:count2;
    }

}