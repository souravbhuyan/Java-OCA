package Day3;

import java.util.*; 
public class P28 { 
    public static void main(String args[]) 
    {  
        HashSet<String> hs = new HashSet<String>(); 
  
        hs.add("Sourav"); 
        hs.add("Bhuyan"); 
        hs.add("Hello"); 
        hs.add("World"); 
        hs.add("Very Good"); 
  
       
        Iterator<String> itr = hs.iterator(); 
        while (itr.hasNext()) { 
            System.out.println(itr.next()); 
        } 
    } 
} 

/*
 * Ans-Hello Bhuyan Sourav World Very Good
 */
