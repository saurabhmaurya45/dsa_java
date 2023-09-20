/*

*
**
***
****
*****

*/
import java.util.*;

class pattern_printing_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number to Print triangle pattern");
        int inputNumber = sc.nextInt();
        
        for(int i = 1;  i<=inputNumber; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }

}