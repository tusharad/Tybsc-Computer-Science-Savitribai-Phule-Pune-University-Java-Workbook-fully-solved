/*Define a class SavingAccount (acNo, name, balance). Define appropriate constructors and
operations withdraw(), deposit() and viewBalance(). The minimum balance must be 500.
Create an object and perform operations. Raise user defined InsufficientFundsException when
balance is not sufficient for withdraw operation.
*/
package Assignment4;

import java.io.*;

class InsufficientFundsException extends Exception
{
}


class SavingAccount
{
               int ano;
                               String name;
               float bal;
               BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
               SavingAccount(int a,String nm,float b)
               {
                               ano=a;
                                               name=nm;
                                               bal=b;
               }

               void withdraw() throws Exception
               {
                               System.out.println("Enter amount to be withdraw ");
                               float amt=Integer.parseInt(br.readLine());
                               double temp;
                               try
                               {
                            	   				temp = bal - amt;
                                               if(amt>bal || temp<500 )
                                                               throw new InsufficientFundsException();
                                               else
                                               {
                                                               bal=bal-amt;
                                                               System.out.println("Withdarawl amt successfully ....");
                                               }
                               }
                               catch(InsufficientFundsException ob)
                               {
                                               System.out.println("Insufficient Balance");
                               }
               }
               void deposit() throws Exception
               {
                               System.out.println("Enter amount to be withdraw ");
                               float amt=Integer.parseInt(br.readLine());
                               bal=bal+amt;
                               System.out.println("Deposit amt successfully ....");
               }
               void viewBalance()
               {
                               System.out.println("Balance "+bal);
               }
}

class Ex3A2
{
               public static void main(String ar[]) throws Exception
               {
                               BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                               System.out.println("Enter Account no:");
                                               int  a =Integer.parseInt(br.readLine());
                                               System.out.println("Enter Name:");
                                               String nm=br.readLine();
                               System.out.println("Enter Balance:");
                                               float b =Float.parseFloat(br.readLine());
                               SavingAccount sa = new SavingAccount(a,nm,b);
                               do
                               {
                                               System.out.println(" \n 1.Deposit \n 2.Withdraw \n 3.Check Balance \n 4.Exit ");
                                               System.out.println("Enter your choice :");
                                                              
                                                               int ch=Integer.parseInt(br.readLine());
                                               switch(ch)
                                               {
                                                               case 1 : sa.deposit();
                                                                                break;
                                                               case 2: sa.withdraw();
                                                                                break;
                                                               case 3 : sa.viewBalance();
                                                                                break;
                                                               case 0 : System.exit(1);
                                                                              
                                               }
                               }while(true);
               }
}

