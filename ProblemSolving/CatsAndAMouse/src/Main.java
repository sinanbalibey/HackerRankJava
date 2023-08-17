public class Main {
    public static void main(String[] args) {

       String s= catAndMouse(1,3,2);
        System.out.println(s);
    }
    static String catAndMouse(int x, int y, int z) {
        //fare hareket edemıyor
        //kediler eşit hızda
        //hangi kedinin fareye daha hızlı ulaşacagı
        //eğer ikiside aynı anda ulaşırsa fare kaçacak kediler fight
        //x,y Kedi  z fare
        //ilk hangi Kedi yakalarsa örneğin y yakaladı RETURN "CAT B"
        //eğer kediler eşit mesafe de ise RETURN "MOUSE C"

        int a=Math.abs(x-z);
        int b=Math.abs(y-z);

        if(a<b){
            return "Cat A";
        }else if(b<a){
            return "Cat B";
        }
        else{
            return "Mouse C";
        }

    }
}