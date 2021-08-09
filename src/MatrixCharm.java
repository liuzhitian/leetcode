import java.util.Arrays;
import java.util.Scanner;

public class MatrixCharm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        int[] matrix = new int[i*j];
        for (int l=0;l<i;l++){
            for (int m=0;m<j;m++){
                matrix[l*j+m] = (l+1)*(m+1);
            }
        }

        Arrays.sort(matrix);
        System.out.println(matrix[k-1]);
    }
}
