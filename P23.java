package Day3;

import java.io.*; 
import java.util.*; 
  
class P23 { 
    public static void main(String[] args) 
    { 
  
       
        LinkedList<Integer> ll 
            = new LinkedList<Integer>(); 
  
       
        for (int i = 1; i <= 5; i++) 
            ll.add(i); 
  
       
        System.out.println(ll); 
  
       
        ll.remove(3); 
  
        
        System.out.println(ll); 
  
       
        for (int i = 0; i < ll.size(); i++) 
            System.out.print(ll.get(i) + " "); 
    } 
} 


/*
 * Ans-[1, 2, 3, 4, 5] [1, 2, 3, 5] 1 2 3 5
 */