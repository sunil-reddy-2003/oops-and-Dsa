package Strings;


public class AlphaNum
{
    public static void main(String[] args) {
        String str="a1b2c3";
        String alpha="";
        String num="";
        for (int i=0;i<str.length();i++ ){
            if((str.charAt(i)>='a' && str.charAt(i)<='z') || (str.charAt(i)>='A' && str.charAt(i)<='Z')){
                alpha+=str.charAt(i);
            }
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                num+=str.charAt(i);
            }
        }
        System.out.println(alpha+num);
    }
}