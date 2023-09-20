/*Program to find average of an array */


import java.util.*;

class avgArray {
    // recursive implementaion

    public static long sumArray(int arr[], int i){
        if(i == arr.length-1){
            return arr[i];
        }
        return (arr[i]+sumArray(arr, i+1));
    }
    public static long avgArray(int arr[]){
        long res = 0;
        res = sumArray(arr, 0);
        return res/arr.length;
    }
    
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,6};
        int sum = 0;
        // itterative version
        for(int i =0; i<arr.length; i++){
            sum+=arr[i];
        }
        System.out.println(sum);
        int avg = sum/arr.length;
        
        //itterative print
        System.out.println(avg);

        // recursive print
        System.out.println(avgArray(arr));

    }
        
}