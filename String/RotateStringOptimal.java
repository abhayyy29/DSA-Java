package String;

public class RotateStringOptimal {
    public boolean rotateString(String s, String goal){

        if(s.length() != goal.length()){
            return false;
     }    

     String temp = s + s;
      if(temp.contains(goal)){
        return true;
      }
      return false;
     }
     public static void main(String[] args) {
        String s= "abcde";
        String goal = "abced";
        RotateStringOptimal ab = new RotateStringOptimal();
        System.out.println(ab.rotateString(s, goal));
     }
}
