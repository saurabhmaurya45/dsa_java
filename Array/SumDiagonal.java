
public class SumDiagonal{

    // sumDiagonal function | bruteforce approach O(n^2)
    // public static int sumDiagonal(int arr[][]){
    //     int sum = 0;

    //     for(int i = 0; i< arr.length; i++){
    //         for(int j=0; j<arr[0].length; j++){
    //             if(i==j){
    //                 sum += arr[i][j];
    //             }
    //             else if(i+j == arr.length-1){
    //                 sum += arr[i][j];
    //             }
    //         }
    //     }

    //     return sum;
    // }

    //===================================================
    //optimised approach | O(n)
    public static int sumDiagonal(int arr[][]){
        int sum = 0;

        for(int i = 0; i< arr.length; i++){
            sum += arr[i][i];
            if(i != arr.length-i-1){
                sum += arr[i][arr.length-i-1];
            }
        }

        return sum;
    }

    // main function
    public static void main(String[] args) {
        int arr[][] = new int[][]{
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int arr1[][] = new int[][]{
            {1,2,3},
            {5,6,7},
            {9,10,11}
            
        };
        System.out.println(sumDiagonal(arr));
        System.out.println(sumDiagonal(arr1));

    }

} 