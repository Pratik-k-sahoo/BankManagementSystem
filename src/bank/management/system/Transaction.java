package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Transaction extends JFrame implements ActionListener {
	
	JButton deposit, withdrawl, fastCash, mStatement, pinChange, balanceEnquiry, accountOverview, exit;
	String sPinNum;
	
	Transaction(String sPinNum){
		
		this.sPinNum=sPinNum;
		setLayout(null);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2=i1.getImage().getScaledInstance(900, 970 , Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(0, 0, 900, 970);
		add(image);
		
		JLabel text=new JLabel("Please select your Transaction.");
		text.setBounds(220, 330, 700, 35);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("System", Font.BOLD, 16));
		image.add(text);
		
		deposit=new JButton("Deposit");
		deposit.setBounds(170, 450, 150, 30);
		deposit.addActionListener(this);
		image.add(deposit);
		
		withdrawl=new JButton("Cash Withdrawl");
		withdrawl.setBounds(355, 450, 150, 30); 
		withdrawl.addActionListener(this);
		image.add(withdrawl);
		
		fastCash=new JButton("Fast Cash");
		fastCash.setBounds(170, 488, 150, 30);
		fastCash.addActionListener(this);
		image.add(fastCash);
		
		mStatement=new JButton("MINI STATEMENT");
		mStatement.setBounds(355, 488, 150, 30);
		mStatement.addActionListener(this);
		image.add(mStatement);
		
		pinChange=new JButton("PIN Change");
		pinChange.setBounds(170, 525, 150, 30);
		pinChange.addActionListener(this);
		image.add(pinChange);
		
		balanceEnquiry=new JButton("Balance Enquiry");
		balanceEnquiry.setBounds(355, 525, 150, 30);
		balanceEnquiry.addActionListener(this);
		image.add(balanceEnquiry);
		
		accountOverview=new JButton("Account Overview");
		accountOverview.setBounds(170, 562, 150, 30);
		accountOverview.addActionListener(this);
		image.add(accountOverview);
		
		exit=new JButton("Exit");
		exit.setBounds(355, 562, 150, 30);
		exit.addActionListener(this);
		image.add(exit);
		
		
		setSize(900, 900);
		setLocation(300, 0);
		setUndecorated(true);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==exit) {
			System.exit(0);
		}
		else if(ae.getSource()==deposit) {
			setVisible(false);
			new Deposit(sPinNum).setVisible(true);
		}
		else if(ae.getSource()==withdrawl) {
			setVisible(false);
			new Withdrawl(sPinNum).setVisible(true);
		}
		else if(ae.getSource()==fastCash) {
			setVisible(false);
			new FastCash(sPinNum).setVisible(true);
		}
		else if(ae.getSource()==pinChange) {
			setVisible(false);
			new PinChange(sPinNum).setVisible(true);
		}
		else if(ae.getSource()==balanceEnquiry) {
			setVisible(false);
			new BalanceEnquiry(sPinNum).setVisible(true);
		}
		else if(ae.getSource()==mStatement) {
			setVisible(true);
			new MiniStatement(sPinNum).setVisible(true);
		}
		else if(ae.getSource()==accountOverview) {
			setVisible(true);
			new AccountOverview(sPinNum).setVisible(true);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Transaction("");
	}

}
