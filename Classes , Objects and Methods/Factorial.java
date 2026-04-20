/*
1. Write a class called
Factorial to print the factorial of an integer.*/



import java.util.Scanner;
class Factorial{
    
    
        int n;
        
        public void data(int n){
            int fact=1;
            for(int i=1;i<=n;i++){
                fact*=i;
            }
        
            System.out.println("Factorial of " + n + " is : " + fact);
        }
    }
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Factorial obj = new Factorial();
        
        System.out.print("Enter the value of n ");
        int n = sc.nextInt();
        
        obj.data(n);
    }
}
