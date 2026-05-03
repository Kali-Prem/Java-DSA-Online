// LinkedHashMap :- is a type of hashmap which is used to maintain the order of key;


import java.util.*;
public class main {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lm = new LinkedHashMap<>();
        lm.put("Mango", 20);
        lm.put("Grapes", 30);
        lm.put("Guava", 40);
        lm.put("Apple", 50);

        System.out.println(lm);
    }
}