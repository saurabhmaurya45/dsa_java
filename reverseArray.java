/*

Reverse an array

*/

import java.util.*;


class ReverseArray{
    // reverse function
    public static void revArray(int arr[]) {
        int si = 0;
        int ei = arr.length-1;
        while(si<=ei){
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[]{1,2,3,4,5,6,7,8,9,10}; 
        revArray(arr);
        System.out.println(Arrays.toString(arr));

        sc.close();
    }

}