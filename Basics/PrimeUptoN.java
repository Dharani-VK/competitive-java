import java.util.Scanner;
public class PrimeUptoN{
    public static void Sieve( int limit){
        if(limit < 2){
            System.out.print(limit +"is not a Prime number");
            return;
        }
        
        System.out.println("The Prime numbers are : ");

    
        boolean[] is_prime = new boolean[limit+1];
        for (int i = 0 ; i<=limit; i++){
            is_prime[i]= true;
        }

        is_prime[0] = false;
        is_prime[1] =false;


        for (int i = 2 ; i*i <= limit ; i++){
            if (is_prime[i]){
                for(int j = i*i ; j <= limit ; j += i){
                    is_prime[j] = false;
                }
            }
        }

        for (int i =0; i <= limit ; i++){
            if (is_prime[i]){
                System.out.println(i);
            }
        }
   
    }

    public static void main(String[] args){
        System.out.println("Enter a number to print the Prime numbers upto N ");
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        Sieve(limit);
        sc.close();

    }
}
