import java.util.Scanner;

public class Xiaomei {
    public static int huiwen(String s,int n){
        int res = n;
        for (int i=0;i<=n/2;i++){
            if(s.charAt(i)!=s.charAt(n-i-1)){
                if(res!=n) return -1;
                else res = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0;i<t;i++){
            int n = sc.nextInt();

            String s = sc.next();
            int res = huiwen(s,n);
            if (res == n){
                System.out.println(s);
            }
            else if(res==-1){
                int index = 0;
                while(s.charAt(index)=='0'&&index<n)
                    index++;
                s = s.substring(0,index)+"0"+ s.substring(index+1,n);
                System.out.println(s);
            } else {
                int index;
                String c;
                if(s.charAt(res)>s.charAt(n-res-1)){
                    index = res;
                    c = String.valueOf(s.charAt(n-res-1));
                }else {
                    index = n-res-1;
                    c = String.valueOf(s.charAt(res));
                }
                s= s.substring(0,index)+c+s.substring(index+1,n);
                System.out.println(s);
            }
        }
    }
}
