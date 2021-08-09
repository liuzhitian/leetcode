package meituan;

import java.util.*;

public class xulie3 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int[] orderArray = new int[n];
        Arrays.fill(orderArray,Integer.MAX_VALUE);
        int res = 0;
        orderArray[0] = nums[0];
        for(int i=1;i<n;i++){
            int prev = 0;
            orderArray[i] = nums[i];
            Arrays.sort(orderArray);
            int index = Arrays.binarySearch(orderArray,nums[i]);
            System.out.println("index"+index);
            while(index >= 0 && orderArray[index] == nums[i]) index--;
            System.out.println(index < 0?0:orderArray[index]);
            res+= (i+1) * (index < 0?0:orderArray[index]);
        }
        System.out.println(res);
    }
}
