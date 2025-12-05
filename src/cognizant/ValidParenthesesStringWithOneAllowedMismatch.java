package cognizant;

import java.util.Stack;

public class ValidParenthesesStringWithOneAllowedMismatch {
    public static void main(String[] args) {
//        String s = "()()";
//        String s = "())()";
//        String s = "(()))";
//        String s = "((((";
        String s = ")()(";
        Stack<Character> stack= new Stack<>();
        int skip =0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }else if(!stack.isEmpty() && s.charAt(i)==')' && stack.peek()=='('){
                stack.pop();
            } else if (stack.isEmpty() && s.charAt(i)==')') {
                skip++;
            }
        }
        if(skip==0 || skip==1) System.out.println("valid parentheses");
        else System.out.println("invalid parentheses");
    }
}
