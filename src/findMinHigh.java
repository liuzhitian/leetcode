import java.util.Arrays;
public class findMinHigh {

    public static String sortString(String str){
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }

    public static String find(String str){
        if(str == "") return "";
        int length = str.length();
        for (int i = length - 1;i>0;i--){
            if(str.charAt(i)>str.charAt(i-1)){
                return str.substring(0,i-1)+str.charAt(i)+sortString(str.charAt(i-1)+str.substring(i+1));
            }
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(find("16643264321"));
        System.out.println(find("1889823210"));
    }
}
