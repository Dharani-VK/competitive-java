import java.util.Scanner;
public class PrimeFactors{
    public static void factor(int n){
        if (n < 2){
            System.out.println("there is no Prime Factors for " +n);
            return;
        }
        System.out.println("The Prime factors are : " );
        while(n% 2 == 0){
            System.out.println(2 );
            n /= 2;
        }

        for(int i = 3 ; i*i <= n ; i+=2){
            while(n%i == 0){
                System.out.println(i +" ");
                n /= i;
            }
        }
        if (n > 2) {
            System.out.print(n);
        }
    
    }
    public static void main(String[] args){
        System.out.println("Enter a number to print the Factors ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factor(n);


    }
}
