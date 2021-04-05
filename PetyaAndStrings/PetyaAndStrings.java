/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PetyaAndStrings;

import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str1=input.nextLine();
        String str2=input.nextLine();
        int count=str1.compareToIgnoreCase(str2);
        if(count==0)System.out.print("0");
        if(count>0)System.out.print("1");
        if(count<0)System.out.print("-1");
        //if(str1.equalsIgnoreCase(str2))System.out.print("1");
        //if(str2.equalsIgnoreCase(str1))System.out.print("-1");
        //if(str1.equals(str2))System.out.print("0");
        //System.out.print(str1.compareTo(str2));
        //System.out.print(str1.compareTo(str2));
        
    }
    
}
