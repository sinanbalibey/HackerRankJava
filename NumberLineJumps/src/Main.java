public class Main {
    public static void main(String[] args) {

       String a= Result.kangaroo(43,2   ,70,2);

        System.out.println(a);
    }
    class Result {
        public static String kangaroo(int x1, int v1, int x2, int v2) {


            if(v2>v1||v2==v1){
                return "NO";
            }
            else if((x2-x1)%(v1-v2)==0){
                return "YES";
            }
                return "NO";
        }

    }
    // Write your code here
    //x1 başlangıç,v1 zıplaması
    //x2 başlanıg,v2 zıplaması
    //0<=x1<x2<=10000

    //1<=v1<=10000
    //1<=v2<=10000
}