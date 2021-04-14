
package Hulk_705A;

import static java.lang.Math.ceil;

import java.util.Scanner;

public class hulk {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a="I hate ";
        String b="that ";
        String c="I love ";
        String d="it";
      

        Double d2=Double.valueOf(n);
        
        for (int i = 1; i <=ceil(d2/2.0)-1; i++) {
            
                    if(i!=d2){
                        System.out.print(a);
                        System.out.print(b);
                        System.out.print(c);
                        System.out.print(b);
                    }
        
        }
        if(n%2==0)System.out.print(a+b+c+d);
        if(n%2!=0)System.out.print(a+d);
        
    }
}
