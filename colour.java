import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class colour extends Applet implements ItemListener
{
	Choice color;
	String selection;
	public void init()
	{
		color = new Choice();
		color.addItem("colour");
		color.addItem("black");
		color.addItem("blue");
		color.addItem("white");
		color.addItem("yellow");
		color.addItem("green");
		color.addItem("pink");
		add(color);
		color.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent e)
	{
		selection = color.getSelectedItem();
			if(selection.equals("blue"))
			{
				this.setBackground(Color.blue);
			}
			else if(selection.equals("black"))
			{
				this.setBackground(Color.black);
			}
			else if(selection.equals("yellow"))
			{
				this.setBackground(Color.yellow);
			}
			else if(selection.equals("green"))
			{
				this.setBackground(Color.green);
			}
			else if(selection.equals("pink"))
			{
				this.setBackground(Color.pink);
			}
			else if(selection.equals("white"))
			{
				this.setBackground(Color.white);
			}
	}
}
/*<html><body><applet code =colour.class height = 500 width = 500>
</applet></body></html>*/