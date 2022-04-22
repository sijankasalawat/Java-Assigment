package Assigment.src;

import java.util.Scanner;

public class Daysss {
    public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the number between 0 to 6:");
            int day= scanner.nextInt();
            switch(day){
                case 0:
                    System.out.println("Monday");
                    break;
                case 1:
                    System.out.println("Tuesday");
                    break;
                case 2:
                    System.out.println("Wednesday");
                    break;
                case 3:
                    System.out.println("Thursday");
                    break;
                case 4:
                    System.out.println("Friday");
                    break;
                case 5:
                    System.out.println("Saturday");
                case 6:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("wrong input");
                    break;



            }
        }
    }

class Odd_Even{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num= scanner.nextInt();
        switch (num%2){
            case 0 :
                System.out.println("it's even");
            case 1 :
                System.out.println("it's odd") ;


        }


    }
}

