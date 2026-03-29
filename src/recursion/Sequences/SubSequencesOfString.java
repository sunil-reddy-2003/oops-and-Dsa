package recursion.Sequences;

import java.util.ArrayList;

public class SubSequencesOfString {
    static ArrayList<String> subSeqList(String processed, String unProcessed){
        if(unProcessed.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(processed);
            return list;
        }
        char ch=unProcessed.charAt(0);

        ArrayList<String>  left = subSeqList(processed + ch, unProcessed.substring(1));

        ArrayList<String>  right=subSeqList(processed,unProcessed.substring(1));

        left.addAll(right);
        return left;

    }
    static void subSeq(String processed,String unProcessed){
        if(unProcessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch=unProcessed.charAt(0);

        subSeq(processed+ch,unProcessed.substring(1));

        subSeq(processed,unProcessed.substring(1));

    }
    public static void main(String[] args) {
        subSeq("","abc");
        System.out.println(subSeqList("","abc"));
    }
}
