/*

input : 5

 _  _  _  _  1
 _  _  _  2  2
 _  _  3  3  3
 _  4  4  4  4
 5  5  5  5  5
 
*/

import java.util.*;

class number_pyramid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number for pattern length");
        int inputNumber = sc.nextInt();
        int num=1;
        for(int i = 1;  i<=inputNumber; i++){
            for(int j=1; j<=inputNumber-i; j++){;
               System.out.print(" _ ");
            }
            for(int j=1; j<=i; j++){;                   
                System.out.print(" "+num+" ");
            }
            num++;
            System.out.println();
        }       
             

        sc.close();
    }

}