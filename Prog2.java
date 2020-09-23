class Prog2 { 
    public static void main(String[] args) 
    { 
        String s = new String("hello"); 
        String s2 = s; 
  
        if (s == s2) { 
            System.out.println("=="); 
        } 
  
        if (s.equals(s2)) { 
            System.out.println("equals"); 
        } 
    } 
} 