import java.util.HashMap;
import java.util.Map;

public class leet383 {
    public static Map<Character,Integer> string2Map(String str){
        Map<Character,Integer> map = new HashMap<Character,Integer>();

        char[]  charArray = str.toCharArray();
        for (char c:charArray){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        return map;
    }
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map1 = string2Map(ransomNote);
        Map<Character,Integer> map2 = string2Map(magazine);
        for (char c:map1.keySet()){
            if (map2.get(c)==null || map2.get(c)<map1.get(c)){
                return false;
            }
        }
        return true;
    }
}
