import java.util.*;

public class hebing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<int[]> lists = new ArrayList<>();
        for (int i=0;i<n;i++){
            int length = in.nextInt();
            int[] temp = new int[length];
            for (int j=0;j<length;j++){
                temp[j] = in.nextInt();
            }
            Arrays.sort(temp);
            lists.add(temp);
        }

        int q = in.nextInt();
        for (int i=0;i<q;i++){
            int p = in.nextInt();
            List<int[]> listTemp = new ArrayList<>();
            for (int j=0;j<p;j++){
                int pj = in.nextInt();
                int[] temp = lists.get(pj-1);
                listTemp.add(temp);
            }

            int ki = in.nextInt();
            int[] temp = new int[p*ki];
            Arrays.fill(temp,Integer.MAX_VALUE);
            int index = 0;
            for (int o=0;o<listTemp.size();o++){
                int[] sss = listTemp.get(o);
                for (int s:sss){
                    temp[index] = s;
                    index++;
                }
            }

            Arrays.sort(temp);
            System.out.println(temp[ki-1]);
        }
    }
}
