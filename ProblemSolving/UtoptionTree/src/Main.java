public class Main {
    public static void main(String[] args) {

        int a=utopianTree(3);
        System.out.println(a);
    }

    public static int utopianTree(int n) {
        // Write your code here
        //spring--> *2
        //summer-->+1
        //baslangıc=1 metre
        //

            int H=1;
            for(int i=1;i<=n;i++){
                if(i%2==1){
                    H=H*2;
                }
                else {
                    H=H+1;
                }
                System.out.println(i+": "+H);
            }

            return H;

    }
}