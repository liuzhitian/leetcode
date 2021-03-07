public class leet151 {
    public static String reverseWords(String s) {
        String[] stmp = s.split("\\s+");
        String result = "";
        for (int i=stmp.length-1;i>=0;i--){
            if (i==0) result+=stmp[i];
            else {
                result = result + stmp[i] +" ";
            }
        }

        return result;
    }



    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));
    }
}
