package Recursion.Sequences;

import java.util.ArrayList;

public class KthPermutationSequence {
    public static void main(String[] args) {
        System.out.println(getPermutation(4,9));
    }
    static String getPermutation(int n, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        int fact=1;
        for (int i = 1; i <n; i++) {
            fact=fact*i;
            list.add(i);
        }
        list.add(n);
        String ans="";
        k=k-1;
        while (true){
            ans+=list.get(k/fact);
            list.remove(k/fact);
            if(list.size()==0){
                break;
            }
            k=k%fact;
            fact=fact/list.size();

        }

        return ans;
    }

}
