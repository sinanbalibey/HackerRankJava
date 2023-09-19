public class Main {
    public static void main(String[] args) {

       int a=1012;
        System.out.println(findDigits(a));

    }
    public static int findDigits(int n) {
        int count=0;
        int length=String.valueOf(n).length();

        for(int i=0;i<length;i++){
            int digit=Integer.parseInt(String.valueOf(String.valueOf(n).charAt(i)));
            if(digit!=0){
                if(n%digit==0)
                    count++;
            }

        }
        return count;
    }
}