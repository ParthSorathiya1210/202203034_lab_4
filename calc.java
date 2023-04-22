import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class calc extends Applet implements ActionListener {
    TextField t1;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    Button add,sub,eq,mul,div,dot;
	double a,b;
    String msg = "",temp;

    public void init() 
	{
        t1 = new TextField(20);
		b0 = new Button("0");
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
		mul = new Button("*");
        eq = new Button("=");
        add = new Button("+");
        sub = new Button("-");
        div = new Button("/");
        dot = new Button(".");
		setLayout(null);

        add(t1);
        add(b7);
        add(b8);
        add(b9);
        add(div);
        add(b4);
        add(b5);
        add(b6);
        add(mul);
        add(b1);
        add(b2);
        add(b3);
        add(sub);
        add(dot);
        add(b0);
        add(eq);
        add(add);
        t1.setBounds(30, 30, 200, 40);
        b7.setBounds(30, 80, 44, 44);
        b8.setBounds(82, 80, 44, 44);
        b9.setBounds(134, 80, 44, 44);
        b4.setBounds(30, 132, 44, 44);
        b5.setBounds(82, 132, 44, 44);
        b6.setBounds(134, 132, 44, 44);
        b1.setBounds(30, 184, 44, 44);
        b2.setBounds(82, 184, 44, 44);
        b3.setBounds(134, 184, 44, 44);
        dot.setBounds(30, 236, 44, 44);
        b0.setBounds(82, 236, 44, 44);
        eq.setBounds(134, 236, 44, 44);
        add.setBounds(186, 236, 44, 44);
        sub.setBounds(186, 184, 44, 44);
        mul.setBounds(186, 132, 44, 44);
        div.setBounds(186, 80, 44, 44);

        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        div.addActionListener(this);
        mul.addActionListener(this);
        add.addActionListener(this);
        sub.addActionListener(this);
        eq.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")) {
            String str1 = t1.getText();
            temp = str;
            a = Double.parseDouble(str1);
            msg = "";
        } else if (str.equals("=")) {
            String str2 = t1.getText();
            b = Double.parseDouble(str2);
            double sum = 0;
            if (temp == "*")
                sum = a * b;
            else if (temp == "-")
                sum = a - b;
            else if (temp == "+")
                sum = a + b;
            else if (temp == "/")
                sum = a / b;
            String str1 = String.valueOf(sum);
            t1.setText("" + str1);
            msg = "";
        } else {
            msg += str;
            t1.setText("" + msg);
        }
    }
}
/*
<html>
<body>
<applet code = calc.class width=300 height=300>
</applet>
</body>
</html>
*/