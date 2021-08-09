import java.util.Arrays;
import java.util.Scanner;

public class Jump {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String s = in.nextLine();
        int[] ns = new int[n];
        int[][] dp = new int[10][10];
        for (int i=0;i<10;i++){
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        }
        for (int i=0;i<n;i++){
            ns[i] = Integer.parseInt(s.substring(i,i+1));
            if (i!=0) dp[ns[i-1]][ns[i]] = 1;
        }

        int count=Integer.MAX_VALUE;
        while (count!=0){
            count = 0;
            for (int i=0;i<10;i++){
                for (int j=0;j<10;j++){
                    for (int k=0;k<10;k++){
                        if (dp[i][k]+dp[k][j]<dp[i][j] && dp[i][k]!=Integer.MAX_VALUE && dp[k][j]!=Integer.MAX_VALUE ){
                            dp[i][j] = dp[i][k]+dp[k][j];
                            count++;
                        }
                    }
                }
            }

        }


        System.out.println(dp[ns[0]][ns[n-1]]+1);
    }
}
