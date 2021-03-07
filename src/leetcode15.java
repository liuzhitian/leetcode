import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i=0;i<nums.length;i++){
            if (i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int k = nums.length-1;
            int target = -nums[i];
            for (int j=i+1;j<nums.length;j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                while (k > j && nums[j] + nums[k] - target > 0) {
                    k--;
                }
                if (k == j) {
                    break;
                }
                if (nums[i] + nums[j] + nums[k] == 0) {
                    List<Integer> tmp = new ArrayList<Integer>();
                    tmp.add(nums[i]);
                    tmp.add(nums[j]);
                    tmp.add(nums[k]);
                    result.add(tmp);
                }
            }
        }
        return result;
    }
    //baoli meiguo
    public static List<List<Integer>> threeSum2(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i=0;i<nums.length-3;i++){
            int j = i+1;
            int k = i+2;
            while (k< nums.length){
                if (nums[i]+nums[j]+nums[k]==0){
                    List<Integer> tmp = new ArrayList<Integer>();
                    tmp.add(nums[i]);
                    tmp.add(nums[j]);
                    tmp.add(nums[k]);
                    result.add(tmp);
                }else if((k-j)==1){
                    k++;
                    j=i+1;
                }else {
                    j++;
                }
            }


        }
        return result;
    }

}
