import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class leetcode332 {
    static List<String>  result = new LinkedList<>();
    static Deque<String> list = new LinkedList<>();
    public static void backtracting(List<List<String>> tickets,boolean[] used){
        if(list.size() == tickets.size()+1){
            List<String> newList = new LinkedList(list);

            if(result.size()==0){
                for(String s:newList){
                    result.add(s);
                }
                return;
            }

            List<String> oldList = result;

            for(int i=0;i<oldList.size();i++){
                int compare = oldList.get(i).compareTo(newList.get(i));
                if(compare > 0){
                    result.clear();
                    for(String s:newList){
                        result.add(s);
                    }
                    break;
                }
                if (compare<0){
                    break;
                }
            }
            return;
        }

        for(int i=0;i<tickets.size();i++){
            if(used[i] == true){
                continue;
            }
            List<String> tmp = tickets.get(i);
            if(list.size()==0){
                list.offerLast(tmp.get(0));
                list.offerLast(tmp.get(1));
                used[i] = true;
                backtracting(tickets,used);
                list.pollLast();
                list.pollLast();
                used[i] = false;
            }
            if(tmp.get(0)==list.peekLast()){
                list.offerLast(tmp.get(1));
                used[i] = true;
                backtracting(tickets,used);
                list.pollLast();
                used[i] = false;
            }
        }

    }

    public static List<String> findItinerary(List<List<String>> tickets) {
        boolean[] used = new boolean[tickets.size()];
        Arrays.fill(used,false);
        backtracting(tickets,used);
        return result;
    }

    public static void main(String[] args) {
        List<List<String>> tickets = new LinkedList<>();
        tickets.add(new LinkedList<String>(Arrays.asList(new String[]{"JFK","SFO"})));
        tickets.add(new LinkedList<String>(Arrays.asList(new String[]{"JFK","ATL"})));
        tickets.add(new LinkedList<String>(Arrays.asList(new String[]{"SFO","ATL"})));
        tickets.add(new LinkedList<String>(Arrays.asList(new String[]{"ATL","JFK"})));
        tickets.add(new LinkedList<String>(Arrays.asList(new String[]{"ATL","SFO"})));
        List<String> listtt = findItinerary(tickets);
        for(String s:listtt){
            System.out.println(s);
        }

    }
}
