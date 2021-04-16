
package Nearly_Lucky_Number_110A;

import java.util.Scanner;


  class check{
       check(String n){
          int count=0;
        for (int i = 0; i<n.length(); i++) {
           
            if(n.charAt(i)=='4' || n.charAt(i)=='7')
    		    count++;
            
        }
        if(count==7 || count==4)System.out.println("YES");
            else
                System.out.print("NO");
    }
      
  }
public class NearlyLuckyNum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        check obj=new check(n);
    }    
}
