package String;

public class RabinKarpAlgo {
    static final int d = 256;

    static void search(String text, String pattern){
        int n = text.length();
        int m = pattern.length();

        int q = 101;

        int pHash =0;
        int tHash =0;
        int h =1;

        for(int i =0; i<m-1; i++){
            h = (h * d) % q;
        }
            for(int i=0; i<m; i++){
                pHash = (d * pHash + pattern.charAt(i)) % q;
                tHash = (d * tHash + text.charAt(i)) % q;
            }
            for(int i = 0; i <= n - m; i++){
                if(pHash == tHash){
                    int j;
                    for(j=0; j<m; j++){
                        if(text.charAt(i+j) != pattern.charAt(j))
                            break;
                    }

                    if(j == m)
                        System.out.println("Patter found at index: " + i);
                    
                }
                    if(i<n-m){
                        tHash = (d * (tHash - text.charAt(i)*h) + text.charAt(i+m))%q;
                        if(tHash <0)
                            tHash += q;
                    }
                }
            }
            public static void main(String[] args) {
                search("abcdabce", "bce");
            }
        }
    

