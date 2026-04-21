/*
write a java program to print sum of digits using constructors 
*/



import java.util.Scanner;

class SumOfDigits {

    SumOfDigits(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }
        System.out.println("Sum of digits = " + sum);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 5-digit number: ");
        int num = sc.nextInt();

        new SumOfDigits(num);   
    }
}
