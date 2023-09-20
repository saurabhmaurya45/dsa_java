class maxSumSubArray_2{
    public static void main(String[] args) {
        int arr[] = new int[] {1,-2,6,-1,3} ;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            int curr=0;
            for(int j=i; j<arr.length; j++){
                curr += arr[j];
                max = Math.max(max, curr); 
            }
        }
        System.out.println(max);
    }
}