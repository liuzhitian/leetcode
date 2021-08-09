import java.util.Arrays;
import java.util.Scanner;

public class BiggestMiddle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int w = in.nextInt();
        int[] minValue = new int[n];
        int[] maxValue = new int[n];
        int maxMoney = 0;
        int middle = n/2-1;
        for (int i=0;i<n;i++){
            minValue[i] = in.nextInt();
            maxValue[i] = in.nextInt();
            maxMoney += maxValue[i];
        }

        if (maxMoney<=w){
            Arrays.sort(maxValue);

            if (n%2==0){
                System.out.println((maxValue[n/2]+maxValue[n/2-1])/2);
            }else {
                System.out.println(maxValue[n/2]);
            }
        }


        int[] dp = new int[n];
        int temp = w;
        for (int i=0;i<n;i++){
            dp[i] = minValue[i];
            temp -= minValue[i];
        }


    }
}
