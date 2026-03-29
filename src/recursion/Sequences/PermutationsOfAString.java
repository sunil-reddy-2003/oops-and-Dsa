package recursion.Sequences;

public class PermutationsOfAString {

    static void permutations(String pro,String un_pro){
        if(un_pro.isEmpty()){
            System.out.println(pro);
            return;
        }
        char ch=un_pro.charAt(0);
        int size=pro.length();
        for (int i = 0; i <= pro.length(); i++) {
            String f= pro.substring(0,i);
            String s=pro.substring(i,size);
            permutations(f+ch+s,un_pro.substring(1));
        }
    }

    public static void main(String[] args) {
        permutations("","abc");
    }

}
