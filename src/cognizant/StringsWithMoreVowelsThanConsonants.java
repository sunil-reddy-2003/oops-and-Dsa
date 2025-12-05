package cognizant;

public class StringsWithMoreVowelsThanConsonants {
    public static void main(String[] args) {
//       String[] strArr={ "apple", "bat", "aeioo", "sky", "chat"};
        String[] strArr={"bbb", "ccc", "ddd"};
       int count=0;
        for (String str:strArr) {
            int vowel=0;
            int consonant=0;
            for (int i = 0; i < str.length(); i++) {
                if("aeiouAEIOU".indexOf(str.charAt(i))!= -1){
                    vowel++;
                }else{
                    consonant++;
                }
            }
            if(vowel>consonant) count++;
        }
        System.out.println(count);

    }
}
