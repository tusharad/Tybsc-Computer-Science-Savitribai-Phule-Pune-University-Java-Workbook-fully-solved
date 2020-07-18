/* Define a class MyNumber having one private int data member. Write a default constructor to
initialize it to 0 and another constructor to initialize it to a value (Use this). Write methods
isNegative, isPositive, isZero, isOdd, isEven. Create an object in main. Use command line
arguments to pass a value to the object (Hint : convert string argument to integer) and perform the
above tests. Provide javadoc comments for all constructors and methods and generate the html
help file. */

public class Ex1B2 {
 private int x;
 public Ex1B2(){
  x=0;
 }
 public Ex1B2(int x){
  this.x=x;
 }
 public boolean isNegative(){
  if(x<0)
   return true;
  else return false;
 }
 public boolean isPositive(){
  if(x>0)
   return true;
  else return false;
 }
 public boolean isZero(){
  if(x==0)
   return true;
  else return false;
 }
 public boolean isOdd(){
  if(x%2!=0)
   return true;
  else return false;
 }
 public boolean isEven(){
  if(x%2==0)
   return true;
  else return false;
 }
 
 public static void main(String [] args) 
 {
  int x = Integer.parseInt(args[0]);
  Ex1B2 m=new Ex1B2(x);
  if(m.isNegative())
   System.out.println("Number is Negative");
  if(m.isPositive())
   System.out.println("Number is Positive");
  if(m.isEven())
   System.out.println("Number is Even");
  if(m.isOdd())
   System.out.println("Number is Odd");
  if(m.isZero())
   System.out.println("Number is Zero");
 }

}
