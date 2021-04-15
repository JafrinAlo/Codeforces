/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculating_Function_486A;

//import java.util.Scanner;




/*import java.util.Scanner;

class calculate{
    int sum=0;
    int calculate(int n){
         for (int i = 1; i <=n; i++) {
            if(i%2!=0){int temp=0;
            temp=i;
            //temp=-temp;
            sum+=-temp;}
            
            else if(i%2==0)   
            sum+=i;
        }
        System.out.println(sum);
        return 0;
    }
}

public class calculatingFunction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        calculate obj=new calculate();
        obj.calculate(n);
        //int sum=0;
       /* for (int i = 1; i <=n; i++) {
            if(i%2!=0){int temp=0;
            temp=i;
            //temp=-temp;
            sum+=-temp;}
            
            else if(i%2==0)   
            sum+=i;
        }
        System.out.println(sum);
    }
}*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class calculatingFunction {

    public static void main(String[] args) throws Exception {
      BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
      long n = Long.parseLong(inp.readLine());
       if(n%2==0){
           
               System.out.println(n/2);
    }
       if(n%2==1){
           System.out.println((n+1)/-2);}
    }
}
