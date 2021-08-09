public class MergeSort2 {

    private static int[] aux;
    public static void sort(int[] a){
        aux = new int[a.length];
        sort(a,0,a.length-1);
    }

    private static void sort(int[] a, int low, int high){
        if (high<=low) return;
        int mid = (low+high)/2;
        sort(a,low,mid);
        sort(a,mid+1,high);
        merge(a,low,mid,high);
    }

    public static void merge(int[] a, int low, int mid, int high) {
        int i = low, j = mid + 1;

        for (int k = low; k <= high; k++) {
            aux[k] = a[k];
        }

        for (int k = low; k <= high; k++) {
            if (i > mid) {
                a[k] = aux[j];
                j++;
            } else if (j > high) {
                a[k] = aux[i];
                i++;
            } else if (aux[i] < aux[j]) {
                a[k] = aux[i];
                i++;
            } else {
                a[k] = aux[j];
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
        for(int ele : a)
            System.out.print(ele+" ");
        sort(a);
        System.out.println();
        for(int ele : a)
            System.out.print(ele+" ");
    }
}
