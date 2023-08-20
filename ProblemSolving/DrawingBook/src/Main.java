public class Main {
    public static void main(String[] args) {
       int a=Result.pageCount(5,4);
        System.out.println(a);
    }
}
class Result {
    public static int pageCount(int n, int p) {
        // Write your code here
        //n=kitabın uzunluğu
        //p geçmek istediği sayfa sayısı
        //return çevirilecek sayfa sayısı
        int count=0;
        for(int i=2;i<n;i=i+2){
            count++;
            if(i==p||i+1==p)
                break;
        }
        return count;
    }

}