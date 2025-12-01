package UtilsPractice;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadDataFromDb 
{
	public static void main(String[] args) throws Exception
	{
		//Class.forName("com.mysql.jdbc.Driver");
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con;
		try 
		{
			 con= DriverManager.getConnection("jdbc:mysql://localhost:3306/vaishnavipractice","root", "Muruga@1994");
			 									
		}
		catch (SQLException e)
			{

			throw new IOException("SQL not found");
			}
		
		Statement st=con.createStatement();
		ResultSet rs= st.executeQuery("Select * from crendentials");
		
		while(rs.next())
		{
			System.out.println(rs.getInt("userId")+ " - "+rs.getString("password"));
			
		}
		//ReadDataFromDb wbe=new ReadDataFromDb();
		//wbe.WriteDataFromExcel(618562,"46kjhcfkj@7646","Vaishnavi Nimalan");
		
		
	}
	public void WriteDataFromExcel(int userId,String password,String userName) throws ClassNotFoundException, IOException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con;
		try 
		{
			 con= DriverManager.getConnection("jdbc:mysql://localhost:3306/vaishnavipractice","root", "Muruga@1994");
			 									
		}
		catch (SQLException e)
			{

			throw new IOException("SQL not found");
			}
		Statement st=con.createStatement();
		int rows=st.executeUpdate("Insert into crendentials(userId,password,username) VALUES ('" + userId + "', '" + password + "', '" + userName + "')");
	System.out.println("Successfully Inserted");
	}

}
