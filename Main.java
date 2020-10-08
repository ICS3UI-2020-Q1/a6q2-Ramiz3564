 import java.util.Scanner; 
/**
 * This program will put 10 elements into an array and will search for a number and state where it is located
 * @author Zach Ramirez
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a scanner for user input 
    Scanner input = new Scanner(System.in); 

    //ask user for 10 integers 
    System.out.println("Please enter in 10 number to put into the array"); 

    //creating an array with 10 spots
    int[] integers = new int[10]; 
    //putting their numbers into array using a loop  
    for(int i = 0; i < 10; i++){
      integers[i] = input.nextInt(); 
    }    
    //asking user for a number to find 
    System.out.println("Please enter a number to find "); 
    int number = input.nextInt(); 

    //finding where the number is that they chose
    for(int i = 0; i < 10; i++){
      if(integers[i] == number){
        System.out.println(number + " is located at index " + i);
      }
    }
    
  }
}
