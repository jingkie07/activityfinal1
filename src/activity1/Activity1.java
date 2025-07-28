
package activity1;

import java.util.Scanner;


public class Activity1 {

   
    public static void main(String[] args) {
     
        Scanner  gre = new Scanner(System.in);
        
        String name;
        int grade = 0;

        
        System.out.println("Enter Student name:");
        name= gre.nextLine();
        System.out.println("Enter number of subject");
        int sub = gre.nextInt();
        
            for (int x = 1;  x <= sub; x++){
        System.out.println("Enter grade for sub"+x+": ");
        grade += gre.nextInt();
                 
          }
               float ave = grade/sub;
               
               System.out.println("Average " +ave+": ");
               
               if (ave <=75){
                    System.out.println("Remarks: FAILED");               
               
                }else{
                    System.out.println("Remarks: PASSED");
}
}
    
    }
