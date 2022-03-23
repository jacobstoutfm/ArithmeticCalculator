import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
/**
 * Arithmetic Calculator
 * @author Jacob Stout
 * @version 3/22/2022
 */
public class ArithmeticCalculator implements ActionListener
{
	JFrame f;
	JTextField text;
	JLabel label;
	
	JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,
	btnAdd,btnSub,btnMul,btnDiv,btnDot,btnEquals,btnDel,btnClr;
 
	static double numOne,numTwo,result;
	static int op;
 
ArithmeticCalculator()
{	
	f=new JFrame("Arithmetic Calculator");
	text=new JTextField();
	
	btn0=new JButton("0");
	btn0.setBackground(Color.BLACK);
	btn0.setForeground(Color.RED);
	
	btn1=new JButton("1");
	btn1.setBackground(Color.BLACK);
	btn1.setForeground(Color.RED);
	
	btn2=new JButton("2");
	btn2.setBackground(Color.BLACK);
	btn2.setForeground(Color.RED);
	
	btn3=new JButton("3");
	btn3.setBackground(Color.BLACK);
	btn3.setForeground(Color.RED);
	
	btn4=new JButton("4");
	btn4.setBackground(Color.BLACK);
	btn4.setForeground(Color.RED);
	
	btn5=new JButton("5");
	btn5.setBackground(Color.BLACK);
	btn5.setForeground(Color.RED);
	
	btn6=new JButton("6");
	btn6.setBackground(Color.BLACK);
	btn6.setForeground(Color.RED);
	
	btn7=new JButton("7");
	btn7.setBackground(Color.BLACK);
	btn7.setForeground(Color.RED);
	
	btn8=new JButton("8");
	btn8.setBackground(Color.BLACK);
	btn8.setForeground(Color.RED);
	
	btn9=new JButton("9");
	btn9.setBackground(Color.BLACK);
	btn9.setForeground(Color.RED);

	btnAdd=new JButton("+");
	btnAdd.setBackground(Color.BLACK);
	btnAdd.setForeground(Color.RED);
	
	btnSub=new JButton("-");
	btnSub.setBackground(Color.BLACK);
	btnSub.setForeground(Color.RED);
	
	btnMul=new JButton("*");
	btnMul.setBackground(Color.BLACK);
	btnMul.setForeground(Color.RED);
	
	btnDiv=new JButton("/");
	btnDiv.setBackground(Color.BLACK);
	btnDiv.setForeground(Color.RED);

	btnEquals=new JButton("=");
	btnEquals.setBackground(Color.BLACK);
	btnEquals.setForeground(Color.RED);
	
	btnDel=new JButton("<---");
	btnDel.setBackground(Color.BLACK);
	btnDel.setForeground(Color.RED);
	
	btnClr=new JButton("CLEAR");
	btnClr.setBackground(Color.BLACK);
	btnClr.setForeground(Color.RED);
	
	btnDot=new JButton(".");
	btnDot.setBackground(Color.BLACK);
	btnDot.setForeground(Color.RED);
	
	//setBounds -[x,y,width,height]
	text.setBounds(35,50,275,30); //Text Box
	/** Order of layout [7/8/9 | 4/5/6 | 1/2/3] **/
	btn7.setBounds(45,100,45,45);
	btn8.setBounds(110,100,45,45);
	btn9.setBounds(180,100,45,45);
	
	btn4.setBounds(45,170,45,45);
	btn5.setBounds(110,170,45,45);
	btn6.setBounds(180,170,45,45);
	

	btn1.setBounds(45,240,45,45);
	btn2.setBounds(110,240,45,45);
	btn3.setBounds(180,240,45,45);
	btn0.setBounds(110,310,45,45);
	
	btnDot.setBounds(45,310,45,45);
	btnAdd.setBounds(250,310,45,45);
	btnSub.setBounds(250,240,45,45);
	btnMul.setBounds(250,170,45,45);
	btnDiv.setBounds(250,100,45,45);
	btnEquals.setBounds(180,310,45,45);
	btnDel.setBounds(60,380,100,45);
	btnClr.setBounds(180,380,100,45);
	
	f.add(text);
	f.add(btn0);
	f.add(btn1);
	f.add(btn2);
	f.add(btn3);
	f.add(btn4);
	f.add(btn5);
	f.add(btn6);
	f.add(btn7);
	f.add(btn8);
	f.add(btn9);
	f.add(btnDot);
	f.add(btnAdd);
	f.add(btnSub);
	f.add(btnMul);
	f.add(btnDiv);
	f.add(btnEquals);
	f.add(btnDel);
	f.add(btnClr);

	btn1.addActionListener(this);
	btn2.addActionListener(this);
	btn3.addActionListener(this);
	btn4.addActionListener(this);
	btn5.addActionListener(this);
	btn6.addActionListener(this);
	btn7.addActionListener(this);
	btn8.addActionListener(this);
	btn9.addActionListener(this);
	btn0.addActionListener(this);
	btnAdd.addActionListener(this);
	btnDiv.addActionListener(this);
	btnMul.addActionListener(this);
	btnSub.addActionListener(this);
	btnDot.addActionListener(this);
	btnEquals.addActionListener(this);
	btnDel.addActionListener(this);
	btnClr.addActionListener(this);
	
	f.setLayout(null);
	f.setSize(400,500);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setResizable(true);
	f.getContentPane().setBackground(Color.DARK_GRAY);
	f.setVisible(true);
}
 
public void actionPerformed(ActionEvent e)
{

	if(e.getSource()==btn1)

		text.setText(text.getText().concat("1"));

	if(e.getSource()==btn2)

		text.setText(text.getText().concat("2"));

	if(e.getSource()==btn3)

		text.setText(text.getText().concat("3"));

	if(e.getSource()==btn4)

		text.setText(text.getText().concat("4"));

	if(e.getSource()==btn5)

		text.setText(text.getText().concat("5"));

	if(e.getSource()==btn6)

		text.setText(text.getText().concat("6"));

	if(e.getSource()==btn7)

		text.setText(text.getText().concat("7"));

	if(e.getSource()==btn8)

		text.setText(text.getText().concat("8"));

	if(e.getSource()==btn9)

		text.setText(text.getText().concat("9"));

	if(e.getSource()==btn0)

		text.setText(text.getText().concat("0"));

	if(e.getSource()==btnDot)

		text.setText(text.getText().concat("."));

	if(e.getSource()==btnAdd)
	{
		numOne=Double.parseDouble(text.getText());
		op=1;
		text.setText("");
	}
	
	if(e.getSource()==btnSub)
	{
		numOne=Double.parseDouble(text.getText());
		op=2;
		text.setText("");
	}
	
	if(e.getSource()==btnMul)
	{
		numOne=Double.parseDouble(text.getText());
		op=3;
		text.setText("");
	}
	
	if(e.getSource()==btnDiv)
	{
		numOne=Double.parseDouble(text.getText());
		op=4;
		text.setText("");
	}
	
	if(e.getSource()==btnEquals)
	{
		numTwo=Double.parseDouble(text.getText());
		switch(op)
		{
			case 1: result = (numOne + numTwo);
			break;
			case 2: result = (numOne - numTwo);
			break;
			case 3: result = (numOne * numTwo);
			break;
			case 4: result = (numOne/numTwo);
			break;
			default: result = 0;
		}
		text.setText(""+result);
	}
	
	if(e.getSource()==btnDel)
	{
		String s=text.getText();
		text.setText("");
		for(int i=0;i<s.length()-1;i++)
		{
			text.setText(text.getText()+s.charAt(i));
		}
	}
	
	if(e.getSource()==btnClr)
	{
		text.setText("");
	}
	
}
 
public static void main(String [] args)
	{
		new ArithmeticCalculator();
	}

}