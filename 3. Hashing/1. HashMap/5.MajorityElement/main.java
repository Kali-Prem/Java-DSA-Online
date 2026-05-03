
import java.util.HashMap;

public class main {
    public static void main(String[] args) {
        int nums[] = {1,2,3,1,2,4,5,6,1,1,1};
        int n = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int x = nums[i];

            hm.put(x,hm.getOrDefault(x, 0)+1);

            // if(hm.containsKey(x)){
            //     hm.put(x, hm.get(x) + 1);
            // }
            // else{
            //     hm.put(x,1);
            // }

        }
        for(int k:hm.keySet()){
            if(hm.get(k) > n/3){
                System.out.println(k);
            }
        }
    }
}