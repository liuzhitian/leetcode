import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Tree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int[] dp = new int[n];
        int count = 0;
        List<Integer> res = new LinkedList<>();
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
            count += nums[i];
            if(i==0||i==1) dp[i] = nums[i];
            else dp[i] +=nums[i]+dp[i-2];
        }
        if (n==1){
            String s = String.valueOf(nums[0]);
            System.out.println(1);
            System.out.println(s);
            return;
        }
        if (n==2){
            String s = nums[0] + " "+ nums[1];
            System.out.println(2);
            System.out.println(s);
            return;
        }

        for(int i=0;i<n;i++){
            if ((count-nums[i])%2!=0) continue;

            int temp1 = 0;
            int temp2 = 0;
            if (i>0) temp1 = nums[i-1] ;
            if(i>1) temp2 = nums[i-2];
            for (int j=i+1;j<n;j++){
                if((j-i)%2==0){
                    temp1 += nums[j];
                }else {
                    temp2 += nums[j];
                }
            }
            if(temp1==temp2) res.add(i);


        }

        if (res.size() == 0)
            System.out.println("0");
        else {
            String s = String.valueOf(res.get(0));
            for (int i=1;i<res.size();i++){
                s+=" "+res.get(i);
            }
        }
    }
}
