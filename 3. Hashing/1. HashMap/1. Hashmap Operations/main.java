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

        //Insert
        hm.put("India", 150);
        hm.put("China", 140);
        hm.put("Kali", 40);

        System.out.println(hm);

        //Get
        System.out.print(hm.get("India"));

        
    }
}
