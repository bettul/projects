package my_project;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DB {

    Connection conn;

    public void Dbaglanti() throws SQLException {
        conn = DriverManager.getConnection("jdbc:derby://localhost:1527/banka", "zeynep", "zeynep");

    }

    public void kullanıcıekle(String isim, String soyisim, int maas, String hesapno, String password) {

        try {
            Dbaglanti();

            String sorgu = "INSERT INTO KULLANICI VALUES  (?,?,?,?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sorgu);
            Statement st = conn.createStatement();
            pstmt.setInt(1, 2);
            pstmt.setString(2, isim);
            pstmt.setString(3, soyisim);
            pstmt.setString(4, hesapno);
            pstmt.setString(5, password);
            pstmt.setDate(6, null);
            pstmt.setInt(7, maas);
            st = conn.createStatement();
            pstmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void faturaekle(String ID) {

        try {
            Dbaglanti();
            String sorgu2 = "INSERT INTO FATURA VALUES (?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sorgu2);
            Statement st = null;
            pstmt.setString(1, ID);
            pstmt.setInt(2, 0);
            pstmt.setString(3, null);

            st = conn.createStatement();
            pstmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void karttalepekle(String ID, int gelir) {
        try {
            Dbaglanti();
            String sorgu2 = "INSERT INTO KARTTALEP VALUES (?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sorgu2);
            Statement st = null;
            pstmt.setString(1, ID);
            pstmt.setInt(2, gelir);
            pstmt.setString(3, null);

            st = conn.createStatement();
            pstmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void kreditalepekle(String ID,int miktar,int gelir ) {
        try {
            Dbaglanti();
            String sorgu2 = "INSERT INTO KREDIKARTTALEPLERI VALUES (?,?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sorgu2);
            Statement st = null;
            pstmt.setString(1, ID);
            pstmt.setInt(2, 0);
             pstmt.setInt(3, gelir);
          pstmt.setString(4, null);
          pstmt.setString(5, null);
            st = conn.createStatement();
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void limittalepekle(String ID,int gelir) {
        try {
            Dbaglanti();
            String sorgu2 = "INSERT INTO LIMITTALEPLERI VALUES (?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sorgu2);
            Statement st = null;
            pstmt.setString(1, ID);
            pstmt.setString(2, null);
            pstmt.setInt(3, gelir);

            st = conn.createStatement();
            pstmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void accountekle(String ID) {
        try {
            Dbaglanti();
            String sorgu2 = "INSERT INTO ACCOUNT VALUES (?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sorgu2);
            Statement st = null;
            pstmt.setString(1, ID);
            pstmt.setInt(2,0);
            st = conn.createStatement();
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean kontrol_kullanici(String Kullanici, String sifre) {

        try {
            Dbaglanti();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT PASSWORD FROM KULLANICI WHERE HESAPno = '" + Kullanici + "'");
            if (rs.next()) {
                return sifre.equals(rs.getString(1));
            }
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, "Hata: " + s.toString());
        }
        return false;
    }

    public int kontrol_yetki(String Kullanici) {
        int yetki = 0;
        try {
            Dbaglanti();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT Position FROM KULLANICI WHERE HESAPNO = '" + Kullanici + "'");
            if (rs.next()) {
                yetki = rs.getInt(1);
            }
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, "Hata: " + s.toString());
        }

        return yetki;
    }

}
