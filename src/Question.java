import java.math.BigInteger;
import java.util.Scanner;

public class Question {
    final static long pow = 1000000007l;
    public static long combination(int k,int n){
        long a = 1;
        long b = 1;
        for (int i=1;i<=k;i++){
            a*=(n-i+1);
            b*=i;
        }
        return a/b;
    }

    public static long getji(int jinum){
        long result = 0;
        for (int i=1;i<=jinum;i++){
            result += combination(i,jinum);
            result = result%pow;
        }

        return result;
    }

    public static long getou(int jinum,int ounum){
        long result = 0;
        for (int i=1;i<=ounum;i++){
            for (int j=1;j<=jinum;j++){
                result += combination(j,jinum)*combination(i,ounum);
                result = result%pow;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        in.nextLine();
        int[] ints = new int[n];
        for (int i=0;i<n;i++){
            ints[i] = in.nextInt();
        }

        for (int i=0;i<m;i++){
            int k = in.nextInt();
            int l = in.nextInt();
            int r = in.nextInt();
            int jinum = 0;
            int ounum = 0;
            for (int j=l;j<r;j++){
                if (ints[j]%2==0){
                    jinum++;
                }else {
                    ounum++;
                }
            }

            if (k==1){
                System.out.println(getji(jinum));
            }else {
                System.out.println(getou(jinum,ounum));
            }
        }
    }
}
