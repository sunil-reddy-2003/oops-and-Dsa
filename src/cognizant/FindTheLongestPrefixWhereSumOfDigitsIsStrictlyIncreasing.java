package cognizant;

public class FindTheLongestPrefixWhereSumOfDigitsIsStrictlyIncreasing {
    public static void main(String[] args) {
//        int[] numArr={11, 23, 45, 67, 89};
//        int[] numArr={10, 22, 31, 40, 59};
//        int[] numArr={123, 99, 100, 5};
        int[] numArr={50, 41, 32};
        int value=1;
        int count=1;
        for (int i = 1; i < numArr.length; i++) {
            int first=sum(numArr[i-1]);
            int second=sum(numArr[i]);
            if(first<second){
                count++;
            }else {
                count=1;
            }
            value=Math.max(count,value);

        }
        System.out.println(value);
    }
    static int sum(int num){
        int temp=0;
        while (num>0){
            temp=temp+num%10;
            num=num/10;
        }
        return temp;
    }
}
