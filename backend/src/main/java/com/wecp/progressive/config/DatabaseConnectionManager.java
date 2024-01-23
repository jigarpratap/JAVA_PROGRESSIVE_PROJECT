package com.wecp.progressive.config;

<<<<<<< HEAD
public class DatabaseConnectionManager {

=======
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {
   static String url="jdbc:mysql://localhost:3306/banksafe_wecp";
   static String username="root";
   static String password="root";
   
   public static Connection getConnection() throws SQLException{
    return DriverManager.getConnection(url,username,password);
   }
>>>>>>> ce4e1eba09839dd051bb84bf8ecb50ade8475edd
}
