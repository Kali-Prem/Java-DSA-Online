public class Main1{
    public static void main(String[] args) {
        int number[] = {2, 4, 7, 9, 39};
        System.out.print("Largest Numbers" +largestNo(number));

        

    }
    public static int largestNo(int number[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < number.length; i++){
            if(number[i] > largest){
                largest = number[i];
            }
            if(number[i] < smallest){
                smallest = number[i];
            }
        }
        System.out.println("smallest= " + smallest);
        return largest;
        
    }
}