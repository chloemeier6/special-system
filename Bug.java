/** Name: Chloe Meier
  * Course: CSE 271 Section A
  * Date: 2/14/18
  * File Name: Bug.java
  * Description: Creates methods for the certain moves the bug object can make
  * */

public class Bug {
   
   //current position of the bug and direction the bug is moving
   //if the direction is false, bug moves to the left. if direction is true, bug moves to the right
   private int position;
   private boolean direction;
   
   //initializes the initial position and direction of the bug
   public Bug(int initialPosition) {
      this.position=initialPosition;
      this.direction=false;
   }
   
   
   //turns the bug in the opposite direction
   public void turn() {
      if(this.direction==false) {
         this.direction=true;
      }  
      else {
         this.direction=false;
      }
   }
   
   //moves the bug forward or backwards one step
   public void move() {
      if(this.direction==false) {
         this.position=position-1;
      }
      
      else {
         this.position=position+1;
      }
   }
   
   
   
   //prints the current position of the bug
   public int getPosition() {
      if(this.direction==true) {
         System.out.println("Position: " + this.position + "\tDirection: right");
      }
      
      if(this.direction==false) {
         System.out.println("Position: " + this.position + "\tDirection: left");
      }
      return this.position;
   }
   
   
   
}