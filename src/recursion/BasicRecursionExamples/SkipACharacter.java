package recursion.BasicRecursionExamples;

public class SkipACharacter {
    static void skip(String processed,String unProcessed){
        if(unProcessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch=unProcessed.charAt(0);

        if(ch=='x'){
            skip(processed,unProcessed.substring(1));
        }else {
            skip(processed+ch,unProcessed.substring(1));
        }

    }
    public static void main(String[] args) {
        skip("","abxc");
    }
}
