import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class applet extends Applet implements ActionListener
{
	TextField t1 = new TextField(20);
	Button b = new Button("Enter");
	String n1 = "";
	String hello = "";
	Label l1 = new Label("Enter Name : ");
	public void init()
	{
		add(l1);
		add(t1);
		add(b);
		setBackground(Color.pink);
		b.addActionListener(this);
	}
	public void paint(Graphics g)
	{
		g.drawString(hello+n1,100,100);
	}
	public void actionPerformed(ActionEvent ae)
	{
		n1 = t1.getText();
		hello = "Hello : ";
		repaint();
	}
	
}

/*<html><body><applet code =applet.class height = 500 width = 500>
</applet></body></html>*/