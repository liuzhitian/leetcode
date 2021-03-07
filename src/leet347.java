import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class leet347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return map.get(a) - map.get(b);
            }
        });
        for (Integer key:map.keySet()){
            if (queue.size()<k){
                queue.offer(key);
            }else{
                if (map.get(key)>queue.peek()){
                    queue.poll();
                    queue.offer(key);
                }
            }
        }

        int[] res = new int[k];
        int i=0;
        while(queue.size()!=0){
            res[i] =queue.poll();
            i++;
        }
        return res;
    }



    public static void main(String[] args) {

    }
}
