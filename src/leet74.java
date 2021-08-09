public class leet74 {

    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix[0].length == 0)
            return false;

        int row = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        while(row<m&&matrix[row][0]<=target){
            row++;
        }

        if(row == m && matrix[row-1][0]==target) return true;
        if(row == m|| row == 0) return false;

        for(int i=0;i<n;i++){
            if(matrix[row-1][i] == target) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,3}};
        System.out.println(searchMatrix(matrix,3));

    }

}
