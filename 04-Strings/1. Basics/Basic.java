
import java.util.*;

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


        // Length() - string java me ek class hoti hai esliey java me string me length ek function hota hai esliye hume braceket lgana prta hai 
        String fullName = "Kali Linux";
        int n = fullName.length();
        System.out.println(fullName.length());
        System.out.println(n);  

        // Concatenation -> ek string ko dusre ke saath jorna
        String fistName = "Kali";
        String lastName = "Linux";
        String FullName = fistName + " " + lastName;
        System.out.println(FullName);   // Kali Linux


        // s.charAt(index)
        System.out.println(FullName.charAt(2));
        

        // Print all char of string
        String st = "My Name is Kali";
        int m = st.length();
        for(int i = 0; i < m; i++){
            System.out.print(st.charAt(i)+ " ");
        }
        


        // ===========CHECK IF A STRING IS A  PALINDROME=========
            // Example:- "racecar" , "noon", "madam"
        String str1 = "racecar";
        int n1 = str1.length();
        int low = 0;
        int high = n1-1;
        boolean check = true;
        while(low < high){
            if(str1.charAt(low) != str1.charAt(high)){
                check = false;
                break;
            }
            else{
                low++;
                high--;
            }
        }
        System.out.println(check);






        // ============Given a route containing 4 directions (E,W,N,S).fIND the shortest path to reach destination

        String str3 = "WNEENESENNN";
        int n3 = str3.length();
        int x = 0, y = 0;
        for(int i = 0; i < n3; i++){
            char ch1 = str3.charAt(i);
            if(ch1 == 'E'){
                x = x + 1;
            }
            else if(ch1 == 'W'){
                x = x - 1;
            }
            else if(ch1 == 'N'){
                y = y + 1;
            }
            else if(ch1 == 'S'){
                y = y - 1;
            }
        }
        int x1 = x*x, y1 = y*y;
        float path = (float)Math.sqrt(x1 + y1);
        System.out.println(path);
        // Note:- first make the diagram then understand the logic of every problems
        // Note:- We can compare two char by ==, but we can not always compare STring with the ==, So we need a function to compare strings





        //=========== s1.equals(s3) -> this function is used to compare two strings
        String str4 = "Kali";
        String str5 = "Kali";
        String str6 = new String("Kali");
        if(str4 ==  str5){
            System.out.println("str4 and str5 are equals");
        }
        if(str5 ==  str6){         //Not equal  
            System.out.println("Str5 and str6 are equals");
        }
        // Note:- jb hum string ko new keyword ke saath nhi bnate hen tb wo purane wale string ko hi point krta rhta hai , jese str5 jo hai wo str4 ko hi point kr rha hai eslie dono same aa rha hai
        if(str5.equals(str6)){
            System.out.println("Both are equals");
        }





        //============= PRINT SUBSTRING of a String==========
        String str7 = "Coding Thinker";
        int n7 = str7.length();
        String ch7 = "";
        for(int i = 2; i <= n-5; i++){
            ch7 = ch7 + str7.charAt(i);
        }
        System.out.println(ch7);

        // Reverse this string
        String ch8 = "";
        for(int i = n7-1; i >= 0; i--){
            ch8 = ch8 + str7.charAt(i);
        }
        System.out.println(ch8);

        // str7.substring(starting index, last index):-- using functions
        System.out.println(str7.substring(0, n7));




        //=========== Questions:- Print Largest String==========

        // str1.compareTo(str2) -> Compare the string using alphabetically (called Lexicographically). [If compareTo function gives output like == 0, > 0, < 0  ->IF gives equal to zero means both are equal, if greater than zero means str1 > str2, if less than zero means str1 <  str2]

        String str8[] = {"kali", "linux", "Hacker"};
        String largest = str8[0];
        for(int i = 0; i<str8.length; i++){
            if(largest.compareTo(str8[i]) < 0){
                largest = str8[i];
            } 
        }
        System.out.println(largest);
        // T.C = O(x*N) -> let suppose x the total number of alphabet and compareTo goes at each letter so x*N







    }
    
}