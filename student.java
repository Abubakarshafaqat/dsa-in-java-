/*Here we make the partrtn of solin ractanglr 
 1 ) Take inputs from user .
 2 )Send the inputs to your class.
 3 ) by using double for loop make the ractancle.
 ex:
     *******
     *******
     *******
*/
import java.util.Scanner;
public class student {
    void make_pateren(int n , int m){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++)
            System.out.print(" * ");
            System.out.println();
        }
    }
public static void main(String[] args){
    Scanner s1 = new  Scanner(System.in);
        System.out.println("Enter the row to solid recrangle");
        int n = s1.nextInt();
        System.out.println("Enter the colom to solid recrangle");
        int m = s1.nextInt();
        student s = new student();
        s.make_pateren(n, m);
}
}
