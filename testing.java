class Test{
    
    // spiral matrix printing
    public static void spiralMatrix(int arr[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length-1;
        int endCol = arr[0].length-1;

        while(startRow<=endRow && startCol<= endCol){
            //top
            for(int i=startCol; i<=endCol; i++){
                System.out.print(arr[startRow][i]+","); 
            }
            //right
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(arr[i][endCol]+",");
            }
            //bottom
            for(int i=endCol-1; i>=startCol; i--){
                if(startCol==endCol){
                    return;
                }
                System.out.print(arr[endRow][i]+",");
            }
            //left 
            for(int i=endRow-1; i>=startRow+1; i--){
                System.out.print(arr[i][startCol]+",");
            }
            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
    }

    

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

        spiralMatrix(arr);
        System.out.println();
        spiralMatrix(arr1);


    }
}