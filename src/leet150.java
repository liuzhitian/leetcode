import java.util.Stack;

public class leet150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack();
        for (int i=0;i<tokens.length;i++){
            switch (tokens[i]){
                case "+":
                    stack.push(stack.pop()+stack.pop());
                    break;
                case "-":
                    int a = stack.pop();
                    stack.push(stack.pop()-a);
                    break;
                case "*":
                    stack.push(stack.pop()*stack.pop());
                    break;
                case "/":
                    int b = stack.pop();
                    stack.push(stack.pop()/b);
                    break;
                default:
                    stack.push(Integer.valueOf(tokens[i]));
                    break;
            }
        }

        return stack.pop();
    }
}
