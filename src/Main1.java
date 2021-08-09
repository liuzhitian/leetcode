import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            int n = sc.nextInt();
            int l = sc.nextInt();
            List<Integer> list = findList(n, l);
            if (list.size()==0){
                System.out.println("No");
            }else {
                for (int i=0;i<list.size();i++){
                    if (i==0){
                        System.out.print(list.get(0));
                    }else {
                        System.out.println(" "+list.get(i));
                    }
                }
                System.out.println();
            }

        }
    }

    public static List<Integer> findList(int n,int l){

        List<Integer> list = new ArrayList<>();
        for (int i = l;i<100;i++){
            if ((n-i*(i-1)/2) >=0 && (n-i*(i-1)/2)%i == 0){
                int a = (n-i*(i-1)/2)/i;
                for (int j=0;j<i;j++){
                    list.add(j+a);
                }
                return list;
            }
        }
        return list;
    }
}
