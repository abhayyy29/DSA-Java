package String;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] str){

        if(str.length== 0){
            return "";
        }
        String first = str[0];
        for(int i=0; i<first.length();i++){
            char ch = first.charAt(i);
            for(int j=1; j<str.length;j++){
                if(i>str.length || str[j].charAt(i) != ch){
                    return first.substring(0,i);
                }
            }
        }
        return first;
    }
    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        System.out.println(lcp.longestCommonPrefix(str));
    }
}
