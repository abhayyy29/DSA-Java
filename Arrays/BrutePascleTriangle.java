public class BrutePascleTriangle{
    public static int nCr(int n , int r){
        int res = 1;
        for(int i=0;i<r; i++){
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(nCr(4,2));
    }
}