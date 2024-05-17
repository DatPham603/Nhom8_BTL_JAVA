/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;
import Object.Admin;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Admin
 */
public class AdminData {
    public static PreparedStatement ps;
    public static ResultSet rs;
    public List<Admin> getAll(){
        List<Admin> list = new ArrayList<>();
        String sql = "SELECT * FROM QUAN_TRI";
        try{
           ps = Connect.getConnect().prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {
            Admin admin = new Admin();
            admin.setMaAdmin(rs.getString("Ma_Admin"));
            admin.setPassword(rs.getString("Password"));
            // Thêm admin vào danh sách
            list.add(admin);
        }
        }catch(Exception e){
            System.out.println(e);
        }
        return list;
    }
    public static void main(String[] args) {
        AdminData a = new AdminData();
        List<Admin> list = a.getAll();
         for (Admin admin : list) {
        System.out.println("MaAdmin: " + admin.getMaAdmin() + ", Password: " + admin.getPassword());
    }
    }
}
