package meituan;

import java.util.Scanner;

public class keyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = "";
        char cur = 'a';
        int i=0;
        for(i=0;i<s.length();++i){
            if(s.charAt(i) != ' '){
                cur = s.charAt(i);
                break;
            }
        }
        res += String.valueOf(cur);
        for(int j = i+1;j<s.length();++j){
            char c = s.charAt(j);

            if(c == ' '||c == cur){
                continue;
            }else {
                cur = c;
                res += String.valueOf(cur);
            }
        }
        System.out.println(res);
    }
}
