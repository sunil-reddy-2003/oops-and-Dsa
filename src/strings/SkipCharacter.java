package strings;

public class SkipCharacter {
    static String skip(String str){
        if(str.isEmpty()){
            return str;
        }
        if(str.charAt(0)=='a'){
            return skip(str.substring(1));
        }else{
            return str.charAt(0)+skip(str.substring(1));
        }
    }
    public static void main(String[] args) {
        String str="baccarat";
        System.out.println(skip(str));
    }
}
