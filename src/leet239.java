import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class leet239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length-k+1];
        Deque<Integer> queue = new LinkedList<Integer>();
        for (int i=0;i<k;i++){
            while(queue.size()!=0&&queue.peekLast()<nums[i]){
                queue.pollLast();
            }
            queue.offerLast(nums[i]);
        }

        result[0] = queue.peekFirst();
        for (int i=k;i<nums.length;i++){
            if (nums[i-k]==queue.peekFirst()){
                queue.pollFirst();
            }
            while(queue.size()!=0&&queue.peekLast()<nums[i]){
                queue.pollLast();
            }
            queue.offerLast(nums[i]);
            result[i-k+1] = queue.peekFirst();
        }
        return result;
    }
}
