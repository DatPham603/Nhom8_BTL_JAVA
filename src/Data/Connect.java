/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Admin
 */
public class Connect {
     private  static Connection con;
        public static Connection getConnect(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QuanLyThuVien;user=sa;password=123;encrypt=false");
            System.out.println("Ket noi co so du lieu thanh cong!");
        } catch (SQLException e) {
            System.out.println("Ket noi khong thanh cong"+e);
        } catch (ClassNotFoundException e) {
        System.out.println("Khong tim thay driver: " + e);
        }
        return con;
    }
}
