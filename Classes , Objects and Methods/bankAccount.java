/*
4. Design a class to represent a Bank account. Include
the following members:

Data members :-
Name of the depositor
Account No
Type of Account  
Balance amount in the account

Methods:-
To assign initial values
To deposit an amount
To withdraw an amount after checking balance
To display the name and balance

*/


import java.util.Scanner;
class Bank{
    
    String name;
    int account_No;
    String type_of_account;
    double balance;
    
    public void setData(String name, int account_No, String type_of_account, double balance) {
        this.name = name;
        this.account_No = account_No;
        this.type_of_account = type_of_account;
        this.balance = balance;
    }
    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double reqAmt){
        if (balance<reqAmt) System.out.println("Balance low !!!!");
        else balance-=reqAmt;
    }
    public void display(){
        System.out.println("Name of Account Holder : " + name);
        System.out.println("Balance : " + balance);
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Bank obj=new Bank();
        
        System.out.println("Please Enter the details of the Account Holder ");
        
        System.out.print("Name : ");
        String name=sc.nextLine();
        
        System.out.print("Account no : ");
        int account_No=sc.nextInt();
        
        sc.nextLine(); 
        
        System.out.print("enter account type : ");
        String type_of_account=sc.nextLine();
        
        System.out.print("enter initial balance : ");
        double balance =sc.nextDouble();
        
        obj.setData(name, account_No, type_of_account, balance);

        System.out.print("Enter amount to deposit: ");
        double dep = sc.nextDouble();
        obj.deposit(dep);

    
        System.out.print("Enter amount to withdraw: ");
        double wd = sc.nextDouble();
        obj.withdraw(wd);

        
        obj.display();
    }
}
