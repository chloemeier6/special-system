/** Name: Chloe Meier
  * Course: CSE 271 Section A
  * Date: 2/14/18
  * File Name: BugTest
  * Description: allows user to move bug backward and forward 
  * */

import java.util.Scanner;
public class BugTest {
   public static void main(String[] args) {
      
      System.out.println("==Bug Solution==");
      System.out.println("Enter the initial position of the bug: ");
      
      //user chooses where the bug starts
      Scanner keyboard = new Scanner(System.in);
      int initialPosition = keyboard.nextInt();
      
      //creates bug object
      Bug bug1 = new Bug(initialPosition);
      int choice;
      
      do {   
         System.out.println("-Menu-");
         System.out.print("1. Change direction. \n2. Move. \n3. Exit.");
         System.out.print("\nEnter your choice: ");
         
         choice = keyboard.nextInt(); //allows user to choose what to do on the menu
         
         while(choice>3 || choice<1) { //if user enters a number not between 1 and 3
            System.out.println("Invalid input!");
            System.out.print("Enter new choice: "); //user must enter new menu choice
            choice=keyboard.nextInt();
         }
         
         switch(choice) { //user chooses what they want the bug to do 
            case 1: 
               bug1.turn();
               bug1.getPosition();
               break;
            case 2: 
               bug1.move(); 
               bug1.getPosition();
               break;
            case 3:
               break;
            default:  
               System.out.println("***Invalid option!");        
               
         }
         
      }while (choice < 3 && choice > 0);
   }
}