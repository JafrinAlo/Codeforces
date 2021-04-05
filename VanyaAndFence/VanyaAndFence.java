
package VanyaAndFence;

import java.util.Scanner;

public class VanyaAndFence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int h=sc.nextInt();
        int count=0;
        for (int i = 1; i <= n; i++) {
            int[] a=new int[n+1];
            a[i] =sc.nextInt();
            
            if(a[i]<=h)count++;
            else if(a[i]>h){
                count++;
                        count++;
            }
        }
        System.out.println(count);
    }
}
