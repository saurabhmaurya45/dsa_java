/*

input : 5

 *  -  -  -  -  -  -  -  -  *
 *  *  -  -  -  -  -  -  *  *
 *  *  *  -  -  -  -  *  *  *
 *  *  *  *  -  -  *  *  *  *
 *  *  *  *  *  *  *  *  *  *
 *  *  *  *  -  -  *  *  *  *
 *  *  *  -  -  -  -  *  *  *
 *  *  -  -  -  -  -  -  *  *
 *  -  -  -  -  -  -  -  -  *

*/

import java.util.*;

class butterfly_pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number for pattern length");
        int inputNumber = sc.nextInt();
        
        for(int i = 1;  i<=inputNumber; i++){
            for(int j=1; j<=i; j++){;
               System.out.print(" * ");
            }
            for(int j=2*(inputNumber-i+1)-2; j>=1; j--){;
                System.out.print(" - ");
            }
            for(int j=1; j<=i; j++){;
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int i = inputNumber-1;  i>=1; i--){
            for(int j=1; j<=i; j++){;
                System.out.print(" * ");
             }
             for(int j=2*(inputNumber-i+1)-2; j>=1; j--){;
                 System.out.print(" - ");
             }
             for(int j=1; j<=i; j++){;
                 System.out.print(" * ");
             }
            System.out.println();
        }

        sc.close();
    }

}