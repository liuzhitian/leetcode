public class leet20 {
    public static boolean isValid(String s) {
        if(s=="") return true;
        int length = s.length();
        char[] stack = new char[length];
        int index = 0;
        for(int i=0;i<length;i++){
            char c = s.charAt(i);
            if(c=='('||c=='{'||c=='['){
                stack[index] = c;
                index++;
            }else if((c==')'&&stack[index-1]=='(')||
                    (c==']'&&stack[index-1]=='[')||
                    (c=='}'&&stack[index-1]=='{')){
                index--;
            }else{
                return false;
            }
        }
        return index==0?true:false;
    }

    public static void main(String[] args) {
        isValid("()[]{}");
    }
}
