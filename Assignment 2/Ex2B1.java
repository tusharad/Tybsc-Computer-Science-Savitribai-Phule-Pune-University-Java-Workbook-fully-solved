/*
1. Create a package named Series having three different classes to print series:
a. Prime numbers
b. Fibonacci series
c. Squares of numbers
Write a program to generate ‘n’ terms of the above series.
*/
import Series.*;
import java.io.*;
public class Ex2B1 {
  public static void main(String [] args)throws IOException{
 Prime p=new Prime();
 int i;
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 do
 {
 System.out.println("Enter a number / 0 to exit");
 i=Integer.parseInt(br.readLine());
 p.prime(i);
 p.fibonacci(i);
 p.square(i);
 }
 while(i>0);
 }
}
