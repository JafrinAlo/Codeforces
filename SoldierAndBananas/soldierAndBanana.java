
package SoldierAndBananas;

import java.util.Scanner;


public class soldierAndBanana {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        int k=sc.nextInt();
        int n=sc.nextInt();
        int w=sc.nextInt();
        maths obj=new maths();
        obj.math(k,n,w);
                
    }      
}

class maths{

     int k;
     int n;
     int w;
     void math(int k,int n,int w){
       this.k=k;
       this.n=n;
       this.w=w;
       int sum=0;
         for (int i = 1; i <= w; i++) {
             sum+=i;
             
         }
         int price=sum*k;
         int borrow=price-n;
         if(borrow<=0)System.out.println("0");
         else
         System.out.println(borrow);
         
    }
}