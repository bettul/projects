
package my_project;

/**
 *
 * @author ZEYNEP
 */
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.*;
import static my_project.login.kullanıcı;

public class SifreDegistir extends javax.swing.JFrame  {
 private void systemExit(){
      new login() ;
        WindowEvent winCloseing = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
         
    }
    
    public SifreDegistir() {
        initComponents();
    }

    public void close(){
    
    WindowEvent winClosingEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MevcutSifre = new javax.swing.JPasswordField();
        YeniSifre = new javax.swing.JPasswordField();
        YeniSifreTekrar = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Onay = new javax.swing.JButton();
        Anasayfa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MevcutSifre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MevcutSifreActionPerformed(evt);
            }
        });

        YeniSifre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YeniSifreActionPerformed(evt);
            }
        });

        YeniSifreTekrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YeniSifreTekrarActionPerformed(evt);
            }
        });

        jLabel1.setText("Mevcut Sifreniz");

        jLabel2.setText("Yeni Sifreniz");

        jLabel3.setText("Yeni Sifre Tekrar");

        Onay.setText("Onayla");
        Onay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnayActionPerformed(evt);
            }
        });

        Anasayfa.setText("Anasayfa");
        Anasayfa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnasayfaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(YeniSifre)
                    .addComponent(MevcutSifre)
                    .addComponent(YeniSifreTekrar, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(Anasayfa, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                .addComponent(Onay, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(MevcutSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(YeniSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(YeniSifreTekrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Onay, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Anasayfa, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MevcutSifreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MevcutSifreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MevcutSifreActionPerformed

    private void YeniSifreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YeniSifreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YeniSifreActionPerformed

    private void YeniSifreTekrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YeniSifreTekrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YeniSifreTekrarActionPerformed

    private void OnayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnayActionPerformed
        String password = MevcutSifre.getText();
        String password2=YeniSifre.getText();
        String password3=YeniSifreTekrar.getText();
      
        if (!password.contains(kullanıcı.password) ){
         JOptionPane.showMessageDialog(null,"lutfen sifrenizi dogru giriniz","Login Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(!password2.equals(password3)){
            JOptionPane.showMessageDialog(null,"Sifre tekrarınız uyusmuyor","Login Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            kullanıcı.sifredegistir(password2);
             JOptionPane.showMessageDialog(null,"Sifreniz olusturuldu, lütfen tekrar giriş yapınız","Succes", JOptionPane.INFORMATION_MESSAGE);
  
         this.toBack();
         close();
        setVisible(false);
        new login().toFront();
        new login().setState(java.awt.Frame.NORMAL);}
        
    }//GEN-LAST:event_OnayActionPerformed

    private void AnasayfaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnasayfaActionPerformed
        this.toBack();
        setVisible(false);
        new IslemMenusu().toFront();
        new IslemMenusu().setState(java.awt.Frame.NORMAL);
    }//GEN-LAST:event_AnasayfaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SifreDegistir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SifreDegistir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SifreDegistir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SifreDegistir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SifreDegistir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Anasayfa;
    private javax.swing.JPasswordField MevcutSifre;
    private javax.swing.JButton Onay;
    private javax.swing.JPasswordField YeniSifre;
    private javax.swing.JPasswordField YeniSifreTekrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
