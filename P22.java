package Day3;

import java.io.*; 
import java.util.*; 
  
class P22 { 
    public static void main(String[] args) 
    { 
  
      
        ArrayList<Integer> al 
            = new ArrayList<Integer>(); 
  
      
        for (int i = 1; i <= 5; i++) 
            al.add(i); 
  
     
        System.out.println(al); 
  
      
        al.remove(3); 
  
        
        System.out.println(al); 
  
       
        for (int i = 0; i < al.size(); i++) 
            System.out.print(al.get(i) + " "); 
    } 
} 

/*
 * Ans-[1, 2, 3, 4, 5] [1, 2, 3, 5] 1 2 3 5
 */