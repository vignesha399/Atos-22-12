package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.sql.Statement;
import java.util.Scanner;
public class App 
{
    static Scanner s = new Scanner(System.in);
    private static String dbUrl = "jdbc:mysql://localhost/db"; 
    private static String user = "root";
    private static String pass = "root";
    
    public void view() throws SQLException{
        Connection con = DriverManager.getConnection(dbUrl, user, pass);
        Statement st = con.createStatement();
        String query = s.nextLine();
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            System.out.print(" | ID : "+ rs.getInt("id"));
            System.out.print(" | ename : "+ rs.getString("sname"));
            System.out.print(" | age : "+ rs.getInt("age"));
            System.out.print(" | salery : "+ rs.getDouble("salery"));
            System.out.print(" | desgination : "+ rs.getString("job"));
            System.out.print(" | hiredate : "+ rs.getDate("hiredate"));
            System.out.print(" | commision : "+ rs.getInt("comm"));
            System.out.print(" | dept : "+ rs.getInt("dept"));
            System.out.println();
        }
        System.out.println("result was not successfull!");
    }
    public void insertValues() throws SQLException {
        Connection con = DriverManager.getConnection(dbUrl, user, pass);
        PreparedStatement ps = con.prepareStatement("insert into db.student values (?, ?, ?, ?, ?, ? ,? ,?)");
        System.out.println("Enter the id number : ");
        int id =  s.nextInt();
        ps.setInt(1, id);
        s.nextLine();
        System.out.println("Enter the Employee name : ");
        String sname = s.nextLine();
        ps.setString(2, sname);
        System.out.println("Enter the age  : ");
        int age = s.nextInt();
        ps.setInt(3, age);
        System.out.println("Enter the Salery amount : ");
        int salery = s.nextInt();
        ps.setInt(4, salery);
        s.nextLine();
        System.out.println("Enter the job role/desgination : ");
        String role = s.nextLine();
        ps.setString(5, role);
        System.out.println("Enter the hireDate : ");
        double str = s.nextDouble();
        // Date date=Date.valueOf(str);//converting string into sql date.
        ps.setDouble(6, str);
        System.out.println("Enter the commision amount : ");
        int comm =s.nextInt();
        ps.setInt(7, comm);
        System.out.println("Enter the department number : ");
        int dept =s.nextInt();
        ps.setInt(8, dept);
        s.nextLine();
        ps.executeUpdate();
        System.out.println("CRUD operation is successfull!");
    }
    public void addCol() throws SQLException {
        Connection con = DriverManager.getConnection(dbUrl, user, pass);
        System.out.println("enter the table name with database name (eg test.student = test is db, student is table)");
        String dbtname = s.nextLine();
        System.out.println("enter the column name (eg column int, column varchar(20)) : ");
        String colname =  s.nextLine();
        PreparedStatement ps2 = con.prepareStatement("alter table "+dbtname+" add "+colname+" ;");
        ps2.execute();
        System.out.println("column adding is successful");
    }
    public void dropCol() throws SQLException {
        Connection con = DriverManager.getConnection(dbUrl, user, pass);
        System.out.println("enter the table name with database name (eg test.student = test is db, student is table)");
        String dbtname = s.nextLine();
        System.out.println("enter the column name (eg column_name) : ");
        String colname =  s.nextLine();
        PreparedStatement ps2 = con.prepareStatement("alter table "+dbtname+" drop column "+colname+" ;");
        try {
            ps2.execute();
        } catch (SQLSyntaxErrorException e) {
            System.out.println("ERROR!!\n enter correct table_name or column_name");
        }
        System.out.println("column drop is successful");
    }
    public void query() throws SQLException {
        Connection con = DriverManager.getConnection(dbUrl, user, pass);
        String query = s.nextLine();
        PreparedStatement ps3 = con.prepareStatement(query);
        ps3.execute();
    }
    public static void main( String[] args ) throws SQLException
    {
        App a = new App();
        a.addCol();
        a.query();
        a.dropCol();
        a.insertValues();
        a.view();
    }
}