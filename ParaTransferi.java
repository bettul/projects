
package my_project;
import javax.swing.JOptionPane;
import static my_project.login.kullanıcı;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.*;
import static my_project.login.kullanıcı;
/**
 *
 * @author ZEYNEP
 */
public class ParaTransferi extends javax.swing.JFrame {

   
    public ParaTransferi() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AlıcıHesap = new javax.swing.JTextField();
        ParaMiktarı = new javax.swing.JTextField();
        Onayla = new javax.swing.JButton();
        Anasayfa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AlıcıHesap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlıcıHesapActionPerformed(evt);
            }
        });

        ParaMiktarı.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParaMiktarıActionPerformed(evt);
            }
        });

        Onayla.setText("Onayla");
        Onayla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnaylaActionPerformed(evt);
            }
        });

        Anasayfa.setText("Anasayfa");
        Anasayfa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnasayfaActionPerformed(evt);
            }
        });

        jLabel1.setText("Miktarı Giriniz");

        jLabel2.setText("Para göndereceğiniz hesap numarasını giriniz");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(67, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(326, 326, 326))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Anasayfa, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(127, 127, 127)
                                .addComponent(Onayla, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ParaMiktarı)
                            .addComponent(AlıcıHesap, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))))
                .addGap(110, 110, 110))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AlıcıHesap, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ParaMiktarı, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Onayla, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Anasayfa, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AlıcıHesapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlıcıHesapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlıcıHesapActionPerformed

    private void ParaMiktarıActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParaMiktarıActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ParaMiktarıActionPerformed

    private void AnasayfaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnasayfaActionPerformed
      this.toBack();
        setVisible(false);
        new IslemMenusu().toFront();
        new IslemMenusu().setState(java.awt.Frame.NORMAL);
    }//GEN-LAST:event_AnasayfaActionPerformed

    private void OnaylaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnaylaActionPerformed
Kullanıcı musteri=new Musteri();
int bakiye=0,bakiye2=0;
         String Smiktar=ParaMiktarı.getText();
        int miktar=Integer.parseInt(Smiktar);
       String alıcıhesap=AlıcıHesap.getText();

      bakiye=musteri.bakiyeget(alıcıhesap);
    bakiye2 =kullanıcı.bakiyeget(kullanıcı.hesapNo);
    kullanıcı.paracek(kullanıcı.hesapNo, miktar,  bakiye2);
       musteri.parayatırma(alıcıhesap, miktar, bakiye);
          JOptionPane.showMessageDialog(null,"Para transferi gerçekleştirildi,", "Succes", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_OnaylaActionPerformed

    
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
            java.util.logging.Logger.getLogger(ParaTransferi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParaTransferi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParaTransferi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParaTransferi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParaTransferi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AlıcıHesap;
    private javax.swing.JButton Anasayfa;
    private javax.swing.JButton Onayla;
    private javax.swing.JTextField ParaMiktarı;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
