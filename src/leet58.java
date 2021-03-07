public class leet58 {
    public static int lengthOfLastWord(String s) {
        if(s.length()==0) return 0;
        String[] splited = s.split("\\s+");

        return splited.length==0?0:(splited[splited.length-1]).length();
    }


}
