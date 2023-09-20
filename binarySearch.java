/*
To find index of number and print index based on 1 based indexing and print 0 if element 
not present in sorted array
start+end/2 == end - (end-start)/2
conplexity O(log n)
*/

import java.util.*;

class BinarySearch{
    // binary search
    public static int binarySearch(int arr[], int toFind) {
        int si = 0;
        int ei = arr.length;
        while(si<=ei){
            int mid = ei-(ei-si)/2; // it will handle all the corner cases
            if(arr[mid] == toFind){
                return mid;
            }
            else if(arr[mid]>toFind){
                ei= mid-1;
            }
            else{
                si= mid+1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number between 1-10");
        int inputNumber = sc.nextInt();
        int arr[] = new int[]{1,2,3,4,5,6,7,8,9,10}; 
        System.out.println(binarySearch(arr, inputNumber)+1);

        sc.close();
        
    }

}