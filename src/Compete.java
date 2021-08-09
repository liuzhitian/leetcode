import java.util.Arrays;
import java.util.Scanner;

public class Compete {

    public static int getchazhi(int n){
        int a = (int) Math.sqrt(n);
        int result = (n-a*a) > ((a+1)*(a+1)-n)? ((a+1)*(a+1)-n):(n-a*a);

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0; i < n; i++){
           a[i] = sc.nextInt();
           b[i] = getchazhi(a[i]);
        }

        Arrays.sort(b);
        int count = 0;
        int length = n%2==0?(n/2):(n/2)+1;
        for (int i = 0;i<length;i++){
            count+=b[i];
        }
        System.out.println(count);
    }
}
