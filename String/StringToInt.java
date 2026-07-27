package String;
public class StringToInt {
    public int myAtoi(String s){
        int i=0;
        int n = s.length();
        int ans =0;
        int sign = 1;

        while(i<n && s.charAt(i) == ' '){
            i++;
        }
        if(i<n && (s.charAt(i) == '+' || s.charAt(i) == '-')){
            if(s.charAt(i) == '-'){
                sign = -1;
            }
            i++;
        }
           while( i < n && Character.isDigit(s.charAt(i))){
                 int digit = s.charAt(i) - '0';

                 if(ans > Integer.MAX_VALUE /10 || (ans == Integer.MAX_VALUE /10 && digit > 7)){
                    if(sign == -1){
                        return Integer.MAX_VALUE;
                    }else{
                        return Integer.MIN_VALUE;
                    }
                }
                ans = ans * 10 + digit;
                i++;
           }

           return ans * sign;
    }
    public static void main(String[] args) {
        String s = " -4 words";
        StringToInt ab = new StringToInt();
        System.out.println(ab.myAtoi(s)); 
    }
}
