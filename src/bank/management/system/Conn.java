package bank.management.system;

import java.sql.*;

public class Conn {

	
	Connection c;//create connection
	Statement s;//create statement
	public Conn() {
		try {
//			Class.forName(com.mysql.c.jdbc.Driver);//driver register //driver name
			c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "pratikCoder");//connection create
			s=c.createStatement();//create statement and call
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
