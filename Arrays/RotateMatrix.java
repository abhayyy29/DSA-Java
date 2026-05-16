public class RotateMatrix {
    public static void main(String[] args) {
    
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        RotateMatrix ab = new RotateMatrix();
        ab.rotateMatrix(matrix);
    }
    public void rotateMatrix(int[][] matrix){

        int n = matrix.length;
        int[][] ans = new int[n][n];

        for(int i=0; i<n;i++){
            for(int j=0;j<n;j++){
                ans[j][n-1-i] = matrix[i][j];
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            System.out.print(ans[i][j] + "");
        }
        System.out.println();
    }
    }

}
