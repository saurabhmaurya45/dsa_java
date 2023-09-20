/*

input : 5

 _  _  _  _  1
 _  _  _  2  1  2
 _  _  3  2  1  2  3
 _  4  3  2  1  2  3  4
 5  4  3  2  1  2  3  4  5

*/

import java.util.*;

class palindrome_pattern_with_n_numbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number for pattern length");
        int inputNumber = sc.nextInt();
        int flag=0;
        for(int i = 1;  i<=inputNumber; i++){
            int num=i;
            for(int j=1; j<=inputNumber-i; j++){;
               System.out.print(" _ ");
            }
            for(int j=2*i-1; j>=1; j--){  
                System.out.print(" "+num+" ");                
                if(num==1){
                    flag = 1;
                }
                if(flag==1){
                    num++;
                }
                else{
                    num--;
                }        
            }
            flag=0;
            System.out.println();
        }       
             

        sc.close();
    }

}