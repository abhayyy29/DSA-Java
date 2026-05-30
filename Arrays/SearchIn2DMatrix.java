public class SearchIn2DMatrix {
    public boolean searcMatrix(int[][] mat , int target){

        if(mat.length ==0){
            return false;
        }

        int n = mat.length;
        int m = mat[0].length;

        int low =0;
        int high = (n*m) - 1;

        while(low <= high){
            int mid = (low + (high-low )/2);

            if(mat[mid/m][mid%m]== target){
                return true;
            }
            if(mat[mid/m][mid%m] < target){
                low = mid +1;
            }else{
                high = mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] mat = {
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
        };

        SearchIn2DMatrix ab = new SearchIn2DMatrix();
        System.out.println(ab.searcMatrix(mat,30));
    }
}
