/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_project;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import my_project.IslemMenusu;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import my_project.Musteri;
import my_project.Kullanıcı;
import java.awt.event.*;
import java.awt.*;
import java.util.Random;
import static my_project.login.user;
import static my_project.login.kullanıcı;
import static my_project.login.var;
/**
 *
 * @author ZEYNEP
 */
class IslemMenusu extends javax.swing.JFrame {

   int yetki; 

    public IslemMenusu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        sifredegistir = new javax.swing.JButton();
        bakiyegoruntule = new javax.swing.JButton();
        paracek = new javax.swing.JButton();
        parayatır = new javax.swing.JButton();
        paratransferi = new javax.swing.JButton();
        faturaodeme = new javax.swing.JButton();
        limitguncelle = new javax.swing.JButton();
        Kartonay = new javax.swing.JButton();
        kredionay = new javax.swing.JButton();
        limitonay = new javax.swing.JButton();
        kartbasvuru = new javax.swing.JButton();
        kredibasvuru = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        sifredegistir.setText("ŞifreDegistir");
        sifredegistir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifredegistirActionPerformed(evt);
            }
        });

        bakiyegoruntule.setText("BakiyeGörüntüle");
        bakiyegoruntule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bakiyegoruntuleActionPerformed(evt);
            }
        });

        paracek.setText("ParaCek");
        paracek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paracekActionPerformed(evt);
            }
        });

        parayatır.setText("ParaYatır");
        parayatır.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parayatırActionPerformed(evt);
            }
        });

        paratransferi.setText("ParaTransferi");
        paratransferi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paratransferiActionPerformed(evt);
            }
        });

        faturaodeme.setText("FaturaOdeme");
        faturaodeme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faturaodemeActionPerformed(evt);
            }
        });

        limitguncelle.setText("Limit Güncelleme");
        limitguncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limitguncelleActionPerformed(evt);
            }
        });

        Kartonay.setText("Kredi Kart Onayı");
        Kartonay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KartonayActionPerformed(evt);
            }
        });

        kredionay.setText("Kredi Onayı Verme");
        kredionay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kredionayActionPerformed(evt);
            }
        });

        limitonay.setText("Limit Güncelleme Onayı");
        limitonay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limitonayActionPerformed(evt);
            }
        });

        kartbasvuru.setText("Kredi Kart Başvuru");
        kartbasvuru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kartbasvuruActionPerformed(evt);
            }
        });

        kredibasvuru.setText("Kredi Başvuru");
        kredibasvuru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kredibasvuruActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(sifredegistir, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                .addComponent(parayatır, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                .addComponent(limitguncelle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(limitonay, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(paratransferi, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bakiyegoruntule, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kartbasvuru, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Kartonay, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(paracek, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(faturaodeme, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(kredibasvuru, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(kredionay, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)))))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sifredegistir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bakiyegoruntule, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paracek, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(parayatır, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paratransferi, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faturaodeme, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kredibasvuru, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(kartbasvuru, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                        .addComponent(limitguncelle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Kartonay, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kredionay, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limitonay, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(120, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

       public void close(){
    
    WindowEvent winClosingEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
       //tamamlandı
    private void sifredegistirActionPerformed(java.awt.event.ActionEvent evt) {                                              
        this.toBack();
        SifreDegistir sd=new SifreDegistir();
        sd.setVisible(true);
        sd.toFront();
    }                                             
//tamamlandı
    private void bakiyegoruntuleActionPerformed(java.awt.event.ActionEvent evt) {                                                
      
       kullanıcı.kbakiye=kullanıcı.bakiyeget(kullanıcı.hesapNo);
           JOptionPane.showMessageDialog(null,"Bakiyeniz: "+kullanıcı.kbakiye," Succes", JOptionPane.INFORMATION_MESSAGE);
    }                                               
//tamamlandı
    private void paracekActionPerformed(java.awt.event.ActionEvent evt) {                                        
this.toBack();
       ParaCek cek=new ParaCek();
        cek.setVisible(true);
        cek.toFront();
    }                                       
//tamamlandı
    private void parayatırActionPerformed(java.awt.event.ActionEvent evt) {                                          
this.toBack();
      ParaYatır yatir=new ParaYatır();
        yatir.setVisible(true);
        yatir.toFront();
    }                                         
//tamamlandı
    private void paratransferiActionPerformed(java.awt.event.ActionEvent evt) {                                              
this.toBack();
       ParaTransferi transfer=new ParaTransferi();
     transfer.setVisible(true);
        transfer.toFront();
    }                                             
//ekrana metin olarak faturaları yazdırmak kaldı fonksiyon çalışıyor
    private void faturaodemeActionPerformed(java.awt.event.ActionEvent evt) {           
        
    this.toBack();
      FaturaOdeme fatura=new FaturaOdeme();
       fatura.setVisible(true);
        fatura.toFront();
    }                                           

    private void kartbasvuruActionPerformed(java.awt.event.ActionEvent evt) {                                            
     this.toBack();
       kredikartbasvurusu d=new kredikartbasvurusu();
        d.setVisible(true);
        d.toFront();
    }                                           

    private void limitguncelleActionPerformed(java.awt.event.ActionEvent evt) {                                              
this.toBack();
       limitguncelleme  lg=new limitguncelleme();
        lg.setVisible(true);
        lg.toFront();
    }                                             

    private void kredibasvuruActionPerformed(java.awt.event.ActionEvent evt) {                                             
    this.toBack();
       kredibasvurusu  kb=new kredibasvurusu();
        kb.setVisible(true);
        kb.toFront();
    }                                            

    private void limitonayActionPerformed(java.awt.event.ActionEvent evt) {                                          
              DB db=new DB();
        try {
            db.Dbaglanti();
        } catch (SQLException ex) {
            Logger.getLogger(IslemMenusu.class.getName()).log(Level.SEVERE, null, ex);
        }
        login log=new login();
   
   
        yetki=db.kontrol_yetki(user);
        if(yetki==2){
            JOptionPane.showMessageDialog(null,"Yetkiniz yok"," Error", JOptionPane.ERROR_MESSAGE);
        }
   
        else {
           
        this.toBack();
       limitonayi sd=new limitonayi();
        sd.setVisible(true);
        sd.toFront();
        }
    
    }                                         

    private void KartonayActionPerformed(java.awt.event.ActionEvent evt) {                                         
          DB db=new DB();
        try {
            db.Dbaglanti();
        } catch (SQLException ex) {
            Logger.getLogger(IslemMenusu.class.getName()).log(Level.SEVERE, null, ex);
        }
        login log=new login();
 
   
        
        if(!kullanıcı.yetki){
            JOptionPane.showMessageDialog(null,"Yetkiniz yok"," Error", JOptionPane.ERROR_MESSAGE);
        }
   
        else {
           
        this.toBack();
       Kredikartonayi sd=new Kredikartonayi();
        sd.setVisible(true);
        sd.toFront();
        }
    }                                        

    private void kredionayActionPerformed(java.awt.event.ActionEvent evt) {                                          
     DB db=new DB();
        try {
            db.Dbaglanti();
        } catch (SQLException ex) {
            Logger.getLogger(IslemMenusu.class.getName()).log(Level.SEVERE, null, ex);
        }
        login log=new login();
  
   
        yetki=db.kontrol_yetki(user);
        if(yetki==2){
            JOptionPane.showMessageDialog(null,"Yetkiniz yok"," Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(yetki==3){
          JOptionPane.showMessageDialog(null,"Yetkiniz yok"," Error", JOptionPane.ERROR_MESSAGE);
        }
        else {
           
        this.toBack();
       kredionayi sd=new kredionayi();
        sd.setVisible(true);
        sd.toFront();
        }
        
        
    }private javax.swing.JButton Kartonay;
    private javax.swing.JButton bakiyegoruntule;
    private javax.swing.JButton faturaodeme;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton kartbasvuru;
    private javax.swing.JButton kredibasvuru;
    private javax.swing.JButton kredionay;
    private javax.swing.JButton limitguncelle;
    private javax.swing.JButton limitonay;
    private javax.swing.JButton paracek;
    private javax.swing.JButton paratransferi;
    private javax.swing.JButton parayatır;
    private javax.swing.JButton sifredegistir;                 
}


 class Kredikartonayi extends javax.swing.JFrame {

    
    public Kredikartonayi() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        basvurular = new javax.swing.JTextField();
        hesapnogir = new javax.swing.JTextField();
        Onayla = new javax.swing.JButton();
        Reddet = new javax.swing.JButton();
        Anasayfa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        basvurular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basvurularActionPerformed(evt);
            }
        });

        hesapnogir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hesapnogirActionPerformed(evt);
            }
        });

        Onayla.setText("Onayla");
        Onayla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnaylaActionPerformed(evt);
            }
        });

        Reddet.setText("Reddet");
        Reddet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReddetActionPerformed(evt);
            }
        });

        Anasayfa.setText("Anasayfa");
        Anasayfa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnasayfaActionPerformed(evt);
            }
        });

        jLabel1.setText("İslem yapacaginiz kisinin hesap numarası:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(188, 188, 188)
                            .addComponent(basvurular, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(56, 56, 56)
                            .addComponent(Anasayfa, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(hesapnogir, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Onayla)))))
                .addGap(53, 53, 53)
                .addComponent(Reddet)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(basvurular, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hesapnogir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Onayla)
                    .addComponent(Reddet))
                .addGap(37, 37, 37)
                .addComponent(Anasayfa, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>                        

    private void basvurularActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void hesapnogirActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void ReddetActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void OnaylaActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void AnasayfaActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
          this.toBack();
        setVisible(false);
        new IslemMenusu().toFront();
        new IslemMenusu().setState(java.awt.Frame.NORMAL);
    }                                        

    

    // Variables declaration - do not modify                     
    private javax.swing.JButton Anasayfa;
    private javax.swing.JButton Onayla;
    private javax.swing.JButton Reddet;
    private javax.swing.JTextField basvurular;
    private javax.swing.JTextField hesapnogir;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration                   
}



/**
 *
 * @author ZEYNEP
 */
class kredibasvurusu extends javax.swing.JFrame {

    public kredibasvurusu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Miktar = new javax.swing.JTextField();
        basvur = new javax.swing.JButton();
        Anasayfa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Miktar giriniz");

        Miktar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiktarActionPerformed(evt);
            }
        });

        basvur.setText("Basvur");
        basvur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basvurActionPerformed(evt);
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
                .addGap(78, 78, 78)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(Miktar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(Anasayfa, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(basvur, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Miktar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(basvur, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Anasayfa, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void AnasayfaActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
          this.toBack();
        setVisible(false);
        new IslemMenusu().toFront();
        new IslemMenusu().setState(java.awt.Frame.NORMAL);
    }                                        

    private void basvurActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void MiktarActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

   

    // Variables declaration - do not modify                     
    private javax.swing.JButton Anasayfa;
    private javax.swing.JTextField Miktar;
    private javax.swing.JButton basvur;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration                   
}
//LOGIN
 class login extends javax.swing.JFrame {
     public static int var=1201;
         Random r =new Random();
     int a=r.nextInt(900);
         
     
int yetki;
public static Kullanıcı kullanıcı;
public static String user;

 
    public login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JButton();
        Hesapolustur = new javax.swing.JButton();
        UserName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 51));
        setBounds(new java.awt.Rectangle(10, 10, 20, 20));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.pink);
        setIconImages(null);

        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        Hesapolustur.setText("Hesap Olustur");
        Hesapolustur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HesapolusturActionPerformed(evt);
            }
        });

        UserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameActionPerformed(evt);
            }
        });

        jLabel1.setText("Hesap Numaranız:");

        jLabel2.setText("  Sifre");

        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Hesapolustur, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(153, 153, 153)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(UserName, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)))
                .addGap(108, 108, 108))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(Password))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Hesapolustur, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public void close(){
    
    WindowEvent winClosingEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    
    private void UserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameActionPerformed

    private void HesapolusturActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HesapolusturActionPerformed
   this.toBack();
  HesapOlustur hesap=new HesapOlustur();
       hesap.setVisible(true);
        hesap.toFront();
    }//GEN-LAST:event_HesapolusturActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
   var=var+a;

   
      String password = Password.getText();
        String username = UserName.getText();
      
      DB db=new DB();
 
      boolean ctrl=db.kontrol_kullanici(username, password);
      yetki=db.kontrol_yetki(username);
  
    {  if (yetki==2){
      kullanıcı=new Musteri();
      kullanıcı.yetki_ver();
      }
      else if(yetki==3){
      kullanıcı=new Calisan();
      kullanıcı.yetki_ver();
      }
      else{
     kullanıcı= new Yonetici();
     kullanıcı.yetki_ver();
      }
    } kullanıcı.hesapNo=username;
    kullanıcı.password=password;
      if (ctrl){
           UserName.setText(null);
           Password.setText(null);
          
          systemExit();
           this.toBack();
               close();
            IslemMenusu Info = new IslemMenusu();
             Info.setVisible(true); 
            Info.toFront();
             
        }
        else{
            JOptionPane.showMessageDialog(null,"Invalid Login Details","Login Error", JOptionPane.ERROR_MESSAGE);
           Password.setText(null);
            UserName.setText(null);

        }
       
    }//GEN-LAST:event_loginActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Hesapolustur;
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField UserName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton login;
    // End of variables declaration//GEN-END:variables

   private void systemExit(){
      new login() ;
        WindowEvent winCloseing = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
         
    }
}
