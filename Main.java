import java.util.*;
import java.io.*;
public class Main{
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an integer that you want all the 0's to be reapced with 5's");
    int n = sc.nextInt();
    System.out.println("Your integer is now " + convertNum(n));  
  }
  // Method convertNum:
  //TODO: Generalize for any replacements
  //Test implementation using string.replace(charOrig, [with] replacementChar) method
  public static int convertNum(int num) {
    String str = Integer.toString(num); // Turns the int into a string
    char[] arr = str.toCharArray(); // turns the string into a char array for easy editing of chars   
    //Goes though array, could have used enhanced for-loop
  for(int i = 0; i < arr.length; i++){
    if(arr[i]==('0')){
        arr[i] = '5';
      }
  }
    str = String.valueOf(arr); //turns the edited char-array into a string

return Integer.parseInt(str); // returns the new string parsed into an integer
  }
}
