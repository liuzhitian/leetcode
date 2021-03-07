public class leet69 {
    public static int mySqrt(int x) {
        int l=0,r=x,ans=-1;
        while(l<=r){
            int mid = (l+r)/2;
            if ((long)mid*mid<=x){
                ans=mid;
                l = mid + 1;
            }else {
                r = mid - 1;
            }
        }
        return ans;
    }



    public static void main(String[] args) {
        //System.out.println(mySqrt(4));
        System.out.println(mySqrt(27));
    }
}
