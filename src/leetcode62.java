public class leetcode62 {
    public static long factorial(int n){
        int count = 1;
        while(n>0){
            count *= n;
            n--;
        }
        return count;
    }

    public static int uniquePaths(int m, int n) {
        //动态规划的话就是创建一个二维数组，然后斜着去填这个二维数组
        //数组中元素的值就是上方+左方两个之和
        //但是这个题可以一眼看出用排列组合公式C(m+n-2,n-1)去做

        return (int)(factorial(m+n-2)/(factorial(n-1)*factorial(m-1)));
    }

    public static void main(String[] args) {

        System.out.println(uniquePaths(10,7));
    }
}
