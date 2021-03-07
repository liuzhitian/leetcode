public class leet459 {
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

    public boolean repeatedSubstringPattern(String s) {
        int[] next = getnext(s);
        if (next[s.length()-1]!=0&&s.length()%(s.length()-next[s.length()-1])==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] next = getnext("abacabac");
        for (int i:next){
            System.out.println(i);
        }

    }
}
