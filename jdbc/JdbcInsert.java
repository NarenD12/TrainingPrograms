package com.infinite.jdbc;
//program to insert values into db
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * @author narend
 *
 */
public class JdbcInsert {

	public static void main(String[] args) {
		Connection on = null;
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName(args[0]);
			on = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "narennaren"); // Establishing Connection
			PreparedStatement ps=on.prepareStatement("insert into employee values(?,?,?)");
			System.out.println("Enter Fullname");	//Insert fullname
			ps.setString(1, sc.next());
			System.out.println("Enter Idno");		//Insert Idno
			ps.setInt(2, sc.nextInt());
			System.out.println("Enter Department Name");	//Insert DeptnameK
			ps.setString(3, sc.next());
			int status= ps.executeUpdate();
			if(status==1)
				System.out.println("Record Inserted");
			else
				System.out.println("Record Insertion Failed");
//			Statement stat = on.createStatement(); 				// Creating Statement
//			stat.executeUpdate("insert into employee values('Charles',110,'CSE')");	//SQL query to insert
//			System.out.println("Inserted values into employee table");
			
		} catch (SQLException e1) {
			System.out.println(e1);
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
			
		} finally {
			
			try {
				on.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
