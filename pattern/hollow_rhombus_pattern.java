/*

input : 5

 _  _  _  _  *  *  *  *  *
 _  _  _  *  _  _  _  *
 _  _  *  _  _  _  *
 _  *  _  _  _  *
 *  *  *  *  *

*/

import java.util.*;

class hollow_rhombus_pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number for pattern length");
        int inputNumber = sc.nextInt();
        
        for(int i = 1;  i<=inputNumber; i++){
            for(int j=1; j<=inputNumber-i; j++){;
               System.out.print(" _ ");
            }
            for(int j=1; j<=inputNumber; j++){;
                if(i==1|| i==inputNumber || j==1|| j==inputNumber){
                    System.out.print(" * ");
                }
                else{
                    System.out.print(" _ ");
                }
            }
            System.out.println();
        }
        

        sc.close();
    }

}