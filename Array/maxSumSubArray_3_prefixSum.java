class maxSumSubArray_3_prefixSum{
    public static void main(String[] args) {
        int arr[] = new int[] {50,-4,-6,-8,-10} ;
        int max = Integer.MIN_VALUE;
        // prefix sum
        for(int i = 1; i<arr.length; i++){
            arr[i] = arr[i-1]+arr[i];
            // max = Math.max(max, arr[i]);
        }
        //finding max
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int curr = i==0?arr[j]: arr[j]-arr[i-1];
                max = Math.max(max, curr);
            }
        }
        System.out.println(max);
    }
}