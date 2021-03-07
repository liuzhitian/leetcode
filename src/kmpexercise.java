public class kmpexercise {
    public static int[] getnext(String s){
        int n = s.length();
        int[] next = new int[n];
        int j=0;
        for (int i=1;i<n;i++){
            while (j>0 && s.charAt(j)!=s.charAt(i)){
                j = next[j-1];
            }
            if (s.charAt(j)==s.charAt(i)){
                j++;
            }
            next[i] = j;

        }
        return next;
    }

    public static int strStr(String haystack, String needle){
        if(needle==null||"".equals(needle)) return 0;
        else {
            int[] next = getnext(needle);
            int n = haystack.length();
            int j = 0;
            for (int i = 0; i < n; i++) {
                while (j > 0 && needle.charAt(j) != haystack.charAt(i)) {
                    j = next[j - 1];
                }
                if (needle.charAt(j) == haystack.charAt(i)) {
                    j++;
                }
                if (j == needle.length()) {
                    return i - needle.length() + 1;
                }

            }
            return -1;
        }
    }



    public static void main(String[] args) {
        int[] next = getnext("aabaaf");
        for (int i:next){
            System.out.println(i);
        }
        System.out.println(strStr("",""));

    }

}
