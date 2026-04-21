import java.util.Scanner;

public class PrintMazePathJump {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        printMazePathsJump(1,1,n,m,"");
    }
    public static void  printMazePathsJump(int sr, int sc, int dr, int dc, String psf){
        if(sr==dr && sc==dc){
            System.out.println(psf);
            return;
        }

        for(int ms =1;ms<=dc-sc;ms++){
            printMazePathsJump(sr, sc + ms, dr, dc, psf + "h"+ ms);
        }
        for(int ms=1;ms<=dr-sr;ms++){
            printMazePathsJump(sr + ms, sc, dr, dc, psf + "v"+ ms);
        }
        for(int ms =1; ms<=dr-sr&& ms<=dc-sc; ms++){
            printMazePathsJump(sr + ms, sc + ms, dr, dc, psf + "d"+ ms);
        }
    }
}
