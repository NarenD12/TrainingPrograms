package com.infinite.jdbc;
import java.io.FileReader;
import java.io.IOException;
//program to insert values into db
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import com.infinite.security.*;

/**
 * @author narend
 *
 */
public class JdbcInsert {
	private static final Logger logger=Logger.getLogger(JdbcInsert.class);

	public static void main(String[] args) {
		Connection on = null;
		Scanner sc=new Scanner(System.in);
		PropertyConfigurator.configure("log4j.properties");
		FileReader fr=null;
		Properties pr=null;
		
		try {
			fr=new FileReader("mysqldb.properties");
			pr=new Properties();
			pr.load(fr);
			Class.forName(pr.getProperty("drivername"));
			on = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", 
					JavaSecurity.decrypt(pr.getProperty("username"),"prdp123"),
					JavaSecurity.decrypt(pr.getProperty("password"),"pr321")); // Establishing Connection
			System.out.println("Connected with Database");
//			PreparedStatement ps=on.prepareStatement("insert into employee values(?,?,?)");
//			logger.info("Enter Fullname");	//Insert fullname
//			ps.setString(1, sc.next());
//			logger.info("Enter Idno");		//Insert Idno
//			ps.setInt(2, sc.nextInt());
//			logger.info("Enter Department Name");	//Insert DeptnameK
//			ps.setString(3, sc.next());
//			int status= ps.executeUpdate();
//			if(status==1)
//				logger.info("Record Inserted");
//			else
//				logger.info("Record Insertion Failed");
	
		} catch (SQLException e1) {
			logger.error(e1);
			
		} catch (ClassNotFoundException e) {
			logger.error(e);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				on.close();
				sc.close();
			} catch (Exception e) {
				logger.error(e);
			}
		}
	}
}
