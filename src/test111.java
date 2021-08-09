import java.util.HashMap;
import java.util.Map;

public class test111 {
    public static String minWindow(String s, String t) {
        char[] chars = t.toCharArray();
        int length = s.length();
        Map<Character,Integer> map = new HashMap<>();
        Map<Character,Integer> windowMap = new HashMap<>();
        for(char c:chars){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int fastIndex = 0;
        int slowIndex = 0;
        int minLength = Integer.MAX_VALUE;
        int resultIndex = -1;
        while(fastIndex<length){
            while(fastIndex<length){
                char c = s.charAt(fastIndex);
                windowMap.put(c,windowMap.getOrDefault(c,0)+1);
                if(check(map,windowMap)){
                    break;
                }
                fastIndex++;
            }
            while(slowIndex<fastIndex){
                char c = s.charAt(slowIndex);
                windowMap.put(c,windowMap.getOrDefault(c,0)-1);
                if(!check(map,windowMap)){
                    break;
                }
                slowIndex++;
            }
            if(fastIndex - slowIndex + 1 < minLength){
                minLength = fastIndex - slowIndex + 1;
                resultIndex = slowIndex;
            }
            fastIndex++;
            slowIndex++;
        }


        return minLength == Integer.MAX_VALUE?"":s.substring(resultIndex,resultIndex+minLength);
    }
    public static boolean check(Map<Character,Integer> map,Map<Character,Integer> windowMap){
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(windowMap.getOrDefault(entry.getKey(),0) <entry.getValue())
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC","ABC"));
    }
}
