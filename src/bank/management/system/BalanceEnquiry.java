package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;

public class BalanceEnquiry extends JFrame implements ActionListener{
	
	String sPinNum;
	JButton back;
	
	BalanceEnquiry(String sPinNum){
		
		this.sPinNum=sPinNum;
		setLayout(null);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2=i1.getImage().getScaledInstance(900, 970 , Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(0, 0, 900, 970);
		add(image);
		
		back=new JButton("Back");
		back.setBounds(355, 562, 150, 30);
		back.addActionListener(this);
		image.add(back);
		
		Conn conn=new Conn();
		int balance=0;
		try {
			ResultSet rs=conn.s.executeQuery("Select * from bank where pin_num = '" + sPinNum + "'");
			while(rs.next()) {
				if(rs.getString("type").equals("Deposit")) {
					balance+= Integer.parseInt(rs.getString("amount"));
				}
				else {
					balance-= Integer.parseInt(rs.getString("amount"));
				}
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
		JLabel text=new JLabel("Your Current Account Balance is Rs. " + balance);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("Raleway", Font.BOLD, 16));
		text.setBounds(165, 400, 400, 30);
		image.add(text);
		
		setSize(900, 900);
		setLocation(300, 0);
		setUndecorated(true);
		setVisible(true);
		
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		setVisible(false);
		new Transaction(sPinNum).setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BalanceEnquiry("");
	}

}
