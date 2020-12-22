/*Create an Applet which displays a message in the center of the screen. The message indicates
        the events taking place on the applet window. Handle events like mouse click, mouse moved,
        mouse dragged, mouse pressed, and key pressed. The message should update each time an event
        occurs. The message should give details of the event such as which mouse button was pressed,
        which key is pressed etc. (Hint: Use repaint(), KeyListener, MouseListener, MouseEvent method
        getButton, KeyEvent methods getKeyChar)
 */

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet code="ass8b1.class" width=400 height=200>

</applet>
*/

public class Ex6A3 extends Applet implements MouseMotionListener,MouseListener,KeyListener
{

    String msg="";

    public void init()
    {

        setBackground(Color.cyan);
        addMouseMotionListener(this);
        addMouseListener(this);
        addKeyListener(this);

    }

    public void paint(Graphics g)
    {

        g.drawString(msg,10,10);

    }

    public void mouseDragged(MouseEvent e)
    {

        msg="Mouse Dragged.";
        repaint();

    }

    public void mouseMoved(MouseEvent e)
    {

        msg="Mouse Moved.";
        repaint();

    }

    public void mouseClicked(MouseEvent e)
    {

        msg="Mouse Button "+e.getButton()+"clicked.";
        repaint();

    }

    public void mousePressed(MouseEvent e)
    {

        msg="Mouse Button "+e.getButton()+"pressed.";
        repaint();

    }

    public void mouseReleased(MouseEvent e)
    {

        msg="Mouse Button Released.";
        repaint();

    }

    public void mouseEntered(MouseEvent e)
    {

    }

    public void mouseExited(MouseEvent e)
    {

    }

    public void keyTyped(KeyEvent e)
    {

        msg="Key Typed "+ e.getKeyChar();
        repaint();

    }

    public void keyPressed(KeyEvent e)
    {

        msg="Key pressed "+ e.getKeyChar();
        repaint();

    }

    public void keyReleased(KeyEvent e)
    {

    }

}