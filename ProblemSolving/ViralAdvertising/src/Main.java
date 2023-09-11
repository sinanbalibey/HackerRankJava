public class Main {
    public static void main(String[] args) {

    }

    public static int viralAdvertising(int n) {
        // Write your code here
        int shared=5;
        int liked=2;
        int totalLiked=2;

        for(int i=1;i<n;i++){

            shared=shared/2*3;
            liked=shared/2;
            totalLiked+=liked;


        }
        return totalLiked;
    }

}