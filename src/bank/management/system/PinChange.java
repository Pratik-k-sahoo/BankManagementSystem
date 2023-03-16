package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PinChange extends JFrame implements ActionListener{
	
	String sPinNum;
	JButton pinChange, back;
	JPasswordField nPin1, rePin1, oldPin1;
	
	PinChange(String sPinNum){
		
		this.sPinNum=sPinNum;
		setLayout(null);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2=i1.getImage().getScaledInstance(900, 970 , Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(0, 0, 900, 970);
		add(image);
		
		JLabel text=new JLabel("CHANGE YOUR PIN");
		text.setBounds(240, 330, 700, 40);
		text.setForeground(Color.RED);
		text.setFont(new Font("System", Font.BOLD, 20));
		image.add(text);
		
		JLabel nPin=new JLabel("ENTER PIN");
		nPin.setBounds(160, 380, 700, 25);
		nPin.setForeground(Color.WHITE);
		nPin.setFont(new Font("System", Font.BOLD, 16));
		image.add(nPin);
		
		JLabel rePin=new JLabel("RE-ENTER PIN");
		rePin.setBounds(160, 420, 700, 25);
		rePin.setForeground(Color.WHITE);
		rePin.setFont(new Font("System", Font.BOLD, 16));
		image.add(rePin);
		
		JLabel oldPin=new JLabel("ENTER OLD PIN");
		oldPin.setBounds(160, 460, 700, 25);
		oldPin.setForeground(Color.WHITE);
		oldPin.setFont(new Font("System", Font.BOLD, 16));
		image.add(oldPin);
		
		nPin1=new JPasswordField();
		nPin1.setFont(new Font("Raleway", Font.BOLD, 16));
		nPin1.setBounds(300, 380, 200, 25);
		image.add(nPin1);
		
		rePin1=new JPasswordField();
		rePin1.setFont(new Font("Raleway", Font.BOLD, 16));
		rePin1.setBounds(300, 420, 200, 25);
		image.add(rePin1);
		
		oldPin1=new JPasswordField();
		oldPin1.setFont(new Font("Raleway", Font.BOLD, 16));
		oldPin1.setBounds(300, 460, 200, 25);
		image.add(oldPin1);
		
		pinChange=new JButton("SUBMIT");
		pinChange.setBounds(375, 525, 130, 30);
		pinChange.addActionListener(this);
		image.add(pinChange);
		
		back=new JButton("BACK");
		back.setBounds(165, 525, 130, 30);
		back.addActionListener(this);
		image.add(back);
		
		setSize(900, 900);
		setLocation(300, 0);
		setUndecorated(true);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae){
		
		try {
			
			String SnPin= nPin1.getText();
			String SrePin= rePin1.getText();
			String SoldPin=oldPin1.getText();
			
			if(ae.getSource()==back) {
				setVisible(false);
				new Transaction(sPinNum).setVisible(true);
			}
			else {
				
				if(!SnPin.equals(SrePin)) {
					JOptionPane.showMessageDialog(null, "Entered PIN doesn't match.");
					return;
				}
				
				if(SnPin.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter new PIN.");
					return;
				}
				if(SrePin.equals("")) {
					JOptionPane.showMessageDialog(null, "Please re-enter new PIN.");
					return;
				}
				
				if(!SoldPin.equals(sPinNum)) {
					JOptionPane.showMessageDialog(null, "Incorrect Old PIN.");
					return;
				}
				
				Conn conn=new Conn();
				String query1="update bank set pin_num = '" + SrePin + "' where pin_num = '" + SoldPin + "'"; 
				String query2="update login set pin_num = '" + SrePin + "' where pin_num = '" + SoldPin + "'"; 
				String query3="update signup3 set pin_num = '" + SrePin + "' where pin_num = '" + SoldPin + "'"; 
				
				conn.s.executeUpdate(query1);
				conn.s.executeUpdate(query2);
				conn.s.executeUpdate(query3);
				
				JOptionPane.showMessageDialog(null, "PIN changed successfully.");
				
				setVisible(false);
				new Transaction(SrePin).setVisible(true);
				
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PinChange("");
	}

}
