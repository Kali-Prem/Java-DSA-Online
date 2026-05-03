import java.util.*;
public class main {
    public static void main(String[] args) {
       HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");

        //    Triverse

        //=====Method-1(with iterator)===========
        // Iterator it = cities.iterator(); //ess it ke pass eske next value hoti hai cities ke elemet ki
        // while(it.hasNext()){
        //  System.out.println(it.next());
        // }

        // Using Advanced For loop======
        for(String s:cities){
            System.out.println(s);
        }

    }
}