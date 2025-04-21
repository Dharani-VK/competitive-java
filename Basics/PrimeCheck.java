import java.util.Scanner;

public class PrimeCheck{
    public static boolean isPrime(int num){
        if ( num < 1) return false;
        if (num < 3) return true;
        if((num % 2 == 0 ) || (num % 3 == 0)) return false;

        for( int i = 5 ; i*i <= num ; i+= 6){
            if( (num % i == 0) || num % (i+1) == 0){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args){
        System.out.print("Enter a number to check if it is Prime ot Not : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (isPrime(num)){
            System.out.println(num +" is a Prime Number");
        }
        else{
            System.out.println(num + " is not a Prime Number");
        }

        sc.close();
    }
}
