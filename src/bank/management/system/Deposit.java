package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Deposit extends JFrame implements ActionListener{
	
	JTextField amount;
	JButton deposit, back;
	String sPinNum;
	
	Deposit(String sPinNum){
		
		this.sPinNum=sPinNum;
		setLayout(null);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2=i1.getImage().getScaledInstance(900, 970 , Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(0, 0, 900, 970);
		add(image);
		
		JLabel text=new JLabel("Enter the amount you want to deposit.");
		text.setBounds(190, 330, 700, 35);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("System", Font.BOLD, 16));
		image.add(text);
		
		amount=new JTextField();
		amount.setFont(new Font("Raleway", Font.BOLD, 20));
		amount.setBounds(175, 380, 320, 25);
		image.add(amount);
		
		deposit=new JButton("Confirm");
		deposit.setBounds(375, 525, 130, 30);
		deposit.addActionListener(this);
		image.add(deposit);
		
		back=new JButton("Back");
		back.setBounds(165, 525, 130, 30);
		back.addActionListener(this);
		image.add(back);
		
		setSize(900, 900);
		setLocation(300, 0);
		setUndecorated(true);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==deposit) {
			String number=amount.getText();
			Date date=new Date();
			if(number.equals("")) {
				JOptionPane.showMessageDialog(null, "Please enter the amount to deposit.");
			}
			else {
				try {
					Conn conn=new Conn();
					String query="insert into bank values('" + sPinNum + "', '" + date + "', 'Deposit', '" + number + "')";
					conn.s.executeUpdate(query);
					JOptionPane.showMessageDialog(null, "Rs " + number + " Deposited Successfully.");
					setVisible(false);
					new Transaction(sPinNum).setVisible(true);
				} catch(Exception e) {
					System.out.println(e);
				}
			}
		}
		else if(ae.getSource()==back) {
			setVisible(false);
			new Transaction(sPinNum).setVisible(true);
		}
	}

	public static void main(String[] args) {
		new Deposit("");

	}

}
