/*

input : 6


 _  _  _  _  _  *
 _  _  _  _  *     *
 _  _  _  *           *
 _  _  *                 *
 _  *                       *
 *  *  *  *  *  *  *  *  *  *  *

*/

import java.util.*;

class hollow_triangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number for pattern length");
        int inputNumber = sc.nextInt();
        for(int i = 1;  i<=inputNumber; i++){
            for(int j=1; j<=inputNumber-i; j++){;
               System.out.print(" _ ");
            }
            for(int j=1; j<=2*i-1; j++){  
                if(i==inputNumber|| j==1 || j== 2*i-1){
                    System.out.print(" * ");                
                }
                else{
                    System.out.print("   ");
                }         
            }
            System.out.println();
        }       
             

        sc.close();
    }

}