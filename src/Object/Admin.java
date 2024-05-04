/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Object;

/**
 *
 * @author Admin
 */
public class Admin {
    private String maAdmin;
    private String password;
    
    public Admin() {
        
    }
    public Admin(String maAdmin, String password) {
        this.maAdmin = maAdmin;
        this.password = password;
    }
    
    public String getMaAdmin() {
        return maAdmin;
    }
    public void setMaAdmin(String maAdmin) {
        this.maAdmin = maAdmin;
    }
    
    public String getPassword() {
        return password;
    }
    public void setPassword(String pass) {
        this.password = pass;
    }
}
