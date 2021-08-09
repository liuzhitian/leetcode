import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class fenjie {

    public static int tryFenjie(int i,int num){
        for(;i<=num;i++){
            if(num % i == 0){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new LinkedList();
        int num = sc.nextInt();

        while (num != 1){
            int temp = tryFenjie(list.size() == 0 ? 2: list.get(list.size()-1),num);
            num = num/temp;
            list.add(temp);
        }
        System.out.println(list);
    }
}
