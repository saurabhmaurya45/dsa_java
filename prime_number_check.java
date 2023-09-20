// Check if the number is prime or not
import java.util.*;

class prime_number_check{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number to check for prime number");
        int inputNumber = sc.nextInt();
        boolean flag = true;
        if(inputNumber == 2){
            flag = true;
        }
        else{
            for(int i = 2; i*i<=inputNumber; i++){
                if(inputNumber%i == 0){
                    flag=false;
                    break;
                }
            }
        }
        if(flag){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not prime");
        }
        sc.close();
    }

}

//--------------------
// Another Logic
// for(int i = 2; i<inputNumber; i++){
//     if(inputNumber%i == 0){
//         flag=0;
//         break;
//     }
// }