import java.util.Scanner;

public class taijie {
    final static long pow = 1000000007l;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        if (m==1) System.out.println(n);
        if(n==1||n==2) System.out.println(1);

        long[] dp = new long[n+1];
        int[] temp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        temp[1] = 1;
        dp[2] = 1;
        temp[2] =2;

        for (int i=3;i<n+1;i++){
            for (int j=1;j<=m;j++){
                if (j!=temp[i-1]&&j!=temp[i-2]){
                    dp[i] = Math.min(dp[i],dp[j]+1);
                }
            }
            dp[i] = dp[i] % pow;
        }
        System.out.println(dp[n]);
    }

}
