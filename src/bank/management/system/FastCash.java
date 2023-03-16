package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {
	
	JButton hundred, fiveHundred, thousand, twoThousand, fiveThousand, tenThousand, twoHundred, back;
	String sPinNum;
	
	FastCash(String sPinNum){
		
		this.sPinNum=sPinNum;
		setLayout(null);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2=i1.getImage().getScaledInstance(900, 970 , Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(0, 0, 900, 970);
		add(image);
		
		JLabel text=new JLabel("SELECT WITHDRAWL AMOUNT");
		text.setBounds(220, 330, 700, 35);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("System", Font.BOLD, 16));
		image.add(text);
		
		hundred=new JButton("Rs. 100");
		hundred.setBounds(170, 450, 150, 30); 
		hundred.addActionListener(this);
		image.add(hundred);
		
		twoHundred=new JButton("Rs. 200");
		twoHundred.setBounds(355, 450, 150, 30);
		twoHundred.addActionListener(this);
		image.add(twoHundred);
		
		fiveHundred=new JButton("Rs. 500");
		fiveHundred.setBounds(170, 488, 150, 30);
		fiveHundred.addActionListener(this);
		image.add(fiveHundred);
		
		thousand=new JButton("Rs. 1000");
		thousand.setBounds(355, 488, 150, 30);
		thousand.addActionListener(this);
		image.add(thousand);
		
		twoThousand=new JButton("Rs. 2000");
		twoThousand.setBounds(170, 525, 150, 30);
		twoThousand.addActionListener(this);
		image.add(twoThousand);
		
		fiveThousand=new JButton("Rs. 5000");
		fiveThousand.setBounds(355, 525, 150, 30);
		fiveThousand.addActionListener(this);
		image.add(fiveThousand);
		
		tenThousand=new JButton("Rs. 10000");
		tenThousand.setBounds(170, 562, 150, 30);
		tenThousand.addActionListener(this);
		image.add(tenThousand);
		
		back=new JButton("BACK");
		back.setBounds(355, 562, 150, 30);
		back.addActionListener(this);
		image.add(back);
		
		
		setSize(900, 900);
		setLocation(300, 0);
		setUndecorated(true);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==back) {
			setVisible(false);
			new Transaction(sPinNum).setVisible(true);
		}
		else {
			String amount = ((JButton)ae.getSource()).getText().substring(4);
			Conn conn=new Conn();
			try {
				ResultSet rs=conn.s.executeQuery("Select * from bank where pin_num = '" + sPinNum + "'");
				int balance=0;
				while(rs.next()) {
					if(rs.getString("type").equals("Deposit")) {
						balance+= Integer.parseInt(rs.getString("amount"));
					}
					else {
						balance-= Integer.parseInt(rs.getString("amount"));
					}
				}
				
				if(balance < Integer.parseInt(amount)) {
					JOptionPane.showMessageDialog(null, "Insufficient Balance.");
					return;
				}
				
				Date date=new Date();
				String query="insert into bank values ('" + sPinNum + "', '" + date + "', 'Withdrawl', '" + amount + "' )";
				conn.s.executeUpdate(query);
				JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Successfully");
				
				setVisible(false);
				new Transaction(sPinNum).setVisible(true);
				
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FastCash("");
	}

}
