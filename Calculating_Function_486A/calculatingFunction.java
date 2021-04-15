
package Calculating_Function_486A;




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
