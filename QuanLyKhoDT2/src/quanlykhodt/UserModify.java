/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlykhodt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kax20
 */
public class UserModify {
    public static List<User> findAll(){
        ArrayList<User> Userlist = new ArrayList<>();
        Statement statement = null;
        Connection conn = null;
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dienthoai","root", "");
             String sql = "select * from user ";
             statement = conn.createStatement();
             ResultSet resultSet = statement.executeQuery(sql);
             while(resultSet.next()){
                 User a = new User(resultSet.getString("userName"),resultSet.getString("passWord"),resultSet.getString("email"),resultSet.getString("vaiTro"));
                 Userlist.add(a);
             }
        } catch (SQLException ex) {
            Logger.getLogger(UserModify.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Userlist;
    }
    public static void Insert(User a){
        PreparedStatement statement = null;
        Connection conn = null;
        try {
             conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dienthoai","root", "");
             String sql = "INSERT INTO user (Username, Password, VaiTro, Email) values (?, ?, ?, ?)";
             statement = conn.prepareCall(sql);
             statement.setString(1, a.getUserName());
             statement.setString(2, a.getPassWord());
             statement.setString(3, a.getVaiTro());
             statement.setString(4, a.getEmail());
             statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(UserModify.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void delete(String a){
        PreparedStatement statement = null;
        Connection conn = null;
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dienthoai","root", "");
            String sql = "delete from User where Username = ?";
             statement = conn.prepareCall(sql);
             statement.setString(1, a);
             statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(UserModify.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void update(User a){
        PreparedStatement statement = null;
        Connection conn = null;
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dienthoai","root", "");
             String sql = "update user set Password = ?, Vaitro = ?, Email = ? where Username = ?";
             statement = conn.prepareCall(sql);
             statement.setString(4, a.getUserName());
             statement.setString(1, a.getPassWord());
             statement.setString(2, a.getVaiTro());
             statement.setString(3, a.getEmail());
             statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(UserModify.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}