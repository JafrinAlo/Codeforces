
package Presents_136A;

import java.util.Scanner;

public class presents {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int[] p=new int[n+1];
        for (int i = 1; i<=n; i++) {
            p[i]=sc.nextInt();//will take the input in an array
        }
        for (int j = 1; j <=n; j++) {
            for (int i = 1; i <=n; i++) {
                if(p[i]==j)System.out.print(i+" ");
            }
        }
    }
}
