public class main {
    public static void main(String[] args) {
        int arr[] = {2,4,5,6,7,8};
        int n = arr.length;
        for(int i = 0 ; i < n; i++){
            System.out.println(arr[i]);
        }
        //for-each loop
        for (int x:arr){
            System.out.println(x);
        }
        // 
        for(int x1:arr){
            System.out.print(x1);
        }
    }
}