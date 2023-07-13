import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="MouseEvents" width=300 height=300>
</applet>*/
public class Mouse_Listener extends Applet implements MouseListener, MouseMotionListener 
{
	String msg = "";
	int mouseX = 0, mouseY = 0; // coordinates of mouse
	public void init() 
	{
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	public void mouseClicked(MouseEvent me) 
	{
		mouseX = 0;
        mouseY = 10;
		msg = "Mouse clicked.";
		repaint();
	}
	public void mouseEntered(MouseEvent me) 
	{
		mouseX = 0;
		mouseY = 10;
		msg = "Mouse entered.";
		repaint();
	}
	public void mouseExited(MouseEvent me)
	{
		mouseX = 0;
		mouseY = 10;
		msg = "Mouse exited.";
		repaint();
	}
	public void mousePressed(MouseEvent me) 
	{
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "Down";
		repaint();
	}
	public void mouseReleased(MouseEvent me) 
	{
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "Up";
		repaint();
	}
	public void mouseDragged(MouseEvent me) 
    {
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "*";
		showStatus("Dragging mouse at " + mouseX + ", " + mouseY);
		repaint();
	}
	public void mouseMoved(MouseEvent me) 
	{
		showStatus("Moving mouse at " + me.getX() + ", " + me.getY());
	}
	public void paint(Graphics g) 
	{
		g.drawString(msg, mouseX, mouseY);
	}


}

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new java.awt.BorderLayout());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
