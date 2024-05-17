/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Object;

import java.sql.Date;

/**
 *
 * @author Admin
 */
public class PhieuMuon {
    private String maMuon;
    private String maKhach;
    private String maSach;
    private Date ngayMuon;
    private Date hanTra;
    private int tienCoc;
    public PhieuMuon() {
        
    }
    
    public PhieuMuon(String maMuon, String maKhach, String maSach, Date ngayMuon, Date hanTra, int tienCoc) {
        this.maMuon = maMuon;
        this.maKhach = maKhach;
        this.maSach = maSach;
        this.ngayMuon = ngayMuon;
        this.hanTra = hanTra;
        this.tienCoc = tienCoc;
    }
    
    public String getMaMuon() {
        return maMuon;
    }
    public void setMaMuon(String mm) {
        this.maMuon = mm;
    }
    
    public String getMaKhach() {
        return maKhach;
    }
    public void setMaKhach(String mm) {
        this.maKhach = mm;
    }
    
    public String getSach() {
        return maSach;
    }
    public void setMaSach(String mm) {
        this.maSach = mm;
    }
    
    public Date getNgayMuon() {
        return ngayMuon;
    }
    public void setNgayMuon(Date nm) {
        this.ngayMuon = nm;
    }
    public Date getHanTra() {
        return hanTra;
    }
    public void setHanTra(Date ht) {
        this.hanTra = ht;
    }
      public int getTienCoc() {
        return tienCoc;
    }
    public void setTienCoc(int tc) {
        this.tienCoc = tc;
    }
    
}
