/*

Hashmap <Key_Datatype, Value_Datatype> hm = new Hashmap<>();

put(key,value)
get(key)
containsKey(key)
remove(key)

*/


// Create Hashmap and store the country data and number of that country

import java.util.*;
public class main{
    public static void main(String[] args) {
        // cREATE
        HashMap<String, Integer> hm = new HashMap<>();              // Memonry ke andr khali HASHMAP BN GYA HAI 

        //Insert - O(1)
        // Store Data Randomly
        hm.put("India", 150);
        hm.put("China", 140);
        hm.put("Kali", 40);
        hm.put("USA", 120);

        System.out.println(hm);

        //Get - O(1)
        int population = hm.get("China");
        System.out.println(population);

        System.out.println(hm.get("India"));
        System.out.println(hm.get("Kali"));

        System.out.println(hm.get("Indonesia")); // return - null value because the key is not present in tha map
        

        // ContainsKey(key) - O(1)
        System.out.println(hm.containsKey("India"));     //Return -  True
        System.out.println(hm.containsKey("Indonesia")); // Return -False
        

        // Remove 
        hm.remove("China");
        System.out.println(hm);  

        // Size
        System.out.println(hm.size());

        // IsEmpty
        System.out.println(hm.isEmpty()); //False

        // Clear
        hm.clear(); //Clear the map means remove all the data of map
        System.out.println(hm);
    }
}
