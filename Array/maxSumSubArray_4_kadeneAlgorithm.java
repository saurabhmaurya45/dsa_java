// max sum of subarray
// kadene algorithm

class maxSumSubArray_4_kadaneAlgorithm{
    public static void main(String[] args) {
        int arr[] = new int[] {50,-4,-6,-8,-10} ;
        int max = Integer.MIN_VALUE;
        int curr = 0;
        //finding max
        for(int i=0; i<arr.length; i++){
            curr += arr[i];
            max = Math.max(max, curr);
            if(curr<0){
                curr = 0;
            }
        }
        System.out.println(max);
    }
}