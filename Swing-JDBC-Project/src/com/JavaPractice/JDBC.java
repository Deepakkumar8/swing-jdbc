package com.JavaPractice;

import javax.swing.*;
import javax.xml.transform.Result;
import java.sql.*;

public class JDBC {
    static int createAccount(SwingExample sE,String sName,String sGender,String sBranch,String sSemester,String sMobileNumber,String sEmailID,String  sPassword){
        Connection connection=null;
        Statement statement =null;

        String url="jdbc:mysql://localhost:3306/assignment2";
        String username = "root";
        String mySQLPassword= "mysql@2021";



        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection= DriverManager.getConnection(url,username,mySQLPassword);
            statement=connection.createStatement();
            String newAccount="insert into userDetails2 values ('"+sName+"','"+sGender+"','"+sBranch+"','"+sSemester+"','"+sMobileNumber+"','"+sEmailID+"','"+sPassword+"') ";
            statement.executeUpdate(newAccount);
            JOptionPane.showMessageDialog(sE.view2,"Account successfully created");

            statement.close();
            connection.close();
        }

//        catch (SQLException se) {
//            se.printStackTrace();
//            return 1;
//        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(sE.view2,ex+"\nTry Again");
            return 1;

        }


        return 0;
    }


    static void showUserDetails(SwingExample sE,String lMobileNumber,String sPassword){
        Connection connection=null;
        Statement statement =null;

        String url="jdbc:mysql://localhost:3306/assignment2";
        String username = "root";
        String mySQLPassword= "mysql@2021";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection= DriverManager.getConnection(url,username,mySQLPassword);
            statement=connection.createStatement();
            String input="select * from userDetails2 where mobileNumber='"+lMobileNumber+"' and password= '"+sPassword+"'";
            ResultSet Result =statement.executeQuery(input);


            Result.next();
            String name=Result.getString(1);
            String gender=Result.getString(2);
            String branch=Result.getString(3);
            String semester=Result.getString(4);
            String mobileNumber=Result.getString(5);
            String emailID=Result.getString(6);

            System.out.println(name);
            JOptionPane.showMessageDialog(sE.view2,"Name= "+name+"\nGender= "+gender+"\nBranch= "+branch+"\nSemester= "+semester+"\nMobile Number= "+mobileNumber+"\nEmailID= "+emailID);
            Result.close();
            statement.close();
        }

//        catch (SQLException se) {
////            se.printStackTrace();
//            JOptionPane.showMessageDialog(sE.view2,se);
//
//        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(sE.view2,ex+"\nTry Again");

        }



    }
}
