/*
To find index of number and print index based on 1 based indexing and print 0 if element 
not present

*/

import java.util.*;

class LinearSearch{
    // function for linear search
    public static int linearSearch(int arr[], int toFind){
        for(int i=0; i<arr.length;i++){
            if(arr[i]==toFind){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number between 1-10");
        int inputNumber = sc.nextInt();
        int arr[] = new int[]{1,2,3,4,5,6,7,8,9,10}; 
        System.out.println(linearSearch(arr, inputNumber)+1);
        
        sc.close();
    }

}