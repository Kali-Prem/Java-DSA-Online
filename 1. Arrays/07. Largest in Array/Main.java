/* Note:- 

  import java.util.*;

  +infinite = integer.MIN_VALUE   
  -infinite = integer.MAX_VALUE

//   This gives the minimun and maximun value of integer.


*/
public class Main {
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};

        getLargest(numbers);
        System.out.println("Largest num = " + getLargest(numbers));
        
    }
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;   // -infinity
        int smallest = Integer.MAX_VALUE;   // +infinity

        for(int i = 0; i < numbers.length; i++) {
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i] ){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest value = " + smallest);
        return largest;
    }
}