package org.sturtevantauto.io;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PartsParser {
	private static String dbUrl = "jdbc:mysql://127.0.0.1:3306?autoReconnect=true&useSSL=false";
	private static String dbUsername = "imagesorter";
	private static String dbPassword = "4vSmbst4Q#uhL#3%";
	
	public static String[] findParts() throws SQLException, ClassNotFoundException
	{
		int i = 0;
		String[] parts = new String[50];
		Class.forName("com.mysql.jdbc.Driver");
	    Connection connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
	    Statement statement = connection.createStatement();
		ResultSet use = statement.executeQuery("USE car_parts");
	    ResultSet rs = statement.executeQuery("SELECT * FROM Cars_Index");
	    while(rs.next())
	    {
	    	String part = rs.getString(i);
	    	parts[i] = part;
	    	i++;
	    }
	    use.close();
	    rs.close();
	    statement.close();
	    connection.close();

		return parts;
	}

}
