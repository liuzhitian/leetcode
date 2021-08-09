public class packet {
    public static int packet(int[] weight,int[] value,int bagweight){
        int[] dptable = new int[bagweight+1];
        for (int i=0;i<weight.length;i++){
            for (int j = bagweight;j>=weight[i];j--){
                dptable[j] = Math.max(dptable[j],dptable[j - weight[i]]+value[i]);
            }
        }

        return dptable[bagweight];
    }

    public static void main(String[] args) {
        int packet = packet(new int[]{1, 3, 4}, new int[]{15, 20, 30}, 4);
        System.out.println(packet);
    }
}
