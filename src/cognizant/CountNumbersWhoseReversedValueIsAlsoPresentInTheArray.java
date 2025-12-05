package cognizant;


import java.util.HashSet;

public class CountNumbersWhoseReversedValueIsAlsoPresentInTheArray {
    public static void main(String[] args) {
//        int[] numbers={12, 21, 33, 7};
//        int[] numbers={10, 1, 2, 20};
//        int[] numbers={13, 31, 45, 54, 99, 100};
//        int[] numbers={5, 50, 500};
        int[] numbers={10, 20, 30};

        HashSet<Integer> set=new HashSet<>();
        for (int n:numbers){set.add(n);}
        int c=0;
        for (int i = 0; i < numbers.length; i++) {
            int num=numbers[i];
            if(set.contains(reverse(num))){c++;}
        }
        System.out.println("total numbers : "+c);
    }
    static int reverse(int num){
        int sum=0;
        while(num>0){
            sum=num%10+sum*10;
            num/=10;
        }
        return sum;
    }
}
