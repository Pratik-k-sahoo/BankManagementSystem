package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class MiniStatement extends JFrame implements ActionListener{

	String sPinNum;
	
	MiniStatement(String sPinNum){
		
		setTitle("Mini Statement");
		
		this.sPinNum=sPinNum;
		
		setLayout(null);
		
		JLabel mini=new JLabel();
		mini.setBounds(20, 140, 400, 400);
		add(mini);
		
		JLabel bank=new JLabel("AAPKA AAPNA BANK");
		bank.setBounds(98, 20, 300, 20);
		bank.setFont(new Font("Raleway", Font.BOLD, 20));
		bank.setForeground(Color.blue);
		add(bank);
		
		JLabel balance=new JLabel();
		balance.setBounds(20, 400, 300, 200);
		add(balance);
		
		try {
			Conn conn=new Conn();
			int bal=0;
			ResultSet rs= conn.s.executeQuery("select * from bank where  pin_num = '" + sPinNum + "'");
			while(rs.next()) {
				mini.setText(mini.getText() + "<html>" + rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") + "<br></br><html>");
				
				if(rs.getString("type").equals("Deposit")) {
					bal+= Integer.parseInt(rs.getString("amount"));
				}
				else {
					bal-= Integer.parseInt(rs.getString("amount"));
				}
				
			}
			
			balance.setText("Your Current account balance is Rs. " + bal);
				
		}catch(Exception e) {
			System.out.println(e);
		}
		
		setSize(400, 600);
		setLocation(20, 20);
		getContentPane().setBackground(Color.WHITE);
//		setUndecorated(true);
		setVisible(true);
		
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		
	}
	
	public static void main(String[] args) {
		
		new MiniStatement("");
	}

}
