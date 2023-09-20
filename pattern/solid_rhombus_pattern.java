/*

input : 5

 _  _  _  _  *  *  *  *  *
 _  _  _  *  *  *  *  *
 _  _  *  *  *  *  *
 _  *  *  *  *  *
 *  *  *  *  *

*/

import java.util.*;

class solid_rhombus_pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number for pattern length");
        int inputNumber = sc.nextInt();
        
        for(int i = 1;  i<=inputNumber; i++){
            for(int j=1; j<=inputNumber-i; j++){;
               System.out.print(" _ ");
            }
            for(int j=1; j<=inputNumber; j++){;
                System.out.print(" * ");
            }
            System.out.println();
        }
        

        sc.close();
    }

}