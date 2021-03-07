public class leet28 {
    public static int strStr(String haystack, String needle) {
        if(needle=="") return 0;
        int hayLength = haystack.length();
        int needleLength = needle.length();
        for (int i=0;i<hayLength-needleLength+1;i++){
            String str = haystack.substring(i,i+needleLength);
            if (str.equals(needle)) return i;
        }
        return -1;
    }

    public static int[] getNext(String needle){
        int needleLength = needle.length();
        int[] result = new int[needleLength];
        result[0]= -1 ;
        int j = -1;
        for (int i=1;i<needleLength;i++){
            while(j>=0&&needle.charAt(j+1)!=needle.charAt(i)){
                j=result[j];
            }if(needle.charAt(j+1)==needle.charAt(i)){
                j++;
            }
            result[i]=j;
        }
        return result;
    }

    public static int strStrKMP(String haystack, String needle){
        if(needle=="") return 0;
        int hayLength = haystack.length();
        int needleLength = needle.length();
        int[] result = new int[needleLength];
        result = getNext(needle);
        int j=-1;
        for (int i=0;i<hayLength;i++){
            while(j>=0 && haystack.charAt(i)!=needle.charAt(j+1) ){
                j=result[j];
            }if (haystack.charAt(i)==needle.charAt(j+1)){
                j++;
            }if (j==needleLength-1){
                return i-needleLength+1;
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        System.out.println(
                strStrKMP("","")
        );
    }
}
