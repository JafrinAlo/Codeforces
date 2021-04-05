
package Word_59A;

import java.util.Scanner;
public class Word {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int countu=0;
        int countl=0;
        // Creating array of string length
        char[] ch = new char[s.length()];
  
        // Copy character by character into array
        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
            if(ch[i]<='Z')countu++;
            else if(ch[i]>'Z')countl++;
            
        }   
        
        if(countu>countl)System.out.println(s.toUpperCase());
        else
            System.out.println(s.toLowerCase());
    }
}
