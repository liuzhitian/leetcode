import java.util.Arrays;

public class QuickSort {

    public static void quicksort(int l,int r,int[] ints){
        if (l<r){
            int i=l,j=r,s=ints[i];
            while(i<j){

                while(i<j&&ints[j]>=s){
                    j--;
                }
                if (i<j){
                    ints[i] = ints[j];
                    i++;
                }

                while(i<j&&ints[i]<s){
                    i++;
                }
                if (i<j){
                    ints[j] = ints[i];
                    j--;
                }
            }
            ints[i] = s;
            quicksort(l,i-1,ints);
            quicksort(i+1,r,ints);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int[] array = new int[]{2, 3, 6, 5, 1, 7, 8};
        quicksort(0, array.length-1, array);
        System.out.println(Arrays.toString(array));

    }


}
