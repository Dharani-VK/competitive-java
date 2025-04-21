import java.util.Scanner;

public class LargestOfThree{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = sc.nextInt();
        System.out.print("Enter number 3 : ");
        int num3 = sc.nextInt();
        if ((num1 > num2 ) && (num1 > num3)){
            System.out.println("Number 1 ( " +num1 +" ) is Greater");
        }
        else if ((num2 > num1) && (num2 >num3)){
            System.out.println("Number 2 ( " +num2 +  " ) is Greater");
        }

        else {
            System.out.println("Number 3 ( " +num3 +" ) is Greater");
        }
    }
}
