import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of disks");
        int n = sc.nextInt();
        int t1id = sc.nextInt();
        int t2id = sc.nextInt();
        int t3id = sc.nextInt();
        toh(n,t1id,t2id,t3id);
    }
    public static void toh(int n, int t1id, int t2id, int t3id){

        if(n == 0){
            return;
        }
        toh(n-1,t1id,t3id,t2id); // move t1 to t3 with the help of t2
        System.out.println(n + "[" + t1id + " -> " + t2id + "]");
        toh(n-1,t3id,t2id,t1id); // move t3 to t2 with the help of t1
    }
}
