import java.util.*;

public class PrintDecreasing{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n =  sc.nextInt();
        System.out.println("Output is");
        printDecreasing(n);
    }

    public static void printDecreasing(int n){

        if(n == 0){
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);
    }
}