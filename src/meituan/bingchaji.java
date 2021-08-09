package meituan;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class bingchaji {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int mid = n/2;
        //并查集map
        Map<Integer,Integer> map = new HashMap<>();
        int count =0;
        for(int i=0;i<mid;i++){
            int index1 = find(map,nums[i]);
            int index2 = find(map,nums[i+mid]);
            if(index1 != index2){
                union(map,index1,index2);
                count++;
            }
        }
        System.out.println(count);
    }
    public static void union(Map<Integer,Integer> map,int index1,int index2){
        map.put(find(map,index1),find(map,index2));
    }
    public static int find(Map<Integer,Integer> map,int index){
        if(map.getOrDefault(index,index) == index){
            return index;
        }
        int value = find(map,map.get(index));
        map.put(index,value);
        return value;
    }
}
