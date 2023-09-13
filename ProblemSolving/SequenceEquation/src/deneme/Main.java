package deneme;

public class Main {

    public static void main(String[] args) {

        int[] arr = {4,2,6,0};
        insertionSort(arr);
        System.out.println("Sıralanmış Dizi:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            // key, sıralanmış bölgedeki uygun pozisyona taşınır
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

}
