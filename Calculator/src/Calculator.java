import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	JFrame jf;
	JLabel DisplayLabel;
	JButton seven;
	JButton eight;
	JButton nine;
	JButton four;
	JButton five;
	JButton six;
	JButton one;
	JButton two;
	JButton three;
	JButton dot;
	JButton zero;
	JButton equal;
	JButton plus;
	JButton minus;
	JButton multi;
	JButton div;
	JButton clr;
	JButton allclr;
	double sum=0.0;
	double nocall;
	String op;
	public static double operation(double sum,double no,String str) {
		if(str.equals("+")) {
			sum=sum+no;
		}else if(str.equals("-")) {
			sum=sum-no;
		}else if(str.equals("X")) {
			sum=sum*no;
		}else if(str.equals("/")) {
			sum=sum/no;
		}
		return sum;
	}
	public Calculator() {
		jf= new JFrame("Calcualtor");
		jf.setLayout(null);
		jf.setSize(600,600);
		jf.setLocation(200, 200);
		jf.getContentPane().setBackground(Color.CYAN);
		
		DisplayLabel = new JLabel(">");
		DisplayLabel.setBounds(30, 50, 540, 40);
		jf.add(DisplayLabel);
		DisplayLabel.setBackground(Color.black);
		DisplayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		DisplayLabel.setFont(new Font("Arial",Font.PLAIN,30));
		DisplayLabel.setForeground(Color.WHITE);
		DisplayLabel.setOpaque(true);
		
		//numbers
		
		seven = new JButton("7");
		seven.setBounds(30, 130, 80, 80);
		seven.addActionListener(this);
		seven.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(seven);
		
		eight = new JButton("8");
		eight.setBounds(140, 130, 80, 80);
		eight.addActionListener(this);
		eight.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(eight);
		
		nine = new JButton("9");
		nine.setBounds(250, 130, 80, 80);
		nine.addActionListener(this);
		nine.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(nine);
		
		four = new JButton("4");
		four.setBounds(30, 240, 80, 80);
		four.addActionListener(this);
		four.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(four);
		
		five = new JButton("5");
		five.setBounds(140, 240, 80, 80);
		five.addActionListener(this);
		five.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(five);
		
		six = new JButton("6");
		six.setBounds(250, 240, 80, 80);
		six.addActionListener(this);
		six.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(six);
		
		one = new JButton("1");
		one.setBounds(30, 350, 80, 80);
		one.addActionListener(this);
		one.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(one);
		
		two = new JButton("2");
		two.setBounds(140, 350, 80, 80);
		two.addActionListener(this);
		two.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(two);
		
		three = new JButton("3");
		three.setBounds(250, 350, 80, 80);
		three.addActionListener(this);
		three.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(three);
		
		dot = new JButton(".");
		dot.setBounds(30, 460, 80, 80);
		dot.addActionListener(this);
		dot.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(dot);
		
		zero = new JButton("0");
		zero.setBounds(140, 460, 80, 80);
		zero.addActionListener(this);
		zero.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(zero);
		
		equal = new JButton("=");
		equal.setBounds(250, 460, 80, 80);
		equal.addActionListener(this);
		equal.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(equal);
		
		//Operations
		
		plus = new JButton("+");
		plus.setBounds(360, 130, 80, 80);
		plus.setBackground(Color.BLACK);
		plus.setForeground(Color.WHITE);
		plus.addActionListener(this);
		plus.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(plus);
		
		minus = new JButton("-");
		minus.setBounds(470, 130, 80, 80);
	    minus.setBackground(Color.BLACK);
		minus.setForeground(Color.WHITE);
		minus.addActionListener(this);
		minus.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(minus);
		
		multi = new JButton("x");
		multi.setBounds(360, 240, 80, 80);
		multi.setBackground(Color.BLACK);
		multi.setForeground(Color.WHITE);
		multi.addActionListener(this);
		multi.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(multi);
		
		div = new JButton("/");
		div.setBounds(470, 240, 80, 80);
		div.setBackground(Color.BLACK);
		div.setForeground(Color.WHITE);
		div.addActionListener(this);
		div.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(div);
		
		clr = new JButton("C");
		clr.setBounds(360, 350, 80, 80);
		clr.setBackground(Color.BLUE);
		clr.setForeground(Color.WHITE);
		clr.addActionListener(this);
		clr.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(clr);
		
		allclr = new JButton("A");
		allclr.setBounds(470, 350, 80, 80);
		allclr.setBackground(Color.RED);
		allclr.setForeground(Color.WHITE);
		allclr.addActionListener(this);
		allclr.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(allclr);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	public static void main(String[] args) {
		new Calculator();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==seven) {
			DisplayLabel.setText(DisplayLabel.getText()+"7");
		}else if(e.getSource()==eight) {
			DisplayLabel.setText(DisplayLabel.getText()+"8");
		}else if(e.getSource()==nine) {
			DisplayLabel.setText(DisplayLabel.getText()+"9");
		}else if(e.getSource()==four) {
			DisplayLabel.setText(DisplayLabel.getText()+"4");
		}else if(e.getSource()==five) {
			DisplayLabel.setText(DisplayLabel.getText()+"5");
		}else if(e.getSource()==six) {
			DisplayLabel.setText(DisplayLabel.getText()+"6");
		}else if(e.getSource()==one) {
			DisplayLabel.setText(DisplayLabel.getText()+"1");
		}else if(e.getSource()==two) {
			DisplayLabel.setText(DisplayLabel.getText()+"2");
		}else if(e.getSource()==three) {
			DisplayLabel.setText(DisplayLabel.getText()+"3");
		}else if(e.getSource()==dot) {
			DisplayLabel.setText(DisplayLabel.getText()+".");
		}else if(e.getSource()==zero) {
			DisplayLabel.setText(DisplayLabel.getText()+"0");
		}else if(e.getSource()==equal) {
			String str = DisplayLabel.getText();
			if(sum==0.0) {
				sum=Double.parseDouble(str.substring(1, str.length()));
				DisplayLabel.setText(">"+Double.toString(sum));
				sum=0.0;
			}else {
			nocall = Double.parseDouble(str.substring(1, str.length()));
		    op = DisplayLabel.getText().substring(0, 1);
		    sum=operation(sum,nocall,op);
			DisplayLabel.setText(">"+Double.toString(sum));
			sum=0.0;
			}
//			

		}else if(e.getSource()==plus) {
			String str = DisplayLabel.getText();
			if(sum==0.0) {
				sum=Double.parseDouble(str.substring(1, str.length()));
				DisplayLabel.setText("+");
			}else {
			nocall = Double.parseDouble(str.substring(1, str.length()));
		    op = DisplayLabel.getText().substring(0, 1);
		    sum=operation(sum,nocall,op);
			DisplayLabel.setText("+");
			}
		}else if(e.getSource()==minus) {
			String str = DisplayLabel.getText();
			if(sum==0.0) {
				sum=Double.parseDouble(str.substring(1, str.length()));
				DisplayLabel.setText("-");
			}else {
			nocall = Double.parseDouble(str.substring(1, str.length()));
		    op = DisplayLabel.getText().substring(0, 1);
		    sum=operation(sum,nocall,op);
			DisplayLabel.setText("-");
			}
		}else if(e.getSource()==div) {
			String str = DisplayLabel.getText();
			if(sum==0.0) {
				sum=Double.parseDouble(str.substring(1, str.length()));
				DisplayLabel.setText("/");
			}else {
			nocall = Double.parseDouble(str.substring(1, str.length()));
		    op = DisplayLabel.getText().substring(0, 1);
		    sum=operation(sum,nocall,op);
			DisplayLabel.setText("/");
			}
		}else if(e.getSource()==multi) {
			String str = DisplayLabel.getText();
			if(sum==0.0) {
				sum=Double.parseDouble(str.substring(1, str.length()));
				DisplayLabel.setText("X");
			}else {
			nocall = Double.parseDouble(str.substring(1, str.length()));
		    op = DisplayLabel.getText().substring(0, 1);
		    sum=operation(sum,nocall,op);
			DisplayLabel.setText("X");
			}
		}else if(e.getSource()==clr) {
			String clrsample = DisplayLabel.getText();
			clrsample=clrsample.substring(0,clrsample.length()-1);
			DisplayLabel.setText(clrsample);
		}else if(e.getSource()==allclr) {
			sum=0.0;
			DisplayLabel.setText(">");
		}
		
	}
}