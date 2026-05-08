
import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'c', 'd'};
        String str = "abcd";
        String str2 = new String("xyz");


        // strings are IMMUTABLE(pure bne string me hum change nhi kr skte)
        

        // Taking INPUT in String
        Scanner sc  = new Scanner(System.in);
        // String name = sc.next(); // only take one word
        String name = sc.nextLine(); //nextline takes complete line which is type
        System.out.println(name);


        // Length() - string me length ek function hota hai esliye hume braceket lgana prta hai 
        String fullName = "Kali Linux";
        int n = fullName.length();
        System.out.println(fullName.length());
        System.out.println(n);  
    }
    
}