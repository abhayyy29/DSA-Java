package String;
import java.util.*;

class SortCharByFreq {

    public List<Character> frequencySort(String s) {
              HashMap<Character, Integer> map = new HashMap<>();

              for(char ch : s.toCharArray()){
                map.put(ch,map.getOrDefault(ch, 0)+1);
              }

              List<Character> list = new ArrayList<>(map.keySet());

              Collections.sort(list,(a,b) ->{
                if(map.get(a).equals(map.get(b))){
                return a-b;
                }
                return map.get(b) - map.get(a);
              });
              return list;

    }
    public static void main(String[] args) {
        String s = "trrree";
        SortCharByFreq ab = new SortCharByFreq();
        System.out.println(ab.frequencySort(s));
    }
}