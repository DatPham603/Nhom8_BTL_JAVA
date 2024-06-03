/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;
import Object.Admin;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class AdminData {
    public static PreparedStatement ps;
    public static ResultSet rs;
    public Admin dangNhap(String maAdmin , String password ){
          Admin ad = null;
          try{
            ps = Connect.getConnect().prepareStatement("SELECT * FROM QUAN_TRI where Ma_Admin = ? and Password=?");
            ps.setString(1, maAdmin);
            ps.setString(2, password);
            rs = ps.executeQuery();
            while(rs.next()) {
                ad = new Admin();
            }
        }
        catch(Exception e) {
            return ad = null;
        }
        return ad;
    }
    public static ResultSet showTextfield(String sql) {
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            return ps.executeQuery();
        } catch (Exception e) {
            return null;
        }
        
    }
    public boolean UpdateAdmin(Admin ad) {
        try {
            ps = Connect.getConnect().prepareStatement("UPDATE QUAN_TRI SET Password = ? where Ma_Admin = ?");
            ps.setString(2, ad.getMaAdmin());
            ps.setString(1, ad.getPassword());
            return ps.executeUpdate() >0;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean DeleteAdmin(String maAd) {
        try {
            ps = Connect.getConnect().prepareStatement("DELETE FROM QUAN_TRI WHERE Ma_Admin = ?");
            ps.setString(1, maAd);
            return ps.executeUpdate() >0;
        } catch(Exception e) {
            return false;
        }
    }
}
