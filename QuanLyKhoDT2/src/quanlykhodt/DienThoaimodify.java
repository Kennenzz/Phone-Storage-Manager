/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlykhodt;

/**
 *
 * @author kax20
 */
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author kax20
 */
public class DienThoaimodify {

    public static List<DienThoai> findAll(){
        
        ArrayList<DienThoai> DienThoailist = new ArrayList<>();
        Statement statement = null;
        Connection conn = null;
        try {
             conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dienthoai","root", "");
             String sql = "select * from dienthoai ";
             statement = conn.createStatement();
             ResultSet resultSet = statement.executeQuery(sql);
             while(resultSet.next()){
                 DienThoai dt = new DienThoai(resultSet.getString("MaDT"),resultSet.getString("TenDT"),resultSet.getString("HDH"),resultSet.getString("MauDT"), resultSet.getInt("soLuong"),resultSet.getDate("ngaynhap"));
                 DienThoailist.add(dt);
             }
        } catch (SQLException ex) {
            Logger.getLogger(DienThoaimodify.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(statement != null){{
                try {
                    statement.close();
                } catch (SQLException ex) {
                   Logger.getLogger(DienThoaimodify.class.getName()).log(Level.SEVERE, null, ex); 
                }
                }
            }
            if(conn != null){
                try{
                    conn.close();
                }catch (SQLException ex) {
            Logger.getLogger(DienThoaimodify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return DienThoailist;
    }
    public static void insert(DienThoai dt){
        PreparedStatement statement = null;
        Connection conn = null;
        try {
             conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dienthoai","root", "");
             String sql = "INSERT INTO dienthoai (MaDT, TenDT, HDH, MauDT, SoLuong, NgayNhap) values (?, ?, ?, ?, ?, ?)";
             statement = conn.prepareCall(sql);
             statement.setString(1, dt.getMaDT());
             statement.setString(2, dt.getTenDT());
             statement.setString(3, dt.getHDH());
             statement.setString(4, dt.getMauDT());
             statement.setInt(5,dt.getSoLuong());
             statement.setDate(6, new java.sql.Date(dt.getNgaynhap().getTime()));
             statement.execute();
             
        } catch (SQLException ex) {
            Logger.getLogger(DienThoaimodify.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(statement != null){{
                try {
                    statement.close();
                } catch (SQLException ex) {
                   Logger.getLogger(DienThoaimodify.class.getName()).log(Level.SEVERE, null, ex); 
                }
                }
            }
            if(conn != null){
                try{
                    conn.close();
                }catch (SQLException ex) {
            Logger.getLogger(DienThoaimodify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    public static void update(DienThoai dt){
        PreparedStatement statement = null;
        Connection conn = null;
        try {
             conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dienthoai","root", "");
             String sql = "update dienthoai set TenDT = ?, HDH = ?, MauDT = ?, SoLuong = ? where MaDT = ?";
             statement = conn.prepareCall(sql);
             statement.setString(1, dt.getTenDT());
             statement.setString(2, dt.getHDH());
             statement.setString(3, dt.getMauDT());
             statement.setInt(4, dt.getSoLuong());
             statement.setString(5, dt.getMaDT());
             statement.execute();
             
        } catch (SQLException ex) {
            Logger.getLogger(DienThoaimodify.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(statement != null){{
                try {
                    statement.close();
                } catch (SQLException ex) {
                   Logger.getLogger(DienThoaimodify.class.getName()).log(Level.SEVERE, null, ex); 
                }
                }
            }
            if(conn != null){
                try{
                    conn.close();
                }catch (SQLException ex) {
            Logger.getLogger(DienThoaimodify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    public static void delete(String MaDT){
        PreparedStatement statement = null;
        Connection conn = null;
        try {
             conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dienthoai","root", "");
             String sql = "delete from dienthoai where MaDT = ?";
             statement = conn.prepareCall(sql);
             statement.setString(1, MaDT);
             statement.execute();
             
        } catch (SQLException ex) {
            Logger.getLogger(DienThoaimodify.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(statement != null){{
                try {
                    statement.close();
                } catch (SQLException ex) {
                   Logger.getLogger(DienThoaimodify.class.getName()).log(Level.SEVERE, null, ex); 
                }
                }
            }
            if(conn != null){
                try{
                    conn.close();
                }catch (SQLException ex) {
            Logger.getLogger(DienThoaimodify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}