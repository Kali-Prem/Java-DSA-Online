public class Main {
    public static void main(String[] args) {
        int num[] = {2, 3, 6, 7, 8, 9};
        printPairs(num);

    }
    public static void printPairs(int num[]){
        int n = num.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                System.out.print("(" + num[i] + num[j]+")" + " ");

            }
        }

    }
}