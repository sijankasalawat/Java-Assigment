package Assigment.src;

import java.util.Scanner;

public class Electricity {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the total consume unit:");
        int unit = scanner.nextInt();
        double Amount , Sur_charge,Total_Amount;




        if (unit<=50) {
            Amount= unit * 0.50;
            Sur_charge =0.2 * Amount;

        }
        else if(unit<=150){
            Amount= 25+((unit-50)*0.75);
            Sur_charge=0.2*Amount;
        }
        else if(unit<=250){
            Amount=25+((unit-150)*1.20);
            Sur_charge=0.2*Amount;
        }
        else{
            Amount=25+((unit-250)*1.50);
            Sur_charge=0.2*Amount;
        }
        Total_Amount = Amount + (0.8*Amount);
        System.out.println(Total_Amount);
    }
}

