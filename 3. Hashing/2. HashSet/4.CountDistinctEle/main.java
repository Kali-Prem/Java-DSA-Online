import java.util.*;
public class main {
    public static void main(String[] args) {
        int num[] = {2,3,4,1,3,4,2,3,5,3,4,7};
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int x:num){
            if(!set.contains(x)){
                set.add(x);
            }
            else{
                count++;
            }
        }
        System.out.print(count);
    }
}