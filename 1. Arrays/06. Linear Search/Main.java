// Question:- Find a key in the given numbers[] array using linear search and return the index of key if found otherwise return -1.

public class Main {
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 2;
        linearSearch(numbers, key);
        int index = linearSearch(numbers, key);
        if(index == -1){
            System.out.print("Key Not Found");
        }
        else{
            System.out.print("Key found at =" + index);
        }
    }
    public static int linearSearch(int numbers[], int key){
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
}