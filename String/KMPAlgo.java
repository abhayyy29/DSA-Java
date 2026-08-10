package String;

import java.util.ArrayList;
import java.util.List;

public class KMPAlgo {

    public List<Integer> search(String pat, String txt) {

        List<Integer> ans = new ArrayList<>();

        int n = txt.length();
        int m = pat.length();

        // Build LPS
        int[] lps = new int[m];

        int len = 0;
        int i = 1;

        while (i < m) {

            if (pat.charAt(i) == pat.charAt(len)) {

                len++;
                lps[i] = len;
                i++;

            } else {

                if (len != 0) {

                    len = lps[len - 1];

                } else {

                    lps[i] = 0;
                    i++;
                }
            }
        }

        // KMP Search
        i = 0;
        int j = 0;

        while (i < n) {

            if (txt.charAt(i) == pat.charAt(j)) {

                i++;
                j++;

                if (j == m) {

                    ans.add(i - m);

                    j = lps[j - 1];
                }

            } else {

                if (j != 0) {

                    j = lps[j - 1];

                } else {

                    i++;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        String txt = "abababc";
        String pat = "ababc";

        KMPAlgo ab = new KMPAlgo();

        List<Integer> result = ab.search(pat, txt);

        System.out.println(result);
    }
}