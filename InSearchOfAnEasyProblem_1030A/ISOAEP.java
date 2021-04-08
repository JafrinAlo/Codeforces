
package InSearchOfAnEasyProblem_1030A;

import java.util.Scanner;
 
public class ISOAEP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        int add=0;
       
        
        for (int i = 0; i <n; i++) {
            array[i]=sc.nextInt();
            if(array[i]>0)add++;
        }
       if(add>0)System.out.println("Hard");
       else
            System.out.println("EASY");
    }
}
