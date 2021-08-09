import java.util.Scanner;

public class Dragon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long c1 = sc.nextLong();
        long c2 = sc.nextLong();
        sc.nextLine();
        String s = sc.nextLine();
        long magic = c1>c2?c2:c1;
        long res = 0;
        int len = 0;
        for(int i=0;i<n;i++){
            if (s.charAt(i)=='T') len = 0;
            else len++;
            if(len == 3){
                len = 0;
                res+=magic;
            }
        }
        System.out.println(res);
    }
}
