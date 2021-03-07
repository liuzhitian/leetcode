import java.util.Stack;

public class leet1047 {
    public String removeDuplicates(String S) {
        Stack<Character> stack = new Stack();
        char[] chars = S.toCharArray();
        for (int i=0;i<chars.length;i++){
            if (stack.size()!=0&&chars[i]==stack.peek()){
                stack.pop();
            }else {
                stack.push(chars[i]);
            }
        }
        char[] newChars = new char[stack.size()];
        for (int i=stack.size()-1;i>=0;i--){
            newChars[i] = stack.pop();
        }
        return String.valueOf(newChars);
    }
}
