/*

 *  *  *  *  *  *
 *  *  *     *  *
 *  *        *
 *  *        *
    *        *
             *



 */

import java.util.*;
class Test{
    public static void main(String[] args) {
        int arr[] = new int[] {4,5,2,1,6,2};
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        
        for(int i = 0; i <max; i++){
            for(int j = 0; j<arr.length; j++){
                if(arr[j]!=0){
                    System.out.print(" * ");
                    arr[j]--;
                }
                else{
                    System.out.print("   ");
                }
                
            }
            System.out.println();
            
        }
        
    }
}