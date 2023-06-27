import java.sql.*;
import javax.swing.JOptionPane;
import com.mysql.jdbc.Driver;
import java.util.ArrayList;
import java.util.Vector;



public class signup extends javax.swing.JFrame {
    
    Connection con= null;
    PreparedStatement st;
    ResultSet rs;
    ResultSetMetaData stData;
    int q;
    
  
    public signup() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        m_tc = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        m_ad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        m_soyad = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        m_telefon = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        m_kullaniciadi = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        m_parola = new javax.swing.JTextField();
        m_KAYITOL = new javax.swing.JButton();
        m_GİRİŞ2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(332, 515));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("KAYIT OL");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel2.setText("TC:");

        m_tc.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        m_tc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_tcActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel8.setText("AD:");

        m_ad.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel9.setText("SOYAD:");

        m_soyad.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel10.setText("TELEFON:");

        m_telefon.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel11.setText("KULLANICI ADI:");

        m_kullaniciadi.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel12.setText("ŞİFRE:");

        m_parola.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        m_parola.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        m_KAYITOL.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        m_KAYITOL.setText("KAYIT OL");
        m_KAYITOL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_KAYITOLActionPerformed(evt);
            }
        });

        m_GİRİŞ2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        m_GİRİŞ2.setText("GİRİŞ YAP");
        m_GİRİŞ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_GİRİŞ2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(m_parola, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(m_tc, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(m_ad, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(m_soyad, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(m_telefon, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(m_kullaniciadi, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(m_GİRİŞ2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(m_KAYITOL, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(m_tc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(m_ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(m_soyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(m_telefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(m_kullaniciadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(m_parola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m_KAYITOL, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m_GİRİŞ2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void m_KAYITOLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_KAYITOLActionPerformed
        // TODO add your handling code here:
        // KAYIT OL BUTONUNA BASINCA;
        

        
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost/homework", "root", "");
            st=con.prepareStatement("select TC, KULLANICIADI from kayitol");
            rs=st.executeQuery();
            ArrayList<String>TCkayitlar = new ArrayList<String>(); // ARRAYLİSTLERE VERİ TABANINDAKİ VERİLERİ ÇEKİLİYOR
            ArrayList<String>KULLANICIADIkayitlar = new ArrayList<String>();
            while(rs.next()){
                TCkayitlar.add(rs.getString("TC"));
                KULLANICIADIkayitlar.add(rs.getString("KULLANICIADI"));
            }
            
            if(TCkayitlar.contains(m_tc.getText())){
                JOptionPane.showMessageDialog(null, "LÜTFEN TC KİMLİK NUMARANIZI KONTROL EDİNİZ...");
               
            }
            else if(KULLANICIADIkayitlar.contains(m_kullaniciadi.getText())){
                JOptionPane.showMessageDialog(null, "BU KULLANICI ADI KULLANILMAKTADIR....");
            }
            else{
                try{
                    String sql="insert into kayitol (TC, AD, SOYAD, TELEFON, KULLANICIADI, PAROLA) values (?,?,?,?,?,?)";
                    st=con.prepareStatement(sql);
                    st.setString(1, m_tc.getText());
                    st.setString(2,m_ad.getText());
                    st.setString(3, m_soyad.getText());
                    st.setString(4, m_telefon.getText());
                    st.setString(5, m_kullaniciadi.getText());
                    st.setString(6, m_parola.getText());
                    st.execute();
                    JOptionPane.showMessageDialog(null, "EKLEME BAŞARILI");
                   super.dispose();
                    new login().setVisible(true);
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    
    }//GEN-LAST:event_m_KAYITOLActionPerformed

    private void m_GİRİŞ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_GİRİŞ2ActionPerformed
        // TODO add your handling code here:
        super.dispose(); // GİRİŞ YAP BUTONUNA BASINCA KAYIT SAYFASINI KAPATIYOR VE GİRİŞ YAP SAYFASINI AÇIYOR
        new login().setVisible(true);
    }//GEN-LAST:event_m_GİRİŞ2ActionPerformed

    private void m_tcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_tcActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_m_tcActionPerformed

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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton m_GİRİŞ2;
    private javax.swing.JButton m_KAYITOL;
    private javax.swing.JTextField m_ad;
    private javax.swing.JTextField m_kullaniciadi;
    private javax.swing.JTextField m_parola;
    private javax.swing.JTextField m_soyad;
    private javax.swing.JTextField m_tc;
    private javax.swing.JTextField m_telefon;
    // End of variables declaration//GEN-END:variables
}
