/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Object;

/**
 *
 * @author Admin
 */
public class NhaXb {
    
    private String maNXB;
    private String tenNXB;
    
    public NhaXb() {
        
    }
    
    public NhaXb(String maNXB, String tenNXB) {
        this.maNXB = maNXB;
        this.tenNXB = tenNXB;
    }
    
    public String getMaNXB() {
        return maNXB;
    }
    public void setMaNXB(String m) {
        this.maNXB = m;
    }
    
    public String getTenNXB() {
        return tenNXB;
    }
    public void setTenNXB(String t) {
        this.tenNXB = t;
    }
    
}
