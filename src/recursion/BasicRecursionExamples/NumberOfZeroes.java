package recursion.BasicRecursionExamples;

public class NumberOfZeroes {
    static int count=0;
    static int nbrOfZeros(int n,int count){
        //300203
        if(n==0){return count;}
        if(n%10==0){count++;}

        return nbrOfZeros(n/10,count);
    }

    public static void main(String[] args) {
        int result=nbrOfZeros(300,0);
        System.out.println(result);
    }
}
