/**
 * @author : tushar
 * @created : 2021-05-18
**/
class Thread1 extends Thread
{
     String msg = "";
     Thread1(String msg)
     {
               this.msg = msg;
          }
     public void run()
     {
               try
               {
                              while (true)
                              {
                                                  System.out.println(msg);
                                                  Thread.sleep(300);
                                             }
                         }
               catch (Exception ex)
               {
                              ex.printStackTrace();
                         }
          }
}
