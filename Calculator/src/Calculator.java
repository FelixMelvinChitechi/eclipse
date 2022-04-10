import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Calculator {

	private JFrame frame;
	private JTextField txtDisplay;
	private JButton btn9;
	private JButton btnPLus;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btnSubtr;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btnSlash;
	private JButton btn0;
	private JButton btnDot;
	private JButton btnPM;
	private JButton btnEqual;
	private JButton btnBackSpace;
	private JButton btnC;
	private JButton btnPercent;
	private JButton btnPlus;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 284, 407);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setBounds(10, 11, 242, 33);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(19, 107, 50, 50);
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn8.setBounds(79, 107, 50, 50);
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn8);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn9.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(139, 107, 50, 50);
		frame.getContentPane().add(btn9);
		
		btnPLus = new JButton("-");
		btnPLus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = " - ";
			}
		});
		btnPLus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPLus.setBounds(202, 107, 50, 50);
		frame.getContentPane().add(btnPLus);
		

		//--------------------------------Row Two------------------
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn4.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(19, 168, 50, 50);
		frame.getContentPane().add(btn4);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn5.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(79, 168, 50, 50);
		frame.getContentPane().add(btn5);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn6.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(139, 168, 50, 50);
		frame.getContentPane().add(btn6);
		
		btnSubtr = new JButton("*");
		btnSubtr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = " * ";
			}
		});
		btnSubtr.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSubtr.setBounds(202, 168, 50, 50);
		frame.getContentPane().add(btnSubtr);
		

		//--------------------------------Row Three------------------
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn1.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(19, 229, 50, 50);
		frame.getContentPane().add(btn1);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn2.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(79, 229, 50, 50);
		frame.getContentPane().add(btn2);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn3.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(139, 229, 50, 50);
		frame.getContentPane().add(btn3);
		
		btnSlash = new JButton("/");
		btnSlash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = " / ";
			}
		});
		btnSlash.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSlash.setBounds(202, 229, 50, 50);
		frame.getContentPane().add(btnSlash);
		
		//----------------Row 4-----------------
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn0.getText();
				txtDisplay.setText(EnterNumber );
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(19, 290, 50, 50);
		frame.getContentPane().add(btn0);
		
		btnDot = new JButton(".");
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDot.setBounds(79, 290, 50, 50);
		frame.getContentPane().add(btnDot);
		
		btnPM = new JButton("+/-");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
            double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
            ops = ops * (-1);
            txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnPM.setBounds(139, 293, 50, 50);
		frame.getContentPane().add(btnPM);
		
		btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondnum = Double.parseDouble(txtDisplay.getText());
				if (operations == "+") {
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if (operations == "-") {
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if (operations == "*") {
					result = firstnum * secondnum;
					answer = String.format("%.2f", result );
					txtDisplay.setText(answer);
				}
				else if (operations == "/") {
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if (operations == "%") {
					result = firstnum % secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEqual.setBounds(202, 293, 50, 50);
		frame.getContentPane().add(btnEqual);
		
		btnBackSpace = new JButton("<-");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace = null;
				
				if(txtDisplay.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length() - 1);
					backspace = strB.toString();
					txtDisplay.setText(backspace);
				}
			}
		});
		btnBackSpace.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBackSpace.setBounds(20, 46, 50, 50);
		frame.getContentPane().add(btnBackSpace);
		
		btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtDisplay.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnC.setBounds(79, 46, 50, 50);
		frame.getContentPane().add(btnC);
		
		btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = " % ";
				
			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPercent.setBounds(139, 46, 50, 50);
		frame.getContentPane().add(btnPercent);
		
		btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = " + ";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPlus.setBounds(199, 46, 50, 50);
		frame.getContentPane().add(btnPlus);
		
		
		
		
		
	}
}
