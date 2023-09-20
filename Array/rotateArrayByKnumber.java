/* Program for array rotation by k positions. */



import java.util.*;

class rotateArrayByKnumber {
    public static void revArr(int arr[], int l, int r){
        while(l<=r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[] {1,2,3,4,5};
        int k =2;
        //direction in which you want to rotate
        char choice = 'L';
        int arrLen = arr.length-1;
        k = ((k%arrLen)+arrLen)%arrLen;
        revArr(arr, 0, arrLen);
        if(choice == 'L'){
            revArr(arr, 0, arrLen-k);
            revArr(arr, arrLen-k+1, arrLen);
        }
        else{
            revArr(arr, 0, k-1);
            revArr(arr, k, arrLen);
        }
        System.out.println(Arrays.toString(arr));

       
    }
        
}