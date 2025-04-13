package BankSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
// Global connection Class
public class connection {
	static Connection con; // Global Connection Object
	public static Connection getConnection()
	{
		try {
			
			
			String mysqlJDBCDriver
				= "com.mysql.cj.jdbc.Driver"; //jdbc driver
			String url
				= "jdbc:mysql://localhost:3306/banksystem"; //mysql url
			String user = "root";	 //mysql username
			String pass = "blacky23"; //mysql passcode
			Class.forName(mysqlJDBCDriver);
			con = DriverManager.getConnection(url, user,
											pass);
			Statement statement=connection.createstatement();
			ResultSet resultSet=statement.executeQuery(sql:"select*from*customer");
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1)+ "" +resultSet.getString(2)+""+resultSet.getString(3) 
				+""+resultSet.getInt(4))
				
				connection.close();
			}
		}
		catch (Exception e) {
			System.out.println("Connection Failed!");
		}

		return con;
	}
}
