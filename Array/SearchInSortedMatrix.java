public class SearchInSortedMatrix{
    // search function
    //started form top right corner
    public static void searchInSortedMatrixTopRightCorner(int arr[][], int key){
        int row = 0;
        int col  = arr[0].length-1;
        while(row<arr.length){
            if(key == arr[row][col]){
                System.out.println("Element is at indx:  ("+row+","+col+")");
                return;
            }
            else if(key<arr[row][col]){
                col--;
            }
            else if(key > arr[row][col]){
                row++;
            }
        }
        System.out.println("Element not found");
        return;
    }
    //started form bottom left corner
    public static void searchInSortedMatrixBottomLeftCorner(int arr[][], int key){
        int row = arr.length-1;
        int col  = 0;
        while(col < arr[0].length){
            if(key == arr[row][col]){
                System.out.println("Element is at indx:  ("+row+","+col+")");
                return;
            }
            else if(key > arr[row][col]){
                col++;
            }
            else if(key < arr[row][col]){
                row--;
            }
        }
        System.out.println("Element not found");
        return;
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
        searchInSortedMatrixTopRightCorner(arr, 13);
        searchInSortedMatrixBottomLeftCorner(arr, 13);
        
    }
}