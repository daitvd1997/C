/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws2_2;

import java.util.Scanner;

/**
 *
 * @author Trinh Dai
 */
public class Entity {
    
    public static final int OVERTIME_RATE1 = 25;
    public static final int OVERTIME_RATE2 = 30;
    public static final int NORMAL_RATE = 20;

    public static void Entity() {
        Scanner s = new Scanner(System.in);
        bo exp = new bo();
        int totalPayRall = 0;
        int numEmployees = 0;
        do{
            System.out.println("Wellcome #"+numEmployees);
            
            System.out.print("Enter your ID: ");
            exp.setEmployeeID(s.nextInt());
            if(exp.getEmployeeID() != 0){
                int grossPay=0;
                System.out.print("Enter your hours work: ");
                exp.setHourWorks(s.nextInt());
                if(exp.getHourWorks() > 40) {
                    grossPay = (exp.getHourWorks() - 40) * OVERTIME_RATE2 + 5*OVERTIME_RATE1 + 35*NORMAL_RATE;
                } else if(exp.getHourWorks() > 35) {
                    grossPay = (exp.getHourWorks()-35)* OVERTIME_RATE1 + 35*NORMAL_RATE;
                } else {
                    grossPay = exp.getHourWorks()* NORMAL_RATE;
                }
                System.out.println("ID: "+exp.getEmployeeID()+"\nHours worked "+exp.getHourWorks()+"\nGrossPay "+grossPay+"\n");
                numEmployees++;
                totalPayRall += grossPay;
            }
        }while(exp.getEmployeeID() != 0);
        if(numEmployees != 0) {
            System.out.println("Number of pay details enterd was "+numEmployees);
            System.out.println("The total pay roll cost for the data entered is $" +totalPayRall);
        } else {
            System.out.println("NO EMPLOYEES ENTERED");
        }
    }
}    
