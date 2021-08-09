import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Card {
    static int minCount = Integer.MAX_VALUE;
    static int count = 0;
    static Deque<Integer> list = new LinkedList<>();
    public static void backtracking(int[] a,int[] b,int index){
        if (list.size()==3) {
            if (count < minCount) {
                minCount = count;
            }
            return;
        }
        for (int i=index;i<a.length && count<minCount;i++){
            Integer last = list.peekLast();
            if(last != null && a[i] < last) continue;

            list.offerLast(a[i]);
            count += b[i];

            backtracking(a,b,i+1);

            list.pollLast();
            count -= b[i];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for (int j=0;j<n;j++){
            b[j] = sc.nextInt();
        }

        backtracking(a,b,0);

        int result = minCount==Integer.MAX_VALUE?-1:minCount;
        System.out.println(result);

    }
}
