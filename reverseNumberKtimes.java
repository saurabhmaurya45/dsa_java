/*

Reverse number k times

*/

import java.util.*;
import java.lang.Math;

class ReverseNumber{
    // reverse function
    public static int reverseNumber(int num) {
        int revNum = 0;
        while(num>0){
            int mod  = num%10;
            revNum = revNum*10 + mod;
            num /= 10;
        }
        return revNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputVal = 12345;
        int k=2;
        int revNum = reverseNumber(inputVal);
        int temp = revNum;
        int num1 = 0;
        int num2 = 0;
        for(int i=1; i<=k; i++){
            int remender = temp%10;
            num1 = num1*10+ remender;
            temp /=10;
        }

        for(int i=k; i<=Math.log10(inputVal); i++){
            int remender = temp%10;
            num2 = num2*10+ remender;
            temp /=10;
        }
        long result = num2 * (int)Math.pow(10, k)+num1;
        System.out.println(result);
        

        sc.close();
    }

}