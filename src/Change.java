import java.util.Arrays;
import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int j=0;j<t;j++){
            int n = in.nextInt();
            int[] dp = new int[n+1];
            dp[0] = 0;
            for (int i=1;i<n+1;i++){
                dp[i] = dp[i-1]+1;
                if (i%2==0){
                    dp[i] = Math.min(dp[i/2]+1,dp[i]);
                }
                if (i%3==0){
                    dp[i] = Math.min(dp[i],dp[i/3]+1);
                }
            }
            System.out.println(dp[n]);
        }

    }
}
