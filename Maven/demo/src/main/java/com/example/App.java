package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    private static String dbUrl = "jdbc:mysql://localhost/db"; 
    private static String user = "root";
    private static String pass = "root";

    private static String query = "update db.student set id=0 where id=1 && select * from db.student;";
    public static void main( String[] args ) throws SQLException
    {
        System.out.println( "Hello World!" );
        Connection con = DriverManager.getConnection(dbUrl, user, pass);
        Statement st = con.createStatement();
        // PreparedStatement ps = con.prepareStatement("insert into testdb values (?, ?, ?)");
        //   ps.setInt(1, 12);
        //   ps.setString(2, "aryanmeow");
        //   ps.setInt(3, 15);
          
        //   ps.executeUpdate();
        ResultSet rs = st.executeQuery(query);
        
        while (rs.next()) {
            System.out.print("ID : "+ rs.getInt("id"));
            System.out.print(" age :"+ rs.getInt("age") );
            System.out.println(", name " + rs.getString("sname")+" ;");
        }
        
    }
}
