//    Input: 10
/*  Output: 
10 = 3 + 7
10 = 5 + 5
10 = 7 + 3
*/
import java.util.Scanner;
public class SumOfPrimes {
  
    static boolean checkPrime(int n){
        int factor = 0;
        for(int i=1;i<=n;i++){
            if(n%i == 0){
                factor++;
            }
        }
        if (factor == 2)
            return true;
        else
            return false;
    }
    //2 + 8
    //3 + 7

    public static void main(String[] args) {
        System.out.println("Enter the number to express it as sum of primes");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        for(int i=2;i<=num; i++){
            if(checkPrime(i) && checkPrime(num-i)){
                System.out.println(num + " = " + i +" + "+ (num-i));
            }
        }
    }
}
