package cognizant;

public class StringEncodeByCharFreq {
    public static void main(String[] args) {
        String str="abcc";
        int count=1;
        StringBuilder ans= new StringBuilder();
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            }else{
//            if(str.charAt(i)!=str.charAt(   i-1)){
                ans.append(str.charAt(i - 1));
                ans.append(count);
                count=1;
            }

        }
        ans.append(str.charAt(str.length() - 1));
        ans.append(count);
        System.out.println(ans);
    }
}
