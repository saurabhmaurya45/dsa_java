/*
 To find rotation of a matrix in multiple of 90deg

 */

import java.util.*;

class matrixRotationby90 {
    public static void main(String[] args) {
        int arr[][] = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        
        int res[][] = new int[arr[0].length][arr.length];
        
        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr[i].length; j++){
        //         int curr_sum = 0;
        //         for(int k=0; k<arr[i].length; k++ ){
        //             curr_sum += arr[i][k]*arr[k][j];
        //         }
        //         res[i][j] = curr_sum;
            
        //     }
            
        // }
        // printing an array
        for(int i = 0; i< arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }

        System.out.println();

        // rotating array in multiple of 90deg
    for(int z = 1; z<=16%4; z++){  
        //finding transpose
        for(int i = 0; i<arr.length; i++){
            for(int j=0; j<i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // reversing each row so that it will be rotation of 90deg
        for(int i = 0; i<arr.length; i++){
            for(int j=0; j<arr.length/2; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][arr.length-j-1];
                arr[i][arr.length-j-1] = temp;
            }
        }
    }
    // printing array after rotation
        for(int i = 0; i< arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
        
}