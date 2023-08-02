import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       List<Integer> arr=new ArrayList<>();
       arr.add(4);
       arr.add(73);
       arr.add(67);
       arr.add(38);
       arr.add(33);

        List<Integer> arr2=Result.gradingStudents(arr);
        System.out.println(arr2);
    }
    class Result {
        public static List<Integer> gradingStudents(List<Integer> grades) {
            List<Integer> arr=new ArrayList<>();

            for(int i=0;i<grades.size();i++){
                if(grades.get(i)<38){
                    arr.add(grades.get(i));
                }
                else if(grades.get(i)%5==4){
                    arr.add(grades.get(i)+1);
                }
                else if(grades.get(i)%5==3){
                    arr.add(grades.get(i)+2);
                }
                else{
                    arr.add(grades.get(i));
                }
            }
            return arr;

        }

    }
}