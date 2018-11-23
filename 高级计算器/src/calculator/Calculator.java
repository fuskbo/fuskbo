package calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener 
{
	JTextField jt;
	JButton jb0,jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9;
	JButton jb10,jb11,jb12,jb13;
	JButton jb14,jb15,jb16;
	JPanel jp1,jp2,jp3,jp;
	double x,y;
	char signal;
	Calculator()
	{
		jt= new JTextField(20); jt.setFont(new Font("Serif",Font.BOLD,25));
		jb0=new JButton("0");jb0.setFont(new Font("Serif",Font.BOLD,25));
		jb1=new JButton("1");jb1.setFont(new Font("Serif",Font.BOLD,25));
		jb2=new JButton("2");jb2.setFont(new Font("Serif",Font.BOLD,25));
		jb3=new JButton("3");jb3.setFont(new Font("Serif",Font.BOLD,25));
		jb4=new JButton("4");jb4.setFont(new Font("Serif",Font.BOLD,25));
		jb5=new JButton("5");jb5.setFont(new Font("Serif",Font.BOLD,25));
		jb6=new JButton("6");jb6.setFont(new Font("Serif",Font.BOLD,25));
		jb7=new JButton("7");jb7.setFont(new Font("Serif",Font.BOLD,25));
		jb8=new JButton("8");jb8.setFont(new Font("Serif",Font.BOLD,25));
		jb9=new JButton("9");jb9.setFont(new Font("Serif",Font.BOLD,25));
		jb10=new JButton("/");jb10.setFont(new Font("Serif",Font.BOLD,25));jb10.setForeground(Color.RED);
		jb11=new JButton("*");jb11.setFont(new Font("Serif",Font.BOLD,25));jb11.setForeground(Color.RED);
		jb12=new JButton("-");jb12.setFont(new Font("Serif",Font.BOLD,25));jb12.setForeground(Color.RED);
		jb13=new JButton("+");jb13.setFont(new Font("Serif",Font.BOLD,25));jb13.setForeground(Color.RED);
		jb14=new JButton(".");jb14.setFont(new Font("Serif",Font.BOLD,25));
		jb15=new JButton("=");jb15.setFont(new Font("Serif",Font.BOLD,25));jb15.setForeground(Color.RED);
		jb16=new JButton("CE");jb16.setFont(new Font("Serif",Font.BOLD,25));jb16.setForeground(Color.RED);
		
		jp1=new JPanel();
		jp2=new JPanel();
		jp3=new JPanel();
		jp=new JPanel();
		
		jp.setLayout(new BorderLayout());
		
		jt.setHorizontalAlignment(JTextField.RIGHT); 	//让文本框的内容向右对齐
		jt.setText("");
		jp1.add(jt);
		jp.add(jp1,BorderLayout.NORTH);
		
		jp2.setLayout(new GridLayout(4,4,5,5));
		jp2.add(jb7);   jp2.add(jb8);   jp2.add(jb9);   jp2.add(jb10);
		jp2.add(jb4);   jp2.add(jb5);   jp2.add(jb6);   jp2.add(jb11);
		jp2.add(jb1);   jp2.add(jb2);   jp2.add(jb3);   jp2.add(jb12);
		jp2.add(jb0);   jp2.add(jb14);   jp2.add(jb15);   jp2.add(jb13);
		jp.add(jp2);
		
		jp3.add(jb16);
		jp.add(jp3,BorderLayout.SOUTH);
		
		add(jp);
		
		jb0.addActionListener(this);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);
		jb6.addActionListener(this);
		jb7.addActionListener(this);
		jb8.addActionListener(this);
		jb9.addActionListener(this);
		jb10.addActionListener(this);
		jb11.addActionListener(this);
		jb12.addActionListener(this);
		jb13.addActionListener(this);
		jb14.addActionListener(this);
		jb15.addActionListener(this);
		jb16.addActionListener(this);
	}	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jb0)  jt.setText(jt.getText()+"0");
		if(e.getSource()==jb1)  jt.setText(jt.getText()+"1");
		if(e.getSource()==jb2)  jt.setText(jt.getText()+"2");
		if(e.getSource()==jb3)  jt.setText(jt.getText()+"3");
		if(e.getSource()==jb4)  jt.setText(jt.getText()+"4");
		if(e.getSource()==jb5)  jt.setText(jt.getText()+"5");
		if(e.getSource()==jb6)  jt.setText(jt.getText()+"6");
		if(e.getSource()==jb7)  jt.setText(jt.getText()+"7");
		if(e.getSource()==jb8)  jt.setText(jt.getText()+"8");
		if(e.getSource()==jb9)  jt.setText(jt.getText()+"9");
		if(e.getSource()==jb14)  jt.setText(jt.getText()+".");
		
		if(e.getSource()==jb13){
			x=Double.parseDouble(jt.getText());
			jt.setText("");
			signal='+';
		}
		if(e.getSource()==jb12){
			x=Double.parseDouble(jt.getText());
			jt.setText("");
			signal='-';
		}
		if(e.getSource()==jb11){
			x=Double.parseDouble(jt.getText());
			jt.setText("");
			signal='*';
		}
		if(e.getSource()==jb10){
			x=Double.parseDouble(jt.getText());
			jt.setText("");
			signal='/';
		}
		if(e.getSource()==jb15){
			y=Double.parseDouble(jt.getText());
			if(signal=='+') jt.setText(Double.toString(x+y));
			if(signal=='-') jt.setText(Double.toString(x-y));
			if(signal=='*') jt.setText(Double.toString(x*y));
			if(signal=='/') jt.setText(Double.toString(x/y));
		}
		if(e.getSource()==jb16)
		{
			jt.setText("");
			x=y=0;
			signal=' ';
		}
		
		
	}

}
