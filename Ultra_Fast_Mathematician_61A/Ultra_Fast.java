/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ultra_Fast_Mathematician_61A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ultra_Fast {
    public static void main(String[] args)throws IOException {
        BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
        String s1=inp.readLine();
        String s2=inp.readLine();
        compare obj=new compare();
        obj.comp(s1, s2);
    }
            
}
class compare{
    void comp(String s1, String s2){
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i)==s2.charAt(i))System.out.print("0");
            else
                System.out.print("1");
        }
    }
}
