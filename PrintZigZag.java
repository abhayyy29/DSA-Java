import java.util.Scanner;

public class PrintZigZag{
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        int n = sc.nextInt();
        pzz(n);
    }
    public static int pzz(int n){
        if(n == 0){
            return 1;
        }
        System.out.print(n);
        pzz(n-1);
        System.out.print(n);
        pzz(n-1);
        System.out.print(n);
        return n;
    }
}