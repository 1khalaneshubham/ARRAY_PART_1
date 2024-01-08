import java.util.*;

public class Arrays_input {
    public static void main(String args[]){

        int marks[] = new int[100];

        System.out.println("Length of Array is:"+ marks.length );

        Scanner sc = new Scanner(System.in);
            // int phy;
            // phy = sc.nextInt();

            marks[0] = sc.nextInt(); // phy
            marks[1] = sc.nextInt(); // chem
            marks[2] = sc.nextInt();  //math
 
            System.out.println("Phy : " + marks[0]);
            System.out.println("chem : " + marks[1]);
            System.out.println("Math : " + marks[2]);

            marks[2] = marks[2] + 2;

            System.out.println("Math : " + marks[2]);

            int Persentage = (marks[0] + marks[1] + marks[2])/3;
            System.out.println("persentage = "+ Persentage +"%");
        }
}