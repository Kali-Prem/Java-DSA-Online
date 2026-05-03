import java.util.*;
public class main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(2); //duplicate not get inserted
        set.add(1);

        System.out.print(set);

        // contains(key);
        set.contains(2); //true
        set.contains(8); //false
        System.out.print(set.contains(2)); //true


        // remove(key);
        set.remove(2);
        System.out.println(set);

        System.out.println(set.isEmpty()); //false
        System.out.println(set.size());
        
        set.clear();
        System.out.println(set.isEmpty()); //True

    }
}
