
package Translation;

import java.util.Scanner;

public class translation_41A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        
        StringBuilder input=new StringBuilder(s);
        
        
       
        if(t.equals(input.reverse().toString()))System.out.println("YES");
        else  
            System.out.println("NO");
        
    }
}
