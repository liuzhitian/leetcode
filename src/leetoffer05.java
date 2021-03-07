public class leetoffer05 {
    public static String replaceSpace(String s) {
        char c = ' ';
        String replaceStr = "%20";
        char[] chars = s.toCharArray();
        int count = 0;
        for (int i=0;i<s.length();i++){
            if (chars[i] == c){
                count++;
            }
        }

        char[] newChars = new char[(replaceStr.length()-1)*count +chars.length];
        int j = newChars.length-1;
        for (int i=s.length()-1;i>=0;i--){
            if (chars[i]==c){
                for (int k=replaceStr.length()-1;k>=0;k--){
                    newChars[j] = replaceStr.charAt(k);
                    j--;
                }
            }else {
                newChars[j] = chars[i];
                j--;
            }
        }

        return String.valueOf(newChars);
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace("We are happy."));
    }
}
