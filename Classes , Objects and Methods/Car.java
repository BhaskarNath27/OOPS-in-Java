/*
Write a java program which will create
an object, namely, 'Car', following methods are available and   will work as :

                        a.carStart() : Will start the car with speed 30                   
                        b. carSlow()  : will reduce the speed of the car to 20
                        c. carFast()  : will increase the speed of the car to 30
                        d. printSpeed() : for alteration the speed, each time display the speed.

  */

import java.util.Scanner;
class car{
    
    float speed ;
    
    public void carStart(){
        speed=30;
        printSpeed();
        
    }
    
    public void carSlow(){
        speed=20;
        printSpeed();
        
    }
    
    public void carFast(){
        speed=30;
        printSpeed();
        
    }
    
    public void printSpeed(){
        System.out.println("current speed: " + speed);
        
        
    }
}

public class Main{
    public static void main(String[] args ){
        Scanner sc=new Scanner(System.in);
        car obj = new car();
        
        int choice = 0;
        
        while(choice !=4){
            System.out.println("Enter the choice from below options :-");
            System.out.println("1.Start the car");
            System.out.println("2.Slowdown the car speed");
            System.out.println("3.Increase the speed of the car");
            System.out.println("4.Exit the program ");
        
    
        
            choice = sc.nextInt();
        
            switch(choice){
                case 1:
                    obj.carStart();
                    break;
                case 2:
                    obj.carSlow();
                    break;
                case 3:
                    obj.carFast();
                    break;
                case 4:
                    System.out.println("Program Terminated ");
                    break;
                default :
                    System.out.println("Invalid Choice");
            }
        

        }
    }
}
