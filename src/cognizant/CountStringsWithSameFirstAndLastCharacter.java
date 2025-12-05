package cognizant;

public class CountStringsWithSameFirstAndLastCharacter {
    public static void main(String[] args) {
        String[] strings={"apple", "aba", "code", "aa", "xyzx"};
        int count=0;
        for(String str : strings){
            if(str.charAt(0)==str.charAt(str.length()-1))count++;
        }
        System.out.println(count);
    }
}
