
import java.util.*;

public class main {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>(); //Unordered
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");

        LinkedHashSet<String> lhs = new LinkedHashSet<>(); //Maintain Order
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bengaluru");

        TreeSet<String> ts = new TreeSet<>();  //Sorted in ascending order
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("Bengaluru");


        System.out.println(cities);
        System.out.println(lhs);
        System.out.println(ts);
    }
}