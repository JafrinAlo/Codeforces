
package GeorgeAndAccomodation;

import java.util.Scanner;

public class GandA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        
        int count=0;
        for (int i = 0; i < n; i++) {
            int p=sc.nextInt();
            int q=sc.nextInt();
            int sub=q-p;
            if(sub>1)count++;
        }
        System.out.println(count);
    }
}
