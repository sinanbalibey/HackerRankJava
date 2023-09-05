import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<List<Integer>> arr = new ArrayList<>();
        //5
        List<Integer> arr1 = new ArrayList<>();
        arr1.add(4);
        arr1.add(5);
        arr1.add(8);//5
        arr.add(arr1);
        List<Integer> arr2 = new ArrayList<>();
        arr2.add(2);
        arr2.add(4);
        arr2.add(1);//12
        arr.add(arr2);
        List<Integer> arr3 = new ArrayList<>();
        arr3.add(1);
        arr3.add(9);
        arr3.add(7);//3
        arr.add(arr3);
        System.out.println(arr);
        int a=formingMagicSquare(arr);
        System.out.println(a);

    }
    public static int formingMagicSquare(List<List<Integer>> s) {
        // 3x3 bir sihirli kareyi temsil eden olası kombinasyonları tanımlayın
        int[][][] magicSquares = {
                {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
                {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
                {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
                {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
                {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
                {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},
                {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}},
                {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}}
        };

        int minCost = Integer.MAX_VALUE; // Minimum maliyeti başlangıçta sonsuz olarak ayarlayın

        // Her bir sihirli kare kombinasyonunu kontrol edin
        for (int[][] magicSquare : magicSquares) {

            int cost = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    // Girdi matrisi ile sihirli kareyi karşılaştırın ve farkları toplayın
                    cost += Math.abs(s.get(i).get(j) - magicSquare[i][j]);
                }
            }
            // Minimum maliyeti güncelleyin
            minCost = Math.min(minCost, cost);
        }

        return minCost;
    }

}


        /*
       // arr.get(1).set(1, 5);
        int sonuc=0;
        int midNotNine=0;
        int  k=0;
        if(arr.get(1).get(1)!=5){
            midNotNine=arr.get(1).get(1)-(arr.get(1).get(1)-5);
            k=arr.get(1).get(1)-5;
            arr.get(1).set(1,midNotNine);
            for(int i=0;i<arr.size();i++){
                int result=0;

                for (int j =0;j<arr.size();j++){
                    result+= arr.get(i).get(j);
                }
                if(15-result!=0){
                    sonuc=sonuc+Math.abs(15-result);
                }

            }
            //8  1  2
        sonuc=sonuc+(k);
        }else {
            for(int i=0;i<arr.size();i++){
                int result=0;

                for (int j =0;j<arr.size();j++){
                    result+= arr.get(i).get(j);
                }
                if(15-result!=0){
                    sonuc=sonuc+Math.abs(15-result);
                }

            }
        }

        System.out.println(sonuc);
        System.out.println(arr);

    }

    public static int formingMagicSquare(List<List<Integer>> s) {

        int sonuc=0;
        for(int i=0;i<s.size();i++){
            int result=0;
            for (int j =0;j<s.size();j++){
                result+= s.get(i).get(j);
            }
            if(15-result!=0){
                sonuc=Math.abs(sonuc+15-result);
            }
        }

        return sonuc;

    }
}*/