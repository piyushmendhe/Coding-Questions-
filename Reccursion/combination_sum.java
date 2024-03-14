package Reccursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class combination_sum {
        static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B)
    {
        // add your code here
        ArrayList<ArrayList<Integer>> ans =  new ArrayList<>();
        ArrayList<Integer> op = new ArrayList<>();
        Set<Integer> set = new HashSet<>(A);
        A.clear();
        A.addAll(set);
        Collections.sort(A);
        int n = A.size();
        int sum = 0;
        int i = 0;
        combination(A, i, n, sum, B, op, ans);
        return ans;
    }
    public static void combination(ArrayList<Integer> A, int i, int n, int sum, int target, ArrayList<Integer> op, ArrayList<ArrayList<Integer>> ans) {
        if(sum == target) ans.add(op);
        if(i == n || sum >= target) return;
        
        ArrayList<Integer> temp = new ArrayList<>(op);
        temp.add(A.get(i));
        combination(A, i, n, sum + A.get(i), target, temp, ans);
        combination(A, i + 1, n, sum, target, op, ans);
    }

public static void main(String[] args) {
    combination_sum res = new combination_sum();
    ArrayList<Integer> A = new ArrayList<>(Arrays.asList(7, 2, 6, 5));
    int B = 16;

    System.out.println(res.combinationSum(A, B));
}
}
