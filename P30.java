package Day3;

import java.util.*; 
public class P30 { 
    public static void main(String args[]) 
    { 
        
        HashMap<Integer, String> hm 
            = new HashMap<Integer, String>(); 
  
        hm.put(1, "Sourav"); 
        hm.put(2, "For"); 
        hm.put(3, "Good"); 
  
       
        System.out.println("Value for 1 is " + hm.get(1)); 
  
       
        for (Map.Entry<Integer, String> e : hm.entrySet()) 
            System.out.println(e.getKey() + " " + e.getValue()); 
    } 
} 

/* Ans- Value for 1 is Sourav
1 Sourav
2 For
3 Good
*/