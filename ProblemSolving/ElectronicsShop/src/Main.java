public class Main {
    public static void main(String[] args) {
        int b=60;
        int[] klavye={40,50,60};
        int [] drives={5,8,12};

        int big=0;
        for(int i=0;i<klavye.length;i++){
            for(int j=0;j<drives.length;j++){
                if(klavye[i]+drives[j]<=b&&klavye[i]+drives[j]>big){
                    big=klavye[i]+drives[j];
                }
            }
        }
        System.out.println(big>0? big:-1);
    }
    public class Solution {
        static int getMoneySpent(int[] keyboards, int[] drives, int b) {

            int big=0;
            for(int i=0;i<keyboards.length;i++){
                for(int j=0;j<drives.length;j++){
                    if(keyboards[i]+drives[j]<=b&&keyboards[i]+drives[j]>big){
                        big=keyboards[i]+drives[j];
                    }
                }
            }

            return big>0?big:-1;
        }
    }

}


