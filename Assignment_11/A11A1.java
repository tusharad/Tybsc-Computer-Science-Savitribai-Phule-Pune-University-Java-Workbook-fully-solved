/**
 * @author : tushar
 * @created : 2021-05-18
**/

/*
Write a program that create 2 threads – each displaying a message (Pass the message
as a parameter to the constructor). The threads should display the messages continuously
till the user presses ctrl-c. Also display the thread information as it is running.

**/
class A11A1
{
     public static void main(String[] args)
     {
               Thread1 t1 = new Thread1("Running Thread1....");
               Thread1 t2 = new Thread1("Running Thread2....");
               t1.start();
               t2.start();
          }
}
