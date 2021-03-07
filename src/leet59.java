public class leet59 {
    public static int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int count = 1;
        if (n%2==1) result[n/2][n/2]=n*n;
        for (int i=0;i<n/2;i++){
            for (int j=i;j<n-i;j++){
                result[i][j] = count;
                count++;
            }
            for (int j=i+1;j<n-i;j++){
                result[j][n-i-1]=count;
                count++;
            }
            for (int j=n-i-1-1;j>=i;j--){
                result[n-i-1][j]=count;
                count++;
            }
            for (int j=n-i-1-1;j>i;j--){
                result[j][i]=count;
                count++;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(generateMatrix(3));
    }
}
