
package Drinks_200B;

import java.util.Scanner;


public class drinks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Double s=0.0;
        int[] p=new int[n];
        for (int i = 0; i < n; i++) {
            p[i]=sc.nextInt();
             Double p2=Double.valueOf(p[i]);
             s+=(p2/100);
        }
        Double n2=Double.valueOf(n);
        System.out.println(String.format("%.12f",(s/n2)*100.0));
        
    }
}
