// Binary search is only applicable on sorted Array
// We take Start(index 0) and End(total Index) point to search in Binary Search and then calculate the mid index of that array by mid = (end+start) / 2;
public class Main {
    public static void main(String[] args) {
        int num[] = {2, 4, 5, 7, 8, 9, 10, 12, 15, 17, 18};
        int key = 15;
        System.out.print(binarySearch(num, key));
    }
    public static int binarySearch(int num[], int key){
        int start = 0, end = num.length-1;
       
        while(start <= end){
            int mid = (start+end) / 2;
            if(key == num[mid]) return mid;
            if(key < num[mid]) end = mid -1;
            else start = mid + 1;

        }
        return -1;
        
    
    }
}