package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class AccountOverview extends JFrame implements ActionListener{

	String sPinNum,formNo;
	
	AccountOverview(String sPinNum){
		
		setTitle("Account Overview");
		
		this.sPinNum=sPinNum;
		
		setLayout(null);
		
		JLabel bank=new JLabel("AAPKA AAPNA BANK");
		bank.setBounds(98, 20, 300, 20);
		bank.setFont(new Font("Raleway", Font.BOLD, 20));
		bank.setForeground(Color.blue);
		add(bank);
		
		JLabel acType=new JLabel("Account Type:");
		acType.setBounds(25, 55, 300, 20);
		acType.setFont(new Font("Raleway", Font.BOLD, 20));
		add(acType);
		
		JLabel acTypeName=new JLabel();
		acTypeName.setBounds(165, 56, 300, 20);
		acTypeName.setFont(new Font("Raleway", Font.BOLD, 18));
		acTypeName.setForeground(Color.GRAY);
		add(acTypeName);
		
		JLabel cardNo=new JLabel();
		cardNo.setBounds(25, 100, 300, 20);
		cardNo.setFont(new Font("Raleway", Font.BOLD, 16));
		add(cardNo);
		
		JLabel balance=new JLabel();
		balance.setBounds(25, 120, 300, 60);
		balance.setFont(new Font("Raleway", Font.BOLD, 18));
		add(balance);
		
		JLabel text=new JLabel();
		text.setBounds(265, 120, 300, 60);
		text.setFont(new Font("Raleway", Font.BOLD, 22));
		text.setForeground(Color.GREEN);
		add(text);
		
		JLabel uDetails=new JLabel();
		uDetails.setBounds(25, 80, 600, 300);
		uDetails.setFont(new Font("Raleway", Font.ROMAN_BASELINE, 16));
		add(uDetails);
		
		JLabel aPNum=new JLabel();
		aPNum.setBounds(25, 155, 600, 300);
		aPNum.setFont(new Font("Raleway", Font.ROMAN_BASELINE, 16));
		add(aPNum);		
		
		JLabel adDetails=new JLabel();
		adDetails.setBounds(25, 210, 600, 300);
		adDetails.setFont(new Font("Raleway", Font.ROMAN_BASELINE, 16));
		add(adDetails);
		
		try {
			Conn conn=new Conn();
			ResultSet rs=conn.s.executeQuery("select * from login where pin_num = '" + sPinNum + "'");
			while(rs.next()) {
				cardNo.setText("Card Number: " + rs.getString("card_num").substring(0, 4) + "XXXXXXXX" + rs.getString("card_num").substring(12));
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			Conn conn=new Conn();
			int bal=0;
			String sBal="";
			ResultSet rs= conn.s.executeQuery("select * from bank where  pin_num = '" + sPinNum + "'");
			while(rs.next()) {
				
				if(rs.getString("type").equals("Deposit")) {
					bal+= Integer.parseInt(rs.getString("amount"));
				}
				else {
					bal-= Integer.parseInt(rs.getString("amount"));
				}
				
			}
			sBal="" + bal;
			
			text.setText(sBal);
			
			balance.setText("Available BALANCE (INR): ");
				
		}catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			Conn conn=new Conn();
			
			ResultSet rs= conn.s.executeQuery("select * from signup3 where  pin_num = '" + sPinNum + "'");
			
			formNo="";
			
			while(rs.next()) {
				
				
				acTypeName.setText(acTypeName.getText() + rs.getString("account_type"));
				formNo=rs.getString("formNo");
				
			}
						
		}catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			Conn conn=new Conn();
			
			ResultSet rs= conn.s.executeQuery("select * from signup where  formNo = '" + formNo + "'");
			
			while(rs.next()) {
				
				
				uDetails.setText(uDetails.getText() + "<html>" + "<b>NAME: </b>" +rs.getString("name") + "<br></br>" + "<b>DOB: </b>" + rs.getString("DOB") + "<br></br>" + "<b>GENDER: </b>" + rs.getString("gender") + "<br></br>" + "<b>EMAIL ADDRESS: </b>" + rs.getString("email") + "<br></br><html>");
				
			}
			
				
		}catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			Conn conn=new Conn();
			
			ResultSet rs= conn.s.executeQuery("select * from signupTwo where  formNo = '" + formNo + "'");
			
			while(rs.next()) {
				//mini.setText(mini.getText() + "<html>" + rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") + "<br></br><html>");
				
				aPNum.setText(aPNum.getText() + "<html>" + "<b>PAN NUMBER: </b>" +rs.getString("pan_number").substring(0, 3) + "XXXX" + rs.getString("pan_number").substring(7)  + "<br></br>" + "<b>AADHAAR: </b>" + rs.getString("aadhaar_number").substring(0, 4) + "XXXX" + rs.getString("aadhaar_number").substring(8) + "<br></br>" + "<br></br><html>");
				
			}
			
				
		}catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			Conn conn=new Conn();
			
			ResultSet rs= conn.s.executeQuery("select * from signup where  formNo = '" + formNo + "'");
			
			while(rs.next()) {
				
				
				adDetails.setText(adDetails.getText() + "<html>" + "<b>ADDRESS: </b>" +rs.getString("address") + "<br></br>" + "<b>CITY: </b>" + rs.getString("city") + "<br></br>" + "<b>STATE: </b>" + rs.getString("state") + "<br></br>" + "<b>PIN CODE: </b>" + rs.getString("pincode") + "<br></br><html>");
				
			}
			
				
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
		
		new AccountOverview("");
	}

}
