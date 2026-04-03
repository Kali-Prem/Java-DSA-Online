public class Main {
    public static void main(String[] args) {
        int num[] = {2, 3, 6, 7, 8, 9};
        printPairs(num);

    }
    public static void printPairs(int num[]){
        int n = num.length;
        int tp = 0; //total pairs also can be calculated
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                System.out.print("(" + num[i] + "," + num[j]+")" + " ");
                tp++;

            }
            System.out.println();
        }
        System.out.print("Total pairs : "+ tp);

    }
}