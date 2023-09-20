/* Check if pair with given Sum exists in Array (Two Sum) */

// two pointer algorithm : 
    /*    The idea is to use the two-pointer technique. But for using the two-pointer technique, the array must be sorted. Once the array is sorted the two pointers can be taken which mark the beginning and end of the array respectively. If the sum is greater than the sum of those two elements, shift the right pointer to decrease the value of the required sum and if the sum is lesser than the required value, shift the left pointer to increase the value of the required sum. */

import java.util.*;

class pairWithGivenSum {
    // primary approach O(n^2)
    // public static boolean twoSum(int arr[], int reqSum){
    //     for(int i = 0; i<arr.length-1; i++){    
    //         for(int j = i+1; j<arr.length; j++){
    //             if(arr[i]+arr[j]== reqSum){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    //optimised approach recursive way O(nlogn) 
    
    // public static void twoSum(int arr[], int l, int r, int  reqSum){
    //     if(l>r){
    //         return;
    //     }
    //     else if(arr[l]+arr[r]<reqSum){
    //         twoSum(arr, l+1, r, reqSum);
    //     }
    //     else if(arr[l]+arr[r]> reqSum){
    //         twoSum(arr, l, r-1, reqSum);
    //     }
    //     else{
    //         System.out.println("("+arr[l]+","+arr[r]+")");
    //         twoSum(arr, l, r-1, reqSum);
    //     }
    // }
    
    // itterative approach
    public static void twoSum(int arr[], int l, int r, int  reqSum){
        while(l<= r){
            if(arr[l]+arr[r]<reqSum){
                l++;
            }
            else if(arr[l]+arr[r]> reqSum){
                r--;
            }
            else{
                System.out.println("("+arr[l]+","+arr[r]+")");
                r--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[] {1,2,3,4,5,6};
        int reqSum = 7;
        Arrays.sort(arr);
        twoSum(arr,0,arr.length-1, reqSum);

    }
        
}