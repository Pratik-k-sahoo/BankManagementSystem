package bank.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

import com.toedter.calendar.JDateChooser;



public class Signup1 extends JFrame implements ActionListener {
	
	JButton next;
	int ran;
	int no;
	JTextField nameTF, fatherTF, emailTF, addressTF, cityTF, stateTF, pincodeTF;
	JRadioButton male, female, married, unmarried, divorce, other;
	JDateChooser dateChooser;
	
	
	
	
	Signup1(){
		
		setLayout(null);
		
		int ran=(int)(9999*Math.random()) ;
		if(ran==0) {
			ran=(int)(999*Math.random())+ran;
		}
		else {
			ran=999+ran;
		}
		no=ran;
//		System.out.println(ran);
		JLabel formNo=new JLabel("APPLICATION FORM NO. " + ran);
		formNo.setFont(new Font("Raleway", Font.BOLD, 38));
		formNo.setBounds(140, 20, 600, 40);
		add(formNo);
		
		JLabel page=new JLabel("Page 1");
		page.setFont(new Font("Raleway", Font.BOLD, 15));
		page.setBounds(750, 730, 400, 30);
		add(page);
		
		JLabel personalDetails=new JLabel("Personal Details ");
		personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
		personalDetails.setBounds(290, 80, 400, 30);
		add(personalDetails);
		
		JLabel name=new JLabel("Name : ");
		name.setFont(new Font("Raleway", Font.BOLD, 22));
		name.setBounds(100, 140, 100, 30);
		add(name);
		
		nameTF=new JTextField();
		nameTF.setFont(new Font("Raleway", Font.BOLD, 14));
		nameTF.setBounds(300, 143, 400, 30);
		add(nameTF);
		
		JLabel nameF=new JLabel("Father's Name : ");
		nameF.setFont(new Font("Raleway", Font.BOLD, 22));
		nameF.setBounds(100, 190, 200, 30);
		add(nameF);
		
		fatherTF=new JTextField();
		fatherTF.setFont(new Font("Raleway", Font.BOLD, 14));
		fatherTF.setBounds(300, 193, 400, 30);
		add(fatherTF);
		
		JLabel dob=new JLabel("Date Of Birth : ");
		dob.setFont(new Font("Raleway", Font.BOLD, 22));
		dob.setBounds(100, 240, 200, 30);
		add(dob);
		
		dateChooser=new JDateChooser();
		dateChooser.setBounds(300, 243, 400, 30);
		add(dateChooser);
		
		JLabel gender=new JLabel("Gender : ");
		gender.setFont(new Font("Raleway", Font.BOLD, 22));
		gender.setBounds(100, 290, 200, 30);
		add(gender);
		
		male=new JRadioButton("MALE");
		male.setBounds(300, 293, 60, 30);
		male.setBackground(Color.WHITE);
		add(male);
		
		female=new JRadioButton("FEMALE");
		female.setBounds(500, 293, 75, 30);
		female.setBackground(Color.WHITE);
		add(female);
		
		ButtonGroup groupGender = new ButtonGroup();
		groupGender.add(male);
		groupGender.add(female);
		
		
		JLabel email=new JLabel("Email Address : ");
		email.setFont(new Font("Raleway", Font.BOLD, 22));
		email.setBounds(100, 340, 200, 30);
		add(email);
		
		emailTF=new JTextField();
		emailTF.setFont(new Font("Raleway", Font.BOLD, 14));
		emailTF.setBounds(300, 343, 400, 30);
		add(emailTF);
		
		JLabel mStatus=new JLabel("Marital Status : ");
		mStatus.setFont(new Font("Raleway", Font.BOLD, 22));
		mStatus.setBounds(100, 390, 200, 30);
		add(mStatus);
		
		married=new JRadioButton("MARRIED");
		married.setBounds(300, 393, 80, 30);
		married.setBackground(Color.WHITE);
		add(married);
		
		unmarried=new JRadioButton("UNMARRIED");
		unmarried.setBounds(405, 393, 110, 30);
		unmarried.setBackground(Color.WHITE);
		add(unmarried);
		
		divorce=new JRadioButton("DIVORCE");
		divorce.setBounds(530, 393, 100, 30);
		divorce.setBackground(Color.WHITE);
		add(divorce);
		
		other=new JRadioButton("OTHER");
		other.setBounds(630, 393, 110, 30);
		other.setBackground(Color.WHITE);
		add(other);
		
		ButtonGroup mStatusGroup = new ButtonGroup();
		mStatusGroup.add(married);
		mStatusGroup.add(unmarried);
		mStatusGroup.add(divorce);
		mStatusGroup.add(other);
		
		JLabel address=new JLabel("Address : ");
		address.setFont(new Font("Raleway", Font.BOLD, 22));
		address.setBounds(100, 440, 200, 30);
		add(address);
		
		addressTF=new JTextField();
		addressTF.setFont(new Font("Raleway", Font.BOLD, 14));
		addressTF.setBounds(300, 443, 400, 30);
		add(addressTF);
		
		JLabel city=new JLabel("City : ");
		city.setFont(new Font("Raleway", Font.BOLD, 22));
		city.setBounds(100, 490, 200, 30);
		add(city);
		
		cityTF=new JTextField();
		cityTF.setFont(new Font("Raleway", Font.BOLD, 14));
		cityTF.setBounds(300, 493, 400, 30);
		add(cityTF);
		
		JLabel state=new JLabel("State : ");
		state.setFont(new Font("Raleway", Font.BOLD, 22));
		state.setBounds(100, 540, 200, 30);
		add(state);
		
		stateTF=new JTextField();
		stateTF.setFont(new Font("Raleway", Font.BOLD, 14));
		stateTF.setBounds(300, 543, 400, 30);
		add(stateTF);
		
		JLabel pinCode=new JLabel("Pincode : ");
		pinCode.setFont(new Font("Raleway", Font.BOLD, 22));
		pinCode.setBounds(100, 590, 200, 30);
		add(pinCode);
		
		pincodeTF=new JTextField();
		pincodeTF.setFont(new Font("Raleway", Font.BOLD, 14));
		pincodeTF.setBounds(300, 593, 400, 30);
		add(pincodeTF);
		
		
		
		next=new JButton("NEXT");
		next.setBounds(620, 660, 80, 30);
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setFont(new Font("Raleway", Font.BOLD, 14));
		next.addActionListener(this);
		add(next);
		
		getContentPane().setBackground(Color.WHITE);;
		
		setSize(850, 800);
		setLocation(350, 10);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		String form="" + no;
		
		String name=nameTF.getText();
		String father=fatherTF.getText();
		String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
		String gender=null;
		if(male.isSelected()) {
			gender="MALE";
		}
		else {
			gender="FEMALE";
		}
		String email=emailTF.getText();
		String mStatus=null;
		if(married.isSelected()) {
			mStatus="MARRIED";
		}
		else if(unmarried.isSelected()) {
			mStatus="UNMARRIED";
		}
		else if(divorce.isSelected()) {
			mStatus="DIVORCE";
		}
		else {
			mStatus="OTHER";
		}
		String address=addressTF.getText();
		String city=cityTF.getText();
		String state=stateTF.getText();
		String pincode=pincodeTF.getText();
		
		
		try {
			if(name.equals("")) {
				JOptionPane.showMessageDialog(null, "Name is Required");
			}
			else if(father.equals("")) {
				JOptionPane.showMessageDialog(null, "Father's Name is Required");
			}
			else if(dob.equals("")) {
				JOptionPane.showMessageDialog(null, "Date Of Birth is Required");
			}
			else if(gender.equals("")) {
				JOptionPane.showMessageDialog(null, "Gender is Required");
			}
			else if(email.equals("")) {
				JOptionPane.showMessageDialog(null, "Email is Required");
			}
			else if(mStatus.equals("")) {
				JOptionPane.showMessageDialog(null, "mStatus is Required");
			}
			else if(address.equals("")) {
				JOptionPane.showMessageDialog(null, "address is Required");
			}
			else if(city.equals("")) {
				JOptionPane.showMessageDialog(null, "city is Required");
			}
			else if(state.equals("")) {
				JOptionPane.showMessageDialog(null, "state is Required");
			}
			else if(pincode.equals("")) {
				JOptionPane.showMessageDialog(null, "pincode is Required");
			}
			else {
				Conn c=new Conn();
				String query="insert into signup values('" + form + "', '" + name + "', '" + father + "', '" + dob + "', '" + gender + "', '" + email + "', '" + mStatus + "', '" + address + "', '" + city + "', '" + state + "', '" + pincode + "')";
				c.s.executeUpdate(query);
				
				setVisible(false);
				new SignupTwo(form).setVisible(true);
				
			}
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Signup1();
	}

}
 