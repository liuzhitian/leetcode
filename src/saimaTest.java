import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class saimaTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        HashMap<Character,Integer> map = new HashMap<>();
        int len = 1;
        map.put(str.charAt(0),1);
        for (int i=1;i<str.length();i++){
            if(str.charAt(i) != str.charAt(i-1)){
                len = 0;
            }
            len++;
            if(map.get(str.charAt(i))==null||map.get(str.charAt(i))<len){
                map.put(str.charAt(i),len);
            }
        }

        int res = 0;
        Iterator<Map.Entry<Character, Integer>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<Character, Integer> entry = entries.next();
            res += entry.getValue();
        }

        System.out.println(res);

    }
}
