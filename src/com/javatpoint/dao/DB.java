package com.javatpoint.dao;
import java.sql.*;
public class DB {
public static Connection getCon(){
	Connection con=null;
	try{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3307/fee","root","root");
	}catch(Exception ex){System.out.println(ex);}
	return con;
}
}
