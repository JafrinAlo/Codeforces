
package WrongSubtraction;

import java.util.Scanner;
public class WrongSub {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        
        if(n<99){
            for (int i = 0; i < k; i++) {
                n=n-1;
            }
            System.out.println(n);
        }
        else if(n>99){
            for (int i = 0; i < k; i++) {
                if(n%10==0)n=n/10;
                else
                    n=n-1;

            }
            System.out.println(n);
        }
    }
}
