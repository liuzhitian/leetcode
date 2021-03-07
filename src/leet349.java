import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class leet349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int min_len = l1<l2?l1:l2;
        int[] result = new int[min_len];
        int count = 0;
        Set set1 = new LinkedHashSet();
        for (int i=0;i<l1;i++){
            set1.add(nums1[i]);
        }
        for (int i=0;i<l2;i++){
            if (set1.contains(nums2[i])){
                result[count] = nums2[i];
                count++;
                set1.remove(nums2[i]);
            }
        }
        int[] res = Arrays.copyOf(result,count);
        return res;
    }
}
