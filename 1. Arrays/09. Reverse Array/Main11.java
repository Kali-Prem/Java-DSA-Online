// Approach : 1. Create a copy and then put all.
// Note:- This is the worst case
// T.C = O(n);
// S.C = O(n);


// That's why we will use the second method which T.C will be O(n) but S.C will be O(1).


// ============Method 1- Worst Case=================
/*
public class Main11 {
    public static void main(String[] args){
        int num[] = {2, 3, 5, 8, 10};
        int n = num.length;
        int copy[] = new int[n];
        int j = 0;
        for(int i = n-1; i>= 0; i--){
            copy[j] = num[i];
            j++;
        }
        for(int i = 0; i < n; i++){
            num[i] = copy[i];
            System.out.print(" "+ num[i]);
        }
        
        
        

    }
}
*/


// ===============Method 2 - Optimized Case============
public class Main11 {
    public static void main(String[] args){
        int num[] = {2, 3, 5, 8, 10};
        reverseNo(num);

    }
    public static void reverseNo(int num[]){
        int first = 0, last = num.length-1;
        while(first<last){
            int temp = num[first];
            num[first] = num[last];
            num[last] = temp;
            first++;
            last--;

        }
        for(int i = 0; i < num.length; i++){
            System.out.print(" "+ num[i]);
        }
    }
}
