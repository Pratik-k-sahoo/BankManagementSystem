package bank.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;





public class SignupTwo extends JFrame implements ActionListener {
	
	JButton next;
	JTextField panTF, aadhaarTF;
	JComboBox religionType, categoryType, incomeRange, eduQual, occu;
	JRadioButton sYes, sNo, eAYes, eANo;
	String form;
	
	
	
	
	SignupTwo(String form){
		
		this.form=form;
		setLayout(null);
		
		setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
		
		
		
		JLabel page=new JLabel("Page 2");
		page.setFont(new Font("Raleway", Font.BOLD, 15));
		page.setBounds(750, 730, 400, 30);
		add(page);
		
		JLabel additionalDetails=new JLabel("Additional Details ");
		additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
		additionalDetails.setBounds(350, 80, 400, 30);
		add(additionalDetails);
		
		JLabel religion=new JLabel("Religion : ");
		religion.setFont(new Font("Raleway", Font.BOLD, 20));
		religion.setBounds(100, 140, 100, 30);
		add(religion);
		
		String valReligion[]={"", "HINDU", "MUSLIM", "CRISTIAN", "SIKH", "OTHER"};
		religionType=new JComboBox(valReligion);
		religionType.setBounds(300, 143, 400, 30);
		religionType.setBackground(Color.WHITE);
		add(religionType);
		
		JLabel category=new JLabel("Category : ");
		category.setFont(new Font("Raleway", Font.BOLD, 20));
		category.setBounds(100, 190, 200, 30);
		add(category);
		
		String valCategory[]={"", "GENERAL", "OBC", "SC/ST", "OTHER"};
		categoryType=new JComboBox(valCategory);
		categoryType.setBounds(300, 193, 400, 30);
		categoryType.setBackground(Color.WHITE);
		add(categoryType);
		
		JLabel income=new JLabel("Income : ");
		income.setFont(new Font("Raleway", Font.BOLD, 20));
		income.setBounds(100, 240, 200, 30);
		add(income);
		
		String valincome[]={"", "above 500000", "500000-300000", "300000-100000", "Below 100000"};
		incomeRange=new JComboBox(valincome);
		incomeRange.setBounds(300, 243, 400, 30);
		incomeRange.setBackground(Color.WHITE);
		add(incomeRange);
		
		JLabel education=new JLabel("Educational");
		education.setFont(new Font("Raleway", Font.BOLD, 20));
		education.setBounds(100, 290, 200, 30);
		add(education);
		
		JLabel qualification=new JLabel("Qualification : ");
		qualification.setFont(new Font("Raleway", Font.BOLD, 20));
		qualification.setBounds(100, 318, 200, 30);
		add(qualification);
		
		String valqual[]={"", "POSTGRADUATE", "GRADUATE", "NON-GRADUATE", "DOCTRATE", "OTHER"};
		eduQual=new JComboBox(valqual);
		eduQual.setBounds(300, 300, 400, 30);
		eduQual.setBackground(Color.WHITE);
		add(eduQual);
		
		JLabel occupation=new JLabel("Occupation : ");
		occupation.setFont(new Font("Raleway", Font.BOLD, 20));
		occupation.setBounds(100, 390, 200, 30);
		add(occupation);
		
		String valoccu[]={"", "SALARIED", "SELF-EMPLOYED", "BUSSINESS", "STUDENT", "RETIRED", "OTHER"};
		occu=new JComboBox(valoccu);
		occu.setBounds(300, 393, 400, 30);
		occu.setBackground(Color.WHITE);
		add(occu);
		
		JLabel panNo=new JLabel("PAN Number : ");
		panNo.setFont(new Font("Raleway", Font.BOLD, 20));
		panNo.setBounds(100, 440, 200, 30);
		add(panNo);
		
		panTF=new JTextField();
		panTF.setFont(new Font("Raleway", Font.BOLD, 14));
		panTF.setBounds(300, 443, 400, 30);
		add(panTF);
		
		JLabel aadhaar=new JLabel("Aadhaar Number : ");
		aadhaar.setFont(new Font("Raleway", Font.BOLD, 20));
		aadhaar.setBounds(100, 490, 200, 30);
		add(aadhaar);
		
		aadhaarTF=new JTextField();
		aadhaarTF.setFont(new Font("Raleway", Font.BOLD, 14));
		aadhaarTF.setBounds(300, 493, 400, 30);
		add(aadhaarTF);
		
		JLabel citizen=new JLabel("Senior Citizen : ");
		citizen.setFont(new Font("Raleway", Font.BOLD, 20));
		citizen.setBounds(100, 540, 200, 30);
		add(citizen);
		
		sYes=new JRadioButton("YES");
		sYes.setBounds(300, 543, 100, 30);
		sYes.setBackground(Color.WHITE);
		add(sYes);
		
		sNo=new JRadioButton("No");
		sNo.setBounds(450, 543, 100, 30);
		sNo.setBackground(Color.WHITE);
		add(sNo);
		
		ButtonGroup sCitizenGroup = new ButtonGroup();
		sCitizenGroup.add(sYes);
		sCitizenGroup.add(sNo);
		
		JLabel account=new JLabel("Existing Account : ");
		account.setFont(new Font("Raleway", Font.BOLD, 20));
		account.setBounds(100, 590, 200, 30);
		add(account);
		
		eAYes=new JRadioButton("YES");
		eAYes.setBounds(300, 593, 100, 30);
		eAYes.setBackground(Color.WHITE);
		add(eAYes);
		
		eANo=new JRadioButton("No");
		eANo.setBounds(450, 593, 100, 30);
		eANo.setBackground(Color.WHITE);
		add(eANo);
		
		ButtonGroup eAGroup = new ButtonGroup();
		sCitizenGroup.add(sYes);
		sCitizenGroup.add(sNo);
		
		
		
		
		
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
				
		String sReligion=(String)religionType.getSelectedItem();
		String sCategory=(String)categoryType.getSelectedItem();
		String sIncome=(String)incomeRange.getSelectedItem();
		String sEduQual=(String)eduQual.getSelectedItem();
		String sOccu=(String)occu.getSelectedItem();
		String sPan=panTF.getText();
		String sAadhaar=aadhaarTF.getText();
		String citizen=null;
		if(sYes.isSelected()) {
			citizen="Senior Citizen";
		}
		else {
			citizen="Normal Citizen";
		}

		String existingAcoount=null;
		if(eAYes.isSelected()) {
			existingAcoount="Existing";
		}
		else if(eANo.isSelected()) {
			existingAcoount="New Account";
		}
			
		try {
			if(sReligion.equals("")) {
				JOptionPane.showMessageDialog(null, "Religion is Required");
			}
			else if(sCategory.equals("")) {
				JOptionPane.showMessageDialog(null, "Category is Required");
			}
			else if(sIncome.equals("")) {
				JOptionPane.showMessageDialog(null, "Income Range is Required");
			}
			else if(sEduQual.equals("")) {
				JOptionPane.showMessageDialog(null, "Educational Qualification is Required");
			}
			else if(sOccu.equals("")) {
				JOptionPane.showMessageDialog(null, "Occupation filled is Required");
			}
			else if(sPan.equals("")) {
				JOptionPane.showMessageDialog(null, "PAN Number is Required");
			}
			else if(sAadhaar.equals("")) {
				JOptionPane.showMessageDialog(null, "Aadhaar Number is Required");
			}
			else if(citizen.equals("")) {
				JOptionPane.showMessageDialog(null, "Citizenship is Required");
			}
			else if(existingAcoount.equals("")) {
				JOptionPane.showMessageDialog(null, "Account Type is Required");
			}
			
			else {
				Conn c=new Conn();
				String query="insert into signupTwo values('" + form + "', '" + sReligion + "', '" + sCategory + "', '" + sIncome + "', '" + sEduQual + "', '" + sOccu + "', '" + sPan + "', '" + sAadhaar + "', '" + citizen + "', '" + existingAcoount + "')";
				c.s.executeUpdate(query);
				
				setVisible(false);
				new Signup3(form).setVisible(true);
				
				
			}
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SignupTwo("");
	}

}
 