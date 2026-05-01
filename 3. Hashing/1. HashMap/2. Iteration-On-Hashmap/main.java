import java.util.*;
public class main {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 120);
        hm.put("China", 150);
        hm.put("Indonesia", 110);
        hm.put("USA", 100);


        //Iterate
        Set<String> keys = hm.keySet(); //keySet pehle hm hashmap se sare keys ko lekr ess key ke set me put krte jayega
        System.out.println(keys); // This print the set

        for(String k : keys){
            System.out.println("key=" + k + "," + "value=" + hm.get(k)); // Iteration print the speific value of the set
        }

    }
}