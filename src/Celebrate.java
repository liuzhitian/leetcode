import java.util.Scanner;

public class Celebrate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        for (int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int res = 0;
        for (int i=0;i<n;i++){
            int temp =0;
            for(int j=i;j<i+k&&j<n;j++){
                temp^=nums[j];
                if(temp>res) res = temp;
            }
        }
        System.out.println(res);
    }
}
