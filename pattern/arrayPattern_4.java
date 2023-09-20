/*

             *
    *        *
 *  *        *
 *  *        *
 *  *  *     *  *
 *  *  *  *  *  *


 */

public class arrayPattern_4 {
    public static void main(String[] args) {
        int arr[] = new int[] {4,5,2,1,6,2};
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        int arr2[] = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            arr2[i] = max- arr[i];
        }
        
        for(int i = 0; i <max; i++){
            for(int j = 0; j<arr.length; j++){
                if(arr2[j]!=0){
                    System.out.print("   ");
                    arr2[j]--;
                }
                else{
                    System.out.print(" * ");
                    arr[j]--;
                }
            }
            System.out.println();
        }
        
    }
    
}
