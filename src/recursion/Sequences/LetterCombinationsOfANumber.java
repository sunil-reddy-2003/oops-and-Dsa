package recursion.Sequences;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfANumber {


    static List<String> letterComb(String pro, String un_pro){
        if(un_pro.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(pro);
            return list;
        }
        int digit=un_pro.charAt(0)-'0';

        ArrayList<String> list=new ArrayList<>();

        for (int i = (digit-1)*3; i <digit*3; i++) {
            char ch=(char)(i+'a');
            list.addAll(letterComb(pro+ch,un_pro.substring(1)));
        }
        return list;
    }

    static void letterCombinations(String pro,String un_pro){
        if(un_pro.isEmpty()){
            System.out.println(pro);
            return;
        }
        int digit=un_pro.charAt(0)-'0';

        for (int i = (digit-1)*3; i <digit*3; i++) {
            char ch=(char)(i+'a');
            letterCombinations(pro+ch,un_pro.substring(1));
        }
    }

    public static void main(String[] args) {
        letterCombinations("","12");
        System.out.println(letterComb("","12"));

    }

}
