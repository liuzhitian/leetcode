import java.util.HashMap;
import java.util.Map;
/*
map还有这种函数
 */
public class leet454 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int n = A.length;
        Map<Integer,Integer> map1 = new HashMap<Integer,Integer>();
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                map1.put(A[i]+B[j],map1.getOrDefault(A[i]+B[j],0)+1);

            }
        }

        Map<Integer,Integer> map2 = new HashMap<Integer,Integer>();
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                map1.put(C[i]+D[j],map2.getOrDefault(C[i]+D[j],0)+1);

            }
        }

        int count = 0;
        for (int key:map1.keySet()){
            if (map2.get(-key)!=null){
                count += map1.get(key) * map2.get(-key);
            }
        }
        return count;
    }
}
