public class test {
    public static int[] carry(int[] nums,int pos,int length){
        for (;pos<length;pos++){
            if (nums[pos]>9){
                nums[pos] = 0;
                nums[pos+1]++;
            }
        }
        return nums;
    }

    public static int maxNoRepeat(int n){
        int length = 0;
        int tmp = n;
        int[] ns = new int[10];
        while(tmp!=0){
            ns[length] = tmp % 10;
            tmp = tmp/10;
            length++;
        }
        ns[0]+=1;
        ns[length] = 0;
        int index = length-1;
        while(index>0){
            if (ns[index]==ns[index-1]){
                ns[index-1]++;
                ns = carry(ns,index-1,length);
                for (int j=index-2;j>=0;j--) {
                    if ((index - j) % 2 == 0) {
                        ns[j] = 0;
                    } else {
                        ns[j] = 1;
                    }
                }
            }else {
                index--;
            }
        }

        int result = 0;
        for (int i = 0;i<length+1;i++){
            result += Math.pow(10,i)*ns[i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(maxNoRepeat(98));
        System.out.println(maxNoRepeat(1120));
        System.out.println(maxNoRepeat(9991));
        System.out.println(maxNoRepeat(1234));
        System.out.println(maxNoRepeat(13300));
        System.out.println(maxNoRepeat(99901));
        System.out.println(maxNoRepeat(9881));
        System.out.println(maxNoRepeat(1239));
    }
}
