package my_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 *
 * @author ZEYNEP
 */
public abstract class Kullanıcı implements yetkiI {

    Connection conn;
    String isim, soyisim;
    boolean yetki;
    int gelir;
    String hesapNo, password;
    int kbakiye;

    public void baglanti() throws SQLException {
        conn = DriverManager.getConnection("jdbc:derby://localhost:1527/banka", "zeynep", "zeynep");

    }

    public void paraTransferi(String alıcı, String gonderen, int miktar, int bakiye) {

    }

    public int bakiyeget(String ID) {
        int bakiye = 0;

        try {
            baglanti();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT Bakiye FROM ACCOUNT WHERE HESAPID = '" + ID + "'");
            if (rs.next()) {
                bakiye = rs.getInt(1);

            }

        } catch (SQLException ex) {
            Logger.getLogger(Kullanıcı.class.getName()).log(Level.SEVERE, null, ex);
        }

        return bakiye;
    }

    public void sifredegistir(String Password) {
        try {
            baglanti();
            Statement st = conn.createStatement();

            String sql = "UPDATE  zeynep.Kullanıcı  SET password='" + Password + "' WHERE password ='" + password + "'";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Kullanıcı.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void parayatırma(String ID, int miktar, int bakiye) {
        try {
            baglanti();
            Statement st = conn.createStatement();
            bakiye = bakiye + miktar;
            String sql = "UPDATE  ZEYNEP.ACCOUNT  SET BAKIYE=" + bakiye + "WHERE HESAPID ='" + ID + "'";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Kullanıcı.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void paracek(String ID, int miktar, int bakiye) {

        try {
            baglanti();
            Statement st = conn.createStatement();
            bakiye = bakiye - miktar;
            String sql = "UPDATE  ZEYNEP.ACCOUNT  SET BAKIYE=" + bakiye + "WHERE HESAPID ='" + ID + "'";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Kullanıcı.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void kartbasvuruolustur(String ID) {

    }

    public void kredibasvurusuolustur(String ID) {

    }

    public void limitiste(String ID) {

    }

    public void faturaode(String ID) {
        boolean bool = true;
        try {
            baglanti();
            Statement st = conn.createStatement();

            String sql = "UPDATE  fatura  SET durum ='" + "odendi" + "' WHERE HESAPID ='" + ID + "'";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Kullanıcı.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
