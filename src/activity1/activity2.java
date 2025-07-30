
package activity1;

import java.util.Scanner;


public class activity2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter employee name: ");
        String employ = sc.nextLine();
        System.out.println("Enter hourly rate: ");
        float rate = sc.nextFloat();
        System.out.println("Enter total hours worked: ");
        float hours = sc.nextFloat();
        
        int wage = (int) (hours*rate);
        float SSS = (float) (wage*0.1);
        
        System.out.println("----Wage summary-----");
        System.out.println("Employee: "+employ);
        System.out.println("Hourly rate "+rate);
        System.out.println("Hours worked "+hours);
        System.out.println("Gross weekly wage "+wage);
        System.out.println("SSS Contribution(10%) "+SSS);
        System.out.println("-----------------------");
        System.out.println("Net weekly wage: "+(wage - SSS));
   
    }
    
}
