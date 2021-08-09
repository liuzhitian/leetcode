package meituan;

import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] nums = new int[n];
            for(int j=0;j<n;j++){
                nums[j] = sc.nextInt();
            }
            Arrays.sort(nums);
            if(k>n || (k<n && nums[k] == nums[k-1]) || nums[k-1]+1 >n){
                System.out.println("NO");
            }else {
                System.out.println("YES");
                System.out.println(nums[k-1]+1);
            }
        }
    }
}
