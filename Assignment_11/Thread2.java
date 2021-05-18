/**
 * @author : tushar
 * @created : 2021-05-18
**/
ass Thread2 extends Thread
{
     String msg = "";
     Thread2(String msg)
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
                                                  Thread.sleep(400);
                                             }
                         }
               catch (Exception ex)
               {
                              ex.printStackTrace();
                         }
          }
}
