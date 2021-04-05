
package QueueAtTheSchool;

import java.util.Scanner;


public class QueueAtTheSchool {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        //int t=sc.nextInt();
        int n=5;
        int t=1;
        //String line=sc.next();
        String line="BGGBG";
        
       
         char[] ch=line.toCharArray();
        
        for (int i = 0; i < t; i++) {
            //
            for (int j = 0; j < n-1; j++) {
                
                
                if(ch[j]=='B' && ch[j+1]=='G'){
                ch[j]='G';
                ch[j+1]='B';
                j++;
            }

            }
          }
        
       line=String.valueOf(ch);
        System.out.println(line);
    }
}
