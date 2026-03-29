package strings;

public class SubSequences {
    static void allSeq(String empty,String str){
        if(str.isEmpty()){
            System.out.println(empty);
            return;
        }
        char ch=str.charAt(0);
        allSeq(empty+ch,str.substring(1));
        allSeq(empty,str.substring(1));
    }
    public static void main(String[] args) {
        allSeq("","abc");
    }
}
