import java.util.HashMap;
import java.util.Map;

public class leet1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i=0;i<nums.length;i++){
            if (map.get(target-nums[i])!=null){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}
