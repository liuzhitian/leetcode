public class leet209 {
    public static int minSubArrayLen2(int s, int[] nums) {
        int n = nums.length;
        for (int i = 1;i <=n;i++){
            int sum = 0 ;

            for (int k =0;k<i;k++){
                sum+=nums[k];
            }

            if (sum>=s) return i;
            for (int j = i;j<n;j++){
                sum = sum + nums[j] - nums[j-i];
                if (sum>=s) return i;
            }
        }
        return 0;
    }
    public static int minSubArrayLen(int s, int[] nums) {
        int n = nums.length;
        int i = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;
        for (int j=0;j<n;j++){
            sum +=nums[j];
            while(sum>=s){
                sum -= nums[i];
                result = result > (j - i + 1 ) ? j - i + 1:result;
                i++;
            }

        }
        return result==Integer.MAX_VALUE?0:result;
    }

    public static void main(String[] args) {
        int[] tmp = new int[]{1,2,3,4,5};
        System.out.println(minSubArrayLen(15,tmp));
    }
}
