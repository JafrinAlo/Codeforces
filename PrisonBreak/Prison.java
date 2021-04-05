/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrisonBreak;

import java.util.Scanner;

public class Prison {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(a*b);
        }
    }
}
