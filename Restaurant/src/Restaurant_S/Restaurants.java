package Restaurant_S;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Restaurants {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurants window = new Restaurants();
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
	public Restaurants() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 919, 506);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(24, 46, 390, 181);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Chicken Burger");
		lblNewLabel_1.setBounds(24, 23, 167, 29);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Chicken Burger Meal");
		lblNewLabel_1_1.setBounds(24, 63, 223, 29);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Cheese Burger");
		lblNewLabel_1_1_1.setBounds(24, 103, 174, 29);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel.add(lblNewLabel_1_1_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField.setBounds(257, 23, 128, 30);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_1.setBounds(257, 63, 128, 30);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(257, 103, 128, 29);
		panel.add(textField_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(24, 238, 390, 158);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Cost Of Drinks");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_2.setBounds(10, 11, 173, 29);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Cost of Meal");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1_1_2.setBounds(10, 49, 223, 29);
		panel_1.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Cost of Delivery");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1_1_1_1.setBounds(9, 89, 174, 29);
		panel_1.add(lblNewLabel_1_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_3.setColumns(10);
		textField_3.setBounds(243, 11, 133, 29);
		panel_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_4.setColumns(10);
		textField_4.setBounds(243, 49, 133, 30);
		panel_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_5.setColumns(10);
		textField_5.setBounds(243, 89, 133, 30);
		panel_1.add(textField_5);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(416, 46, 220, 181);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(416, 238, 220, 158);
		panel_2_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		frame.getContentPane().add(panel_2_1);
		panel_2_1.setLayout(null);
		
		textField_6 = new JTextField();
		textField_6.setBounds(124, 11, 88, 29);
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_6.setColumns(10);
		panel_2_1.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setBounds(124, 62, 88, 29);
		textField_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_7.setColumns(10);
		panel_2_1.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setBounds(124, 111, 88, 29);
		textField_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_8.setColumns(10);
		panel_2_1.add(textField_8);
		
		JLabel lblNewLabel_3 = new JLabel("Tax");
		lblNewLabel_3.setBounds(10, 20, 56, 20);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel_2_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Sub Total");
		lblNewLabel_4.setBounds(10, 68, 122, 20);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel_2_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("TOTAL");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_5.setBounds(10, 111, 122, 20);
		panel_2_1.add(lblNewLabel_5);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBounds(646, 46, 257, 350);
		panel_2_2.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		frame.getContentPane().add(panel_2_2);
		panel_2_2.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 237, 343);
		panel_2_2.add(tabbedPane);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_4, null);
		panel_4.setLayout(null);
		
		textField_10 = new JTextField();
		textField_10.setBounds(10, 11, 212, 293);
		panel_4.add(textField_10);
		textField_10.setColumns(10);
		
		JPanel panel_4_1 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_4_1, null );
		panel_4_1.setLayout(null);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(0, 0, 242, 33);
		panel_4_1.add(textField_9);
		
		JButton btnBackSpace = new JButton("<-");
		btnBackSpace.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBackSpace.setBounds(10, 35, 50, 50);
		panel_4_1.add(btnBackSpace);
		
		JButton btnC = new JButton("C");
		btnC.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnC.setBounds(69, 35, 50, 50);
		panel_4_1.add(btnC);
		
		JButton btnPercent = new JButton("%");
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPercent.setBounds(129, 35, 50, 50);
		panel_4_1.add(btnPercent);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPlus.setBounds(189, 35, 50, 50);
		panel_4_1.add(btnPlus);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(9, 96, 50, 50);
		panel_4_1.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(69, 96, 50, 50);
		panel_4_1.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(129, 96, 50, 50);
		panel_4_1.add(btn9);
		
		JButton btnPLus = new JButton("-");
		btnPLus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPLus.setBounds(192, 96, 50, 50);
		panel_4_1.add(btnPLus);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(9, 157, 50, 50);
		panel_4_1.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(69, 157, 50, 50);
		panel_4_1.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(129, 157, 50, 50);
		panel_4_1.add(btn6);
		
		JButton btnSubtr = new JButton("*");
		btnSubtr.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSubtr.setBounds(192, 157, 50, 50);
		panel_4_1.add(btnSubtr);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(9, 218, 50, 50);
		panel_4_1.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(69, 218, 50, 50);
		panel_4_1.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(129, 218, 50, 50);
		panel_4_1.add(btn3);
		
		JButton btnSlash = new JButton("/");
		btnSlash.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSlash.setBounds(192, 218, 50, 50);
		panel_4_1.add(btnSlash);
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(9, 279, 50, 50);
		panel_4_1.add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDot.setBounds(69, 279, 50, 50);
		panel_4_1.add(btnDot);
		
		JButton btnPM = new JButton("+/-");
		btnPM.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnPM.setBounds(129, 282, 50, 50);
		panel_4_1.add(btnPM);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEqual.setBounds(192, 282, 50, 50);
		panel_4_1.add(btnEqual);
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(24, 407, 841, 49);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		frame.getContentPane().add(panel_3);
		
		JLabel lblNewLabel = new JLabel("Restaurant Management System");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblNewLabel.setBounds(176, 0, 528, 35);
		frame.getContentPane().add(lblNewLabel);
	}
}
