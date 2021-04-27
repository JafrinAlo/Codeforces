
package Perfectly_Imperfect_Array_1514A;

import java.util.Scanner;


public class PerfectlyImperfectArray {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int[] a=new int[n];
            
            for (int j = 0; j < n; j++) {
            a[j]=sc.nextInt();
         }
         boolean flag=false;
         for (int j = 0; j< n; j++) {
             int s=(int) Math.sqrt(a[j]);
             if(s*s!=a[j]){
                 flag=true;
                 break;
             }
         }
         if(flag)System.out.println("YES");
         else
             System.out.println("NO");
        }
    }
}
