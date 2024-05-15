/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;
import Object.PhieuMuon;
import Object.Sach;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class PhieuMuonData {
    public static PreparedStatement ps;
    public static ResultSet rs;
    
    public static ResultSet showTextfield(String sql) {
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            return ps.executeQuery();
        } catch (Exception e) {
            return null;
        }
    }
     public static void InsertPhieu(PhieuMuon p) {
        String sql = "insert into PHIEU_MUON values(?,?,?,?,?,null,?)";
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            ps.setString(1, p.getMaMuon());
            ps.setString(2, p.getMaKhach());
            ps.setString(3, p.getSach());
            ps.setDate(4, p.getNgayMuon());
            ps.setDate(5, p.getHanTra());
            ps.setInt(6, p.getTienCoc());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Đã thêm phiếu thành công!" , "Thông báo", 1);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "phiếu không được thêm" , "Thông báo", 1);
            System.out.println(e);
        }
    }
    
    public boolean UpdatePhieu(PhieuMuon p) {
        try {
            ps = Connect.getConnect().prepareStatement("UPDATE PHIEU_MUON SET  Ma_Khach_hang = ?, Ma_Sach = ?,"
                    + "Ngay_muon = ?, Han_tra = ?, TienDatCoc = ? where Ma_Phieu_muon = ?");
            ps.setString(6, p.getMaMuon());
            ps.setString(1, p.getMaKhach());
            ps.setString(2, p.getSach());
            ps.setDate(3, p.getNgayMuon());
            ps.setDate(4, p.getHanTra());
            ps.setInt(5, p.getTienCoc());   

            
            return ps.executeUpdate() >0;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean DeletePhieu(String ms) {
        try {
            ps = Connect.getConnect().prepareStatement("DELETE FROM PHIEU_MUON WHERE Ma_Phieu_muon = ?");
            ps.setString(1, ms);
            return ps.executeUpdate() >0;
        } catch(Exception e) {
            return false;
        }
}
}
