package Placement.LTIMindtree;

public class LTIMindtree_2 {
    public static void main(String[] args) {
        int n=124;
        int  rev=0;
        System.out.println(reverse(n,rev));
    }

    static int reverse(int n,int rev){

        if(n==0){
            return rev;
        }
        return reverse(n/10,rev*10+n%410);
    }
}
