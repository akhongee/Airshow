package com.selenium.selenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class MySOL {

	
	public static void main(String args[]) {
		try {
			//Step 1: Load/Register the MySQL driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//Step 2: Setup a connection with MySQL driver.
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "12345");
			
			//Step 3: Statements allow to issue SQL queries to the database
			
			Statement stmt = con.createStatement();
			
			//Step 4: Result set get the result of the SQL query
			String query = "select * from student";
			//Remember executeQuery() is used for SELECT statement  and
			//          UpdateQuery() is used for INSERT,DELETE,UPDATE statements. 
			ResultSet rs = stmt.executeQuery(query);
			
			//Process the ResultSet by scrolling the cursor forward via next().
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			
			// Step 5: Close the connection.
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
