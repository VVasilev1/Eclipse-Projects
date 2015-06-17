import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;


public class Calc {

	private JFrame frmCalculator;
	private JTextField textField;
	private double total = 0.0;
	private double total_1 = 0.0; 
	private char operator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void getOperator (String btnText) {
		
		operator = btnText.charAt(0);
		total = total + Double.parseDouble(textField.getText());
		textField.setText("");
		
		
	}
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.getContentPane().setBackground(new Color(153, 255, 204));
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 450, 300);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 248, 220));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(89, 30, 274, 20);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setBackground(new Color(224, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String btnOneText = textField.getText() + btnNewButton.getText();
				textField.setText( btnOneText );
				
			}
		});
		btnNewButton.setBounds(89, 168, 61, 23);
		frmCalculator.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.setBackground(new Color(224, 255, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnTwoText = textField.getText() + btnNewButton_1.getText();
				textField.setText( btnTwoText );
			}
		});
		btnNewButton_1.setBounds(160, 168, 61, 23);
		frmCalculator.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.setBackground(new Color(224, 255, 255));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnThreeText = textField.getText() + btnNewButton_2.getText();
				textField.setText( btnThreeText );
			}
		});
		btnNewButton_2.setBounds(231, 168, 61, 23);
		frmCalculator.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.setBackground(new Color(224, 255, 255));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnFourText = textField.getText() + btnNewButton_3.getText();
				textField.setText( btnFourText );
			}
		});
		btnNewButton_3.setBounds(89, 134, 61, 23);
		frmCalculator.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.setBackground(new Color(224, 255, 255));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnFiveText = textField.getText() + btnNewButton_4.getText();
				textField.setText( btnFiveText );
			}
		});
		btnNewButton_4.setBounds(160, 134, 61, 23);
		frmCalculator.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.setBackground(new Color(224, 255, 255));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnSixText = textField.getText() + btnNewButton_5.getText();
				textField.setText( btnSixText );
			}
		});
		btnNewButton_5.setBounds(231, 134, 61, 23);
		frmCalculator.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("7");
		btnNewButton_6.setBackground(new Color(224, 255, 255));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnSevenText = textField.getText() + btnNewButton_6.getText();
				textField.setText( btnSevenText );
			}
		});
		btnNewButton_6.setBounds(89, 100, 61, 23);
		frmCalculator.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("8");
		btnNewButton_7.setBackground(new Color(224, 255, 255));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnEightText = textField.getText() + btnNewButton_7.getText();
				textField.setText( btnEightText );
			}
		});
		btnNewButton_7.setBounds(160, 100, 61, 23);
		frmCalculator.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("9");
		btnNewButton_8.setBackground(new Color(224, 255, 255));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnNineText = textField.getText() + btnNewButton_8.getText();
				textField.setText( btnNineText );
				
			}
		});
		btnNewButton_8.setBounds(231, 100, 61, 23);
		frmCalculator.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("0");
		btnNewButton_9.setBackground(new Color(224, 255, 255));
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnZeroText = textField.getText() + btnNewButton_9.getText();
				textField.setText( btnZeroText );
			}
		});
		btnNewButton_9.setBounds(89, 202, 61, 23);
		frmCalculator.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton(".");
		btnNewButton_10.setBackground(new Color(224, 255, 255));
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnPointText = textField.getText() + btnNewButton_10.getText();
				textField.setText( btnPointText );
			}
		});
		btnNewButton_10.setBounds(160, 202, 61, 23);
		frmCalculator.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("=");
		btnNewButton_11.setBackground(new Color(224, 255, 255));
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch (operator) {
				case '+':
					total_1 = total + Double.parseDouble(textField.getText( ) );
					break;
				case '-':
					total_1 = total - Double.parseDouble(textField.getText( ) );
					break;
				case '*':
					total_1 = total * Double.parseDouble(textField.getText( ) );
					break;
				case '/':
					total_1 = total / Double.parseDouble(textField.getText( ) );
					break;
				}
				textField.setText( Double.toString(total_1) );
				total = 0;
			}
		});
		btnNewButton_11.setBounds(231, 202, 61, 23);
		frmCalculator.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("+");
		btnNewButton_12.setBackground(new Color(224, 255, 255));
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String button_text = btnNewButton_12.getText();
				getOperator(button_text);
			}
		});
		btnNewButton_12.setBounds(302, 202, 61, 23);
		frmCalculator.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("-");
		btnNewButton_13.setBackground(new Color(224, 255, 255));
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String button_text = btnNewButton_13.getText();
				getOperator(button_text);
			}
		});
		btnNewButton_13.setBounds(302, 168, 61, 23);
		frmCalculator.getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("CE");
		btnNewButton_14.setBackground(new Color(224, 255, 255));
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total_1 = 0;
				total = 0;
				textField.setText("");
			}
		});
		btnNewButton_14.setBounds(89, 66, 61, 23);
		frmCalculator.getContentPane().add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("*");
		btnNewButton_15.setBackground(new Color(224, 255, 255));
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String button_text = btnNewButton_15.getText();
				getOperator(button_text);
			}
		});
		btnNewButton_15.setBounds(302, 134, 61, 23);
		frmCalculator.getContentPane().add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("/");
		btnNewButton_16.setBackground(new Color(224, 255, 255));
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String button_text = btnNewButton_16.getText();
				getOperator(button_text);
			}
		});
		btnNewButton_16.setBounds(302, 100, 61, 23);
		frmCalculator.getContentPane().add(btnNewButton_16);
	}
}
