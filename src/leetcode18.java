import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for (int i=0;i<nums.length;i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for(int j=i+1;j<nums.length;j++){
                if (j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                int l = nums.length-1;
                int sum = nums[i]+nums[j];
                for (int k = j+1;k<nums.length;k++){
                    if (k>j+1&&nums[k]==nums[k-1]){
                        continue;
                    }
                    while (l>k &&sum+nums[l]+nums[k]>target){
                        l--;
                    }if (k == j) {
                        break;
                    }
                    if ( nums[i] + nums[j] + nums[k] + nums[l] == target) {
                        List<Integer> tmp = new ArrayList<Integer>();
                        tmp.add(nums[i]);
                        tmp.add(nums[j]);
                        tmp.add(nums[k]);
                        tmp.add(nums[l]);
                        result.add(tmp);
                    }


                }

            }
        }
        return result;
    }

}
