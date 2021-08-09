public class HeapSort {

    static void heapSort(int[] array,int n){
        for(int i=n/2;i>0;i--){
            heapAdjust(array,i,n);
        }

        for (int i=n;i>1;i--){
            swap(array,1,i);
            heapAdjust(array,1,i-1);
        }
    }

    private static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    static void heapAdjust(int[] array,int s,int n){
        int temp = array[s];
        for(int i=2*s;i<=n;i++){
            if(i<n&&array[i]<array[i+1]){
                i++;
            }
            if(temp>=array[i]){
                break;
            }
            array[s] = array[i];
            s = i;
        }
        array[s] = temp;
    }

    public static void main(String[] args) {
        int[] a = {0,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
        for(int ele : a)
            System.out.print(ele+" ");
        heapSort(a,16);
        System.out.println();
        for(int ele : a)
            System.out.print(ele+" ");
    }
}
