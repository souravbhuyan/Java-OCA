import java.io.*; 
import java.util.*; 
  
class Prog8 { 
  
    public static void main(String[] args) 
    { 
  
        // Declaring an ArrayList 
        ArrayList<Integer> arrli 
            = new ArrayList<Integer>(); 
  
        // Appending the new elements 
        // at the end of the list 
        for (int i = 1; i <= 5; i++) 
            arrli.add(i); 
  
        // Printing the ArrayList 
        System.out.println(arrli); 
  
        // Removing an element from the 
        // List 
        arrli.remove(3); 
  
        // Printing the ArrayList after 
        // removing the element 
        System.out.println(arrli); 
    } 
} 