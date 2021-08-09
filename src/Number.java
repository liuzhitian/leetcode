import java.util.HashMap;
import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashMap<Integer,Integer> startMap = new HashMap<>();
        HashMap<Integer,Integer> endMap = new HashMap<>();
        for (int i=0;i<n;i++){
            int temp = sc.nextInt();
            if (!startMap.containsKey(temp)) startMap.put(temp,i+1);
            if(!endMap.containsKey(temp) || endMap.get(temp)<i+1) endMap.put(temp,i+1);
        }
        for (int i=0;i<m;i++){
            int temp = sc.nextInt();
            if (!startMap.containsKey(temp)){
                System.out.println("0");
            }else {
                System.out.println(startMap.get(temp)+" "+endMap.get(temp));
            }
        }
    }
}
