package String;

import java.util.Stack;

public class BracketReversal {
    public int reverseCount(String s){
        if(s.length() % 2 != 0){
            return -1;
        }
        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '('){
                st.push(ch);
            }else{
                if(!st.isEmpty() && st.peek() == '('){
                    st.pop();
                }else{
                    st.push(ch);
                }
            }
        }

        int open =0;
        int close = 0;

        while(!st.isEmpty()){
            if(st.pop() == '('){
                open++;
            }else{
                close++;
            }
        }

        return (open + 1)/2 + (close + 1)/2;
    }

    public static void main(String[] args) {
        String s = ")(())(((";
        BracketReversal ab = new BracketReversal();
        System.out.println(ab.reverseCount(s));
    }
}
