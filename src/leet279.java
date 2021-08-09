import java.util.Arrays;

public class leet279 {
    public static int numSquares(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        Arrays.fill(dp,Integer.MAX_VALUE);

        for(int i=1;i<n+1;i++){
            for(int j=1;j*j<=i;j++){
                if(dp[i-j*j]!=Integer.MAX_VALUE){
                    dp[i] = Math.min(dp[i],dp[i-j*j]+1);
                }
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(numSquares(12));
    }
}
