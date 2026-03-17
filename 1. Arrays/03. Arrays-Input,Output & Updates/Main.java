//============ Input and Output============
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int marks[] = new int[100];

        System.out.println("Length of Array = " + marks.length);

        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt(); //phy
        marks[1] = sc.nextInt(); //chem
        marks[2] = sc.nextInt(); // maths

        System.out.println( "Physics = " + marks[0]);
        System.out.println( "Chemistry = " + marks[1]);
        System.out.println("Maths = " + marks[2]);

        //Update maths marks
        marks[2] = 100;
        // marks[2] = marks[2] + 1;
        System.out.println("Maths" + marks[2]);

        int percentage =( marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("percentage = " + percentage + "%");

         
    }
}