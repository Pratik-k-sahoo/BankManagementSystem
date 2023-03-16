package bank.management.system;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
	
	JButton signin, clear, signup;
	JTextField cardTextField;
	JPasswordField pinTextField;

	Login(){
		
		setTitle("Automated Teller Machine");
		
		setLayout(null);
		
		 ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
		 Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		 i1=new ImageIcon(i2);
		 JLabel label=new JLabel(i1);
		 label.setBounds(70, 10, 100, 100);
		 add(label);
		
		JLabel HEADING=new JLabel("Welcome To AAPKA APNA BANK");
		HEADING.setFont(new Font("Osward", Font.BOLD, 30));
		HEADING.setBounds(200, 45, 1000, 40);
		add(HEADING);
		
		JLabel cardNo=new JLabel("Card Number");
		cardNo.setFont(new Font("Raleway", Font.BOLD, 20));
		cardNo.setBounds(100, 150, 1000, 40);
		add(cardNo);
		
		cardTextField=new JTextField();
		cardTextField.setBounds(300, 164, 250, 25);
		cardTextField.setFont(new Font("Ariel", Font.BOLD, 14));
		add(cardTextField);
		
		JLabel pin=new JLabel("PIN");
		pin.setFont(new Font("Raleway", Font.BOLD, 20));
		pin.setBounds(100, 200, 1000, 40);
		add(pin);
		
		pinTextField=new JPasswordField();
		pinTextField.setBounds(300, 212, 250, 25);
		pinTextField.setFont(new Font("Ariel", Font.BOLD, 14));
		add(pinTextField);
		
		signin=new JButton("SIGN IN");
		signin.setBounds(300, 280, 100, 30);
		signin.setBackground(Color.GRAY);
		signin.setForeground(Color.BLACK);
		signin.addActionListener(this);
		add(signin);
		
		clear=new JButton("CLEAR");
		clear.setBounds(450, 280, 100, 30);
		clear.setBackground(Color.GRAY);
		clear.setForeground(Color.BLACK);
		clear.addActionListener(this);
		add(clear);
		
		signup=new JButton("SIGN UP");
		signup.setBounds(300, 330, 250, 30);
		signup.setBackground(Color.GRAY);
		signup.setForeground(Color.BLACK);
		signup.addActionListener(this);
		add(signup);
		
		
		
		
		getContentPane().setBackground(Color.WHITE);
		
		setSize(800, 480);//size of frame
		setVisible(true);//box get visible but from origin(top left corner)
		setLocation(350, 200);
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource() == clear) {
			cardTextField.setText("");
			pinTextField.setText("");
		}
		else if(ae.getSource() == signin) {
			Conn conn=new Conn();
			String sCardNum=cardTextField.getText();
			String sPinNum=pinTextField.getText();
			String query="select * from login where card_num = '" + sCardNum + "' and pin_num = '" + sPinNum + "'";
			try {
				ResultSet rs=conn.s.executeQuery(query);
				if(rs.next()) {
					setVisible(false);
					new Transaction(sPinNum).setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pin.");
				}
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		else if(ae.getSource() == signup) {
			setVisible(false);
			 new Signup1().setVisible(true); 
		}
	}
	
	public static void main(String[] args) {
		
		new Login();
	}

}
