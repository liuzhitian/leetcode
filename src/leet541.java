import java.util.Arrays;

public class leet541 {
    public static String reverseString(char[] s) {
        int n = s.length;
        for (int i=0;i<n/2;i++) {
            char tmp = s[i];
            s[i] = s[n - 1 - i];
            s[n - 1 - i] = tmp;
        }
        return String.valueOf(s);
    }
    public static String reverseStr(String s, int k) {
        int n= s.length();

        StringBuilder sb = new StringBuilder(s);
        for (int i=0;i<n;i+=2*k){
            if (i+k>n) {
                char[] chars = s.substring(i,n).toCharArray();
                sb.replace(i,n,reverseString(chars));
            }else {
                char[] chars = s.substring(i, i + k).toCharArray();
                sb.replace(i, i + k, reverseString(chars));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefghim",4));
    }
}
