package String;
public class ReverseWordsInString {
    public String reverseWords(String s){
        s.trim().replaceAll("\\s+", " ");

        char[] arr = s.toCharArray();

        reverse(arr,0,arr.length-1);

        int start =0;
        for(int end=0; end<=arr.length; end++){
            if(end == arr.length || arr[end] == ' '){
                reverse(arr,start,end -1);
                start = end +1;
            }
        }
        return new String(arr);
    }
    private void reverse(char[] arr, int left, int right){
        while(left<right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }    
    public static void main(String[] args) {
        String s = "coding skills";
        ReverseWordsInString ab = new ReverseWordsInString();
        System.out.println(ab.reverseWords(s));
    }
}
