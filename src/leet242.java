import java.util.Arrays;

public class leet242 {
    public boolean isAnagram(String s, String t) {
        char[] ss = s.toCharArray();
        Arrays.sort(ss);
        s = String.valueOf(ss);
        char[] tt = t.toCharArray();
        Arrays.sort(tt);
        t = String.valueOf(tt);
        if(s.equals(t)) return true;
        return false;
    }
}
