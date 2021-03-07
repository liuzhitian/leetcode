import java.util.LinkedHashSet;
import java.util.Set;

public class leet202 {
    public boolean isHappy(int n) {

        Set set = new LinkedHashSet();
        while(true){
            int count = 0;
            int tmp = n;
            while(tmp!=0){
                count += (tmp%10)*(tmp%10);
                tmp=tmp/10;
            }
            if (count == 1) return true;
            else if(set.contains(count)) return false;
            else {
                set.add(count);
                n = count;
            }
        }
    }
}
