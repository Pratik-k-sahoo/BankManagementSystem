package bank.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;





public class Signup3 extends JFrame implements ActionListener {
	
	JButton submit, cancel;
	JRadioButton rdAccount, savingAccount, fdAccount, currentAccount;
	JCheckBox atmCard, internetBanking, mobieBanking, eSmsAlert;
	JCheckBox chequeBook, eStatement, declare;
	String form;
	
	
	
	
	Signup3(String form){
		
		this.form=form;
		setLayout(null);
		
		setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3");
		
		
		
		JLabel page=new JLabel("Page 3");
		page.setFont(new Font("Raleway", Font.BOLD, 15));
		page.setBounds(670, 720, 400, 30);
		add(page);
		
		JLabel additionalDetails=new JLabel("Account Details ");
		additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
		additionalDetails.setBounds(300, 80, 400, 30);
		add(additionalDetails);
		
		JLabel accountType=new JLabel("Account Type : ");
		accountType.setFont(new Font("Raleway", Font.BOLD, 28));
		accountType.setBounds(100, 140, 250, 40);
		add(accountType);
		
		savingAccount=new JRadioButton("Saving Account");
		savingAccount.setBackground(Color.WHITE);
		savingAccount.setBounds(100, 180, 200, 40);
		savingAccount.setFont(new Font("Realeway", Font.PLAIN , 20));
		add(savingAccount);
		
		fdAccount=new JRadioButton("Fixed Deposit Account");
		fdAccount.setBackground(Color.WHITE);
		fdAccount.setBounds(350, 180, 280, 40);
		fdAccount.setFont(new Font("Realeway", Font.PLAIN , 20));
		add(fdAccount);
		
		currentAccount=new JRadioButton("Current Account");
		currentAccount.setBackground(Color.WHITE);
		currentAccount.setBounds(100, 210, 200, 40);
		currentAccount.setFont(new Font("Realeway", Font.PLAIN , 20));
		add(currentAccount);
		
		rdAccount=new JRadioButton("Recurring Deposit Account");
		rdAccount.setBackground(Color.WHITE);
		rdAccount.setBounds(350, 210, 280, 40);
		rdAccount.setFont(new Font("Realeway", Font.PLAIN , 20));
		add(rdAccount);
		
		ButtonGroup groupAccount= new ButtonGroup();
		groupAccount.add(savingAccount);
		groupAccount.add(fdAccount);
		groupAccount.add(currentAccount);
		groupAccount.add(rdAccount);
		
		JLabel cardNum=new JLabel("Card Number : ");
		cardNum.setFont(new Font("Raleway", Font.BOLD, 28));
		cardNum.setBounds(100, 300, 200, 30);
		add(cardNum);
		
		JLabel cNum=new JLabel("XXXX-XXXX-XXXX-1578");
		cNum.setFont(new Font("Raleway", Font.BOLD, 28));
		cNum.setBounds(330, 300, 330, 30);
		add(cNum);
		
		JLabel info1=new JLabel("Your 16 Digit Card Number");
		info1.setFont(new Font("Raleway", Font.BOLD, 14));
		info1.setBounds(100, 323, 200, 30);
		add(info1);
		
		JLabel pin=new JLabel("PIN : ");
		pin.setFont(new Font("Raleway", Font.BOLD, 28));
		pin.setBounds(100, 370, 200, 30);
		add(pin);
		
		JLabel pNum=new JLabel("XXXX");
		pNum.setFont(new Font("Raleway", Font.BOLD, 28));
		pNum.setBounds(330, 370, 300, 30);
		add(pNum);
		
		JLabel info2=new JLabel("Your 4 Digit PIN Number");
		info2.setFont(new Font("Raleway", Font.BOLD, 14));
		info2.setBounds(100, 393, 200, 30);
		add(info2);
			
		JLabel serviceRequired=new JLabel("Service Required : ");
		serviceRequired.setFont(new Font("Raleway", Font.BOLD, 28));
		serviceRequired.setBounds(100, 460, 300, 30);
		add(serviceRequired);
		
		atmCard=new JCheckBox("ATM Card");
		atmCard.setBackground(Color.WHITE);
		atmCard.setBounds(100, 500, 200, 40);
		atmCard.setFont(new Font("Realeway", Font.PLAIN , 20));
		add(atmCard);
		
		mobieBanking=new JCheckBox("Mobile Banking");
		mobieBanking.setBackground(Color.WHITE);
		mobieBanking.setBounds(100, 530, 200, 40);
		mobieBanking.setFont(new Font("Realeway", Font.PLAIN , 20));
		add(mobieBanking);
		
		chequeBook=new JCheckBox("Cheque Book");
		chequeBook.setBackground(Color.WHITE);
		chequeBook.setBounds(100, 560, 200, 40);
		chequeBook.setFont(new Font("Realeway", Font.PLAIN , 20));
		add(chequeBook);
		
		internetBanking=new JCheckBox("Internet Banking");
		internetBanking.setBackground(Color.WHITE);
		internetBanking.setBounds(350, 500, 280, 40);
		internetBanking.setFont(new Font("Realeway", Font.PLAIN , 20));
		add(internetBanking);
		
		eSmsAlert=new JCheckBox("EMAIL & SMS Alert");
		eSmsAlert.setBackground(Color.WHITE);
		eSmsAlert.setBounds(350, 530, 280, 40);
		eSmsAlert.setFont(new Font("Realeway", Font.PLAIN , 20));
		add(eSmsAlert);
		
		eStatement=new JCheckBox("E-Statement");
		eStatement.setBackground(Color.WHITE);
		eStatement.setBounds(350, 560, 280, 40);
		eStatement.setFont(new Font("Realeway", Font.PLAIN , 20));
		add(eStatement);
		
		declare=new JCheckBox("I hereby declare that the above details entered are correct to the best of my knowledge.");
		declare.setBackground(Color.WHITE);
		declare.setBounds(100, 620, 600, 40);
		declare.setFont(new Font("Realeway", Font.PLAIN , 12));
		add(declare);
		
		submit=new JButton("SUBMIT");
		submit.setBounds(250, 680, 100, 30);
		submit.setBackground(Color.BLACK);
		submit.setForeground(Color.WHITE);
		submit.setFont(new Font("Raleway", Font.BOLD, 14));
		submit.addActionListener(this);
		add(submit);
		
		cancel=new JButton("CANCEL");
		cancel.setBounds(400, 680, 100, 30);
		cancel.setBackground(Color.BLACK);
		cancel.setForeground(Color.WHITE);
		cancel.setFont(new Font("Raleway", Font.BOLD, 14));
		cancel.addActionListener(this);
		add(cancel);
		
		getContentPane().setBackground(Color.WHITE);;
		
		setSize(750, 800);
		setLocation(350, 10);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
				
		if(ae.getSource()==submit) {
			
			String sAccountType=null;
			if(savingAccount.isSelected()) {
				sAccountType="Saving Account";
			}
			else if(rdAccount.isSelected()) {
				sAccountType="Recurring Deposit Account";
			}
			else if(fdAccount.isSelected()) {
				sAccountType="Fixed Deposit Account";
			}
			else if(currentAccount.isSelected()) {
				sAccountType="Current Account";
			}
			String sCardNum="624862";
			int number=0;
			int count=1;
			while(count<=10){
				number=1+(int)(Math.random()*9);
				sCardNum=sCardNum + number;
				count++;
			}
			String sPinNum="";
			number=0;
			count=1;
			while(count<=4){
				number=1+(int)(Math.random()*9);
				sPinNum=sPinNum + number;
				count++;
			}
			String sServiceRequired="";
			if(atmCard.isSelected()) {
				sServiceRequired=sServiceRequired + " ATM Card";
			}
			else if(mobieBanking.isSelected()) {
				sServiceRequired=sServiceRequired + " Mobile Banking";
			}
			else if(internetBanking.isSelected()) {
				sServiceRequired=sServiceRequired + " Internet Banking";			
		    }
			else if(eSmsAlert.isSelected()) {
				sServiceRequired=sServiceRequired + " EMAIL & SMS Alert";
		    }
			else if(chequeBook.isSelected()) {
				sServiceRequired=sServiceRequired + " Cheque Book";
		    }
			else if(eStatement.isSelected()) {
				sServiceRequired=sServiceRequired + " E-Statement";
		    }
			String sDeclare=null;
			if(declare.isSelected()) {
				sDeclare="Agreed";
			}
			else {
				sDeclare="";
			}
			try {
				if(sAccountType.equals("")) {
					JOptionPane.showMessageDialog(null, "Account Type is Required");
				}
				else if(sServiceRequired.equals("")) {
					JOptionPane.showMessageDialog(null, "Services Required is not selected");
				}
				else if(sDeclare.equals("")) {
					JOptionPane.showMessageDialog(null, "Please agree the declaration");
				}
				else {
					Conn c=new Conn();
					String query1="insert into signup3 values('" + form + "', '" + sAccountType + "', '" + sCardNum + "', '" + sPinNum + "', '" + sServiceRequired + "')";
					String query2="insert into login values('" + form + "', '" + sCardNum + "', '" + sPinNum + "')";
					c.s.executeUpdate(query1);
					c.s.executeUpdate(query2);
					JOptionPane.showMessageDialog(null,"Card number:- " + sCardNum + "\nPIN Number:- " + sPinNum);
					
					
				}
			}catch(Exception e) {
				System.out.println(e);
			}
			setVisible(false);
		}
		else if(ae.getSource()==cancel) {
			setVisible(false);
			new Login().setVisible(true);
		}
			
			
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Signup3("");
		
	}

}
 