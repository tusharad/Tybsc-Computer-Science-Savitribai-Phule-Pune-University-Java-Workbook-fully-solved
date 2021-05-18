/*
Define a thread to move a ball inside a panel vertically. The Ball should be created
when user clicks on the Start Button. Each ball should have a different color and vertical
position (calculated randomly). Note: Suppose user has clicked buttons 5 times then five
balls should be created and move inside the panel. Ensure that ball is moving within the
panel border only.

*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class boucingthread extends JFrame implements Runnable
{
 Thread t;
 int x,y;

 boucingthread()
 {
  super();
  t= new Thread(this);
  x=10;
  y=10;
  t.start();
  setSize(1000,200);
  setVisible(true);
  setTitle("BOUNCEING BOLL WINDOW");
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
public void run()
 {
  try
  {
   while(true)
   {
    x+=10;
    y+=10;
    repaint();
    Thread.sleep(1000);
   }
  }catch(Exception e)
  {

  }
 }

 public void paint(Graphics g)
 {

  g.drawOval(x,y,7,7);

 }

 public static void main(String a[])throws Exception
 {
  boucingthread t=new boucingthread();
  Thread.sleep(1000);
 }
}
