import java.util.*;
public class main {
    public static void main(String[] args) {
        int num1[] = {3,5,6,7,8};
        int num2[] = {1,2,3,4,5,6,7};

        // Union- union is a set of all the element but only take unique
        HashSet<Integer> set = new HashSet<>();
        for(int ele:num2){
            set.add(ele);
        }
        // Union of Set
        for(int ele:num1){
            set.add(ele);
        }
        System.out.println("Union of set=" + set);

        // Intersection of Set--> intersection also take unique element
        set.clear();
        for(int ele:num1){
            set.add(ele);
        }
        int count = 0;
        for(int ele:num2){
            if(!set.contains(ele)){
                set.add(ele);
            }
            else{
                count++;
                System.out.println(ele);
            }
            
        }
        System.out.println("Intersection="+ count);
    }
}