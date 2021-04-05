
package Tram;

import java.util.Scanner;


public class tramTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arraya=new int[1000];
        int[] arrayb=new int[1000];
        for (int i = 0; i < n; i++) {
            arraya[i]=sc.nextInt();
            arrayb[i]=sc.nextInt();
        }
        int k=arraya[0];
        int max=0;
        for (int i = 0; i < n; i++) {
            int ans=arrayb[i]-arraya[i]+k;
            k=ans;
            if(ans>max)max=ans;
        }
        System.out.println(max);
        
            
    }
}
