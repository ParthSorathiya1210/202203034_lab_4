import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class calcfinal extends Applet implements ActionListener
{
	TextField input;
	public void init()
    {
	setLayout(null);
	int i;
	input = new TextField(30);
	this.add(input);
	setBackground(Color.yellow);
	Button button[] = new Button[10];
	for(i = 0;i < 10; i++)
	{
	    button[i] = new Button(String.valueOf(9-i));
	    this.add(button[i]);
	    button[i].addActionListener(this);
	}
	Button dot=new Button(".");
	this.add(dot);
	dot.addActionListener(this);
	
	Button clear=new Button("C");
	this.add(clear);
	clear.addActionListener(this);
 
	Button operator[] = new Button[5];
	operator[0]=new Button("/");
	operator[1]=new Button("*");
	operator[2]=new Button("-");
	operator[3]=new Button("+");
	operator[4]=new Button("=");
	for(i =0 ;i <= 4; i++)
	{
	    this.add(operator[i]);
	    operator[i].addActionListener(this);
	}
    }
    String num1="";
    String op="";
    String num2="";
	
	public void actionPerformed(ActionEvent e)
    {
	String button = e.getActionCommand();
        char ch = button.charAt(0);
	if(ch == '.' || ch >= '0' && ch <= '9') 
	{ 
	    if (!op.equals("")) 
		num2 = num2 + button; 
	    else
		num1 = num1 + button;   
	    input.setText(num1+op+num2); 
	} 
	else if(ch == 'C') 
	{ 
	    num1 = op = num2 = ""; 
	    input.setText(""); 
	}
	else if (ch == '=') 
	{ 
	    if(!num1.equals("") && !num2.equals(""))
	    {
		double temp;
		double n1=Double.parseDouble(num1);
		double n2=Double.parseDouble(num2);
		if(n2==0 && op.equals("/"))
		{
		    input.setText(num1+op+num2+"1/0 infinity");
		    num1 = op = num2 = "";
		}
		else
		{
		    if (op.equals("+")) 
		        temp = n1 + n2; 
		    else if (op.equals("-")) 
		        temp = n1 - n2; 
		    else if (op.equals("/")) 
	  	        temp = n1/n2; 
		    else
		        temp = n1*n2; 
		    input.setText(num1+op+num2+" = "+temp); 
		    num1 = Double.toString(temp);
		    op = num2 = ""; 
	        }
            }
	    else
	    {
		num1 = op = num2 = ""; 
		input.setText("");
	    }
        } 
	else 
	{ 
	    if (op.equals("") || num2.equals("")) 
		op = button; 
	    else 
	    { 
		double temp;
		double n1=Double.parseDouble(num1);
		double n2=Double.parseDouble(num2);
		if(n2==0 && op.equals("/"))
		{
		    input.setText(num1+op+num2+"1/0 not defined");
		    num1 = op = num2 = "";
		}
		else
		{
		    if (op.equals("+")) 
		        temp = n1 + n2; 
		    else if (op.equals("-")) 
		        temp = n1 - n2; 
		    else if (op.equals("/")) 
	  	        temp = n1/n2; 
		    else
		        temp = n1*n2; 
		    num1 = Double.toString(temp); 
		    op = button; 
		    num2 = ""; 
	        }
            }
	    input.setText(num1+op+num2);
        }
    }
}
/*
<applet code = calcfinal.class width=300 height=300>
</applet>
*/