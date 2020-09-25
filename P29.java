package Day3;

import java.util.*; 
public class P29 { 
    public static void main(String args[]) 
    { 
        
        LinkedHashSet<String> lhs 
            = new LinkedHashSet<String>(); 
  
        lhs.add("Hiiii"); 
        lhs.add("Byeee"); 
        lhs.add("good"); 
        lhs.add("Bad"); 
        lhs.add("Very helpful"); 
  
      
        Iterator<String> itr = lhs.iterator(); 
        while (itr.hasNext()) { 
            System.out.println(itr.next()); 
        } 
    } 
} 
/*
 * Ans-Hiiii Byeee good Bad Very helpful
 */