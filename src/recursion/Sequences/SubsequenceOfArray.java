package recursion.Sequences;

import java.util.ArrayList;
import java.util.List;

public class SubsequenceOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        sequence(arr, 0, new ArrayList<>());

        System.out.println(resultList(arr));
    }

    // Collect subsequences into result
    static List<List<Integer>> resultList(int[] arr){
        List<List<Integer>> last = new ArrayList<>();
        sequenceViaListParam(arr, 0, new ArrayList<>(), last);
        return last;
    }

    // Backtracking approach
    static void sequenceViaListParam(int[] arr, int index, ArrayList<Integer> list, List<List<Integer>> last){
        if(index >= arr.length){
            last.add(new ArrayList<>(list));
            return;
        }
        // include
        list.add(arr[index]);
        sequenceViaListParam(arr, index+1, list, last);

        // backtrack
        list.remove(list.size()-1);

        // exclude
        sequenceViaListParam(arr, index+1, list, last);
    }

    // Direct print subsequences
    static void sequence(int[] arr, int index, ArrayList<Integer> list){
        if(index >= arr.length){
            System.out.println(list);
            return;
        }
        // include
        list.add(arr[index]);
        sequence(arr, index+1, list);

        // backtrack
        list.remove(list.size()-1);

        // exclude
        sequence(arr, index+1, list);
    }

    // Functional style (return subsequences)
    static ArrayList<ArrayList<Integer>> sequenceList(int[] arr, int index, ArrayList<Integer> list) {
        if(index >= arr.length){
            ArrayList<ArrayList<Integer>> result = new ArrayList<>();
            result.add(new ArrayList<>(list)); // deep copy
            return result;
        }

        // include
        list.add(arr[index]);
        ArrayList<ArrayList<Integer>> left = sequenceList(arr, index+1, list);

        // backtrack
        list.remove(list.size()-1);

        // exclude
        ArrayList<ArrayList<Integer>> right = sequenceList(arr, index+1, list);

        left.addAll(right);
        return left;
    }
}
