package Day3;

import java.util.*; 
public class P25 { 
    public static void main(String args[]) 
    { 
        Stack<String> stack = new Stack<String>(); 
        stack.push("Sourav"); 
        stack.push("For"); 
        stack.push("Hello"); 
        stack.push("World"); 
  
       
        Iterator<String> itr 
            = stack.iterator(); 
  
        
        while (itr.hasNext()) { 
            System.out.print(itr.next() + " "); 
        } 
  
        System.out.println(); 
  
        stack.pop(); 
  
      
        itr 
            = stack.iterator(); 
  
       
        while (itr.hasNext()) { 
            System.out.print(itr.next() + " "); 
        } 
    } 
} 

/* Ans-Sourav For Hello World 
Sourav For Hello  */