package meituan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tree {
    static List<Integer> list = new ArrayList<>();
    public static TreeNode makeTree(int[][] children,int val){
        if(val == 0) return null;
        TreeNode node = new TreeNode(val);
        node.left = makeTree(children,children[val-1][0]);
        node.right = makeTree(children,children[val-1][1]);
        return node;
    }

    public static void swap(int val,TreeNode node){
        if(node == null) return;
        if(node.val == val) {
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
            return;
        }else {
            swap(val,node.left);
            swap(val,node.right);
        }

    }
    public static void order(TreeNode node){
        if(node == null) return;
        order(node.left);
        list.add(node.val);
        order(node.right);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[][] children = new int[n][2];
        int[] ms = new int[m];
        for(int i=0;i<n;i++){
            children[i][0] = sc.nextInt();
            children[i][1] = sc.nextInt();
        }
        for(int i = 0; i < m; i++) {
            ms[i] = sc.nextInt();
        }
        TreeNode root = makeTree(children,k);
        for(int mNums:ms){
            swap(mNums,root);
        }
        order(root);
        String s ="";
        for(int number:list){
            s += number +" ";
        }
        s = s.trim();
        System.out.println(s);
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
    }
}