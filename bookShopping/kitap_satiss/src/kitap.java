/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author gokha
 */

import java.awt.*;
import static java.awt.SystemColor.window;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import static java.util.GregorianCalendar.AD;
import java.util.Random;
import java.util.Set;
import javax.swing.*;
import javax.swing.JOptionPane;




public class kitap extends javax.swing.JFrame {
    Connection con= null;
    PreparedStatement st;
    ResultSet rs;
    ResultSetMetaData stData;
    int q;
    
   
    public kitap(){
        initComponents();         
    }
    
         
    public kitap(String kullanıcıadı, String ad, String soyad){
        initComponents();
        String KULLANICIADI=(kullanıcıadı);
        String AD=ad;
        String SOYAD =soyad;  
        m_ADSOYAD.setText(AD+" "+SOYAD);
        String bas = (AD.substring(0, 1))+(SOYAD.substring(0,1));
        m_BAŞHARFLER.setText(bas);
        
        

        m_sepettençıkar1.setEnabled(false);
        m_sepettençıkar2.setEnabled(false);
        m_sepettençıkar3.setEnabled(false);
        m_sepettençıkar4.setEnabled(false);
        
       
        
        // çalışmaya başlarken veri tabanındaki counter sütununa 0 atıyoruz.
        int defaultCounterDeğer;
        defaultCounterDeğer = new kitp().counteraDeğerAtama();

        // çalışmaya başlarken default counter değerini adet bölümlerine tanımlıyorum.
        m_adet1.setText(Integer.toString(defaultCounterDeğer));
        m_adet2.setText(Integer.toString(defaultCounterDeğer));
        m_adet3.setText(Integer.toString(defaultCounterDeğer));
        m_adet4.setText(Integer.toString(defaultCounterDeğer));


            
             

              
        Random randomNumberForAnasayfa = new Random();
        ArrayList <Integer> dizi = new ArrayList<Integer>();
        ArrayList <String> kitapadi = new ArrayList<String>();
        ArrayList <String> fiyat = new ArrayList<String>();
        ArrayList<ImageIcon> resimler = new ArrayList<ImageIcon>();
        
        dizi.add(0);
        int j=0;
        while (j<4){
            int üretilenRandomSayı = randomNumberForAnasayfa.nextInt(12-5+1)+5; 
            if(dizi.contains(üretilenRandomSayı)){
                
            }
            else{
                j++;
               dizi.add(üretilenRandomSayı);
            }
        }     
        dizi.remove(0);
         
        try{
            for(int i=0;i<4;i++){
                con=DriverManager.getConnection("jdbc:mysql://localhost/homework", "root", "");
                        st=con.prepareStatement("select * from resim where ID = ?");
                        st.setInt(1, dizi.get(i));
                        st.execute();
                        rs=st.executeQuery();
                if(i == 0){
                    try{
                        
                        if(rs.next()){
                            m_kitapadi1.setText(rs.getString("kitapadi"));
                            String fiyats;                          
                            fiyats=rs.getString("fiyat");
                            m_kitapfiyati1.setText(fiyats + " ₺"); 
                            byte[] resim=rs.getBytes("resim2");
                            ImageIcon icon = new ImageIcon(resim);
                            m_resim1.setIcon(icon);
                            //resim var unutma
                        }
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null, i);
                    }
                }
                else if(i==1){
                    try{
                        
                        if(rs.next()){
                            m_kitapadi2.setText(rs.getString("kitapadi"));
                            String fiyats;                          
                            fiyats=rs.getString("fiyat");
                            m_kitapfiyati2.setText(fiyats + " ₺");
                            byte[] resim=rs.getBytes("resim2");
                            ImageIcon icon = new ImageIcon(resim);
                            m_resim2.setIcon(icon);
                        }
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null, i);
                    }
                }
                else if(i==2){
                    try{
                      
                        if(rs.next()){
                            m_kitapadi3.setText(rs.getString("kitapadi"));
                            String fiyats;                          
                            fiyats=rs.getString("fiyat");
                            m_kitapfiyati3.setText(fiyats + " ₺");
                            byte[] resim=rs.getBytes("resim2");
                            ImageIcon icon = new ImageIcon(resim);
                            m_resim4.setIcon(icon);
                        }
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null, i);
                    }
                }
                else if(i==3){
                    try{
                        
                        if(rs.next()){
                            m_kitapadi4.setText(rs.getString("kitapadi"));
                            String fiyats;                          
                            fiyats=rs.getString("fiyat");
                            m_kitapfiyati4.setText(fiyats + " ₺");
                            byte[] resim=rs.getBytes("resim2");
                            ImageIcon icon = new ImageIcon(resim);
                            m_resim5.setIcon(icon);
                        }
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null, i);
                    }
                }                
            }  
        }// try
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
         
             
    }
         
        
         
         
    
    
     
    /**
     * Creates new form kitap
     */
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        m_BAŞHARFLER = new javax.swing.JLabel();
        m_ADSOYAD = new javax.swing.JLabel();
        m_SİPARİŞDURUMUM = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        m_tutar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        m_HOMEPAGE = new javax.swing.JButton();
        m_YAZAR2 = new javax.swing.JButton();
        m_YAZAR1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        m_ÇIKIŞ = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        m_kitapadi2 = new javax.swing.JLabel();
        m_kitapfiyati2 = new javax.swing.JLabel();
        m_sepeteekle2 = new javax.swing.JButton();
        m_sepettençıkar2 = new javax.swing.JButton();
        m_resim2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        m_adet2 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        m_kitapadi1 = new javax.swing.JLabel();
        m_kitapfiyati1 = new javax.swing.JLabel();
        m_sepeteekle1 = new javax.swing.JButton();
        m_sepettençıkar1 = new javax.swing.JButton();
        m_resim1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        m_adet1 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        m_kitapadi3 = new javax.swing.JLabel();
        m_kitapfiyati3 = new javax.swing.JLabel();
        m_sepeteeklee = new javax.swing.JButton();
        m_sepettençıkar3 = new javax.swing.JButton();
        m_resim4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        m_adet3 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        m_kitapadi4 = new javax.swing.JLabel();
        m_kitapfiyati4 = new javax.swing.JLabel();
        m_sepeteekle4 = new javax.swing.JButton();
        m_sepettençıkar4 = new javax.swing.JButton();
        m_resim5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        m_adet4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 255));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(187, 200));

        m_BAŞHARFLER.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        m_BAŞHARFLER.setText("GG");

        m_ADSOYAD.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        m_ADSOYAD.setText("GÖKHAN GÜNEY");

        m_SİPARİŞDURUMUM.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        m_SİPARİŞDURUMUM.setText("ÖDEME SAYFASI");
        m_SİPARİŞDURUMUM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_SİPARİŞDURUMUMActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel14.setText("SİPARİŞ TUTARI:");

        m_tutar.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        m_tutar.setText("0");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel2.setText("₺");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(m_SİPARİŞDURUMUM, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(m_BAŞHARFLER))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addGap(18, 18, 18)
                                    .addComponent(m_tutar))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(m_ADSOYAD))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(m_BAŞHARFLER)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(m_ADSOYAD)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(m_tutar)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(m_SİPARİŞDURUMUM, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setPreferredSize(new java.awt.Dimension(187, 350));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel1.setText("YAZARLAR");

        m_HOMEPAGE.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        m_HOMEPAGE.setText("ANASAYFA");
        m_HOMEPAGE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_HOMEPAGEActionPerformed(evt);
            }
        });

        m_YAZAR2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        m_YAZAR2.setText("SABAHATTİN ALİ");
        m_YAZAR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_YAZAR2ActionPerformed(evt);
            }
        });

        m_YAZAR1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        m_YAZAR1.setText("AHMET HAMDİ TANPINAR");
        m_YAZAR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_YAZAR1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(m_HOMEPAGE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(m_YAZAR2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(m_YAZAR1, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(m_HOMEPAGE, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(m_YAZAR1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(m_YAZAR2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        m_ÇIKIŞ.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        m_ÇIKIŞ.setText("ÇIKIŞ");
        m_ÇIKIŞ.setToolTipText("");
        m_ÇIKIŞ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_ÇIKIŞActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(m_ÇIKIŞ, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(m_ÇIKIŞ, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        m_kitapadi2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        m_kitapadi2.setText("KİTAP ADI");

        m_kitapfiyati2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        m_kitapfiyati2.setText("FİYAT");

        m_sepeteekle2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        m_sepeteekle2.setText("SEPETE EKLE");
        m_sepeteekle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_sepeteekle2ActionPerformed(evt);
            }
        });

        m_sepettençıkar2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        m_sepettençıkar2.setText("SEPETTEN SİL");
        m_sepettençıkar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_sepettençıkar2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel3.setText("ADET");

        m_adet2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(m_resim2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(m_kitapfiyati2)
                    .addComponent(m_sepeteekle2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(m_kitapadi2)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(m_adet2))
                    .addComponent(m_sepettençıkar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(m_kitapadi2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(m_kitapfiyati2)
                        .addGap(18, 18, 18)
                        .addComponent(m_sepeteekle2)
                        .addGap(18, 18, 18)
                        .addComponent(m_sepettençıkar2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3))
                    .addComponent(m_adet2))
                .addGap(102, 102, 102))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(m_resim2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        m_kitapadi1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        m_kitapadi1.setText("KİTAP ADI");

        m_kitapfiyati1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        m_kitapfiyati1.setText("FİYAT");

        m_sepeteekle1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        m_sepeteekle1.setText("SEPETE EKLE");
        m_sepeteekle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_sepeteekle1ActionPerformed(evt);
            }
        });

        m_sepettençıkar1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        m_sepettençıkar1.setText("SEPETTEN SİL");
        m_sepettençıkar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_sepettençıkar1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel4.setText("ADET");

        m_adet1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(m_resim1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(m_kitapfiyati1)
                            .addComponent(m_kitapadi1)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(m_sepettençıkar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(m_sepeteekle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(26, 26, 26)
                        .addComponent(m_adet1)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(m_resim1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(m_kitapadi1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(m_kitapfiyati1)
                        .addGap(18, 18, 18)
                        .addComponent(m_sepeteekle1)
                        .addGap(18, 18, 18)
                        .addComponent(m_sepettençıkar1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(m_adet1))))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        m_kitapadi3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        m_kitapadi3.setText("KİTAP ADI");

        m_kitapfiyati3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        m_kitapfiyati3.setText("FİYAT");

        m_sepeteeklee.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        m_sepeteeklee.setText("SEPETE EKLE");
        m_sepeteeklee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_sepeteekleeActionPerformed(evt);
            }
        });

        m_sepettençıkar3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        m_sepettençıkar3.setText("SEPETTEN SİL");
        m_sepettençıkar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_sepettençıkar3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5.setText("ADET");

        m_adet3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(m_resim4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(m_kitapadi3)
                        .addComponent(m_kitapfiyati3)
                        .addComponent(m_sepeteeklee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(m_sepettençıkar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(m_adet3)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(m_kitapadi3)
                        .addGap(18, 18, 18)
                        .addComponent(m_kitapfiyati3)
                        .addGap(18, 18, 18)
                        .addComponent(m_sepeteeklee)
                        .addGap(18, 18, 18)
                        .addComponent(m_sepettençıkar3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(m_adet3))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(m_resim4, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        m_kitapadi4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        m_kitapadi4.setText("KİTAP ADI");

        m_kitapfiyati4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        m_kitapfiyati4.setText("FİYAT");

        m_sepeteekle4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        m_sepeteekle4.setText("SEPETE EKLE");
        m_sepeteekle4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_sepeteekle4ActionPerformed(evt);
            }
        });

        m_sepettençıkar4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        m_sepettençıkar4.setText("SEPETTEN SİL");
        m_sepettençıkar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_sepettençıkar4ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setText("ADET");

        m_adet4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(m_resim5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(m_kitapadi4)
                        .addComponent(m_kitapfiyati4)
                        .addComponent(m_sepeteekle4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(m_sepettençıkar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(m_adet4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(m_kitapadi4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(m_kitapfiyati4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(m_sepeteekle4)
                .addGap(18, 18, 18)
                .addComponent(m_sepettençıkar4)
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(m_adet4))
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(m_resim5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 233, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    
    private void m_HOMEPAGEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_HOMEPAGEActionPerformed
        // TODO add your handling code here:
 
        Random randomNumberForAnasayfa = new Random();
        ArrayList <Integer> dizi = new ArrayList<Integer>();
        ArrayList <String> kitapadi = new ArrayList<String>();
        ArrayList <String> fiyat = new ArrayList<String>();
        ArrayList<ImageIcon> resimler = new ArrayList<ImageIcon>();
        
        dizi.add(0);
        int j=0;
        while (j<4){
            int üretilenRandomSayı = randomNumberForAnasayfa.nextInt(12-5+1)+5;             
            if(dizi.contains(üretilenRandomSayı)){
                
            }
            else{
                j++;
               dizi.add(üretilenRandomSayı);
            }
        }     
        dizi.remove(0);
 
        
            
            for(int i=0;i<4;i++){
                try{
                        con=DriverManager.getConnection("jdbc:mysql://localhost/homework", "root", "");
                        st=con.prepareStatement("select * from resim where ID = ?");
                        st.setInt(1, dizi.get(i));  
                        st.execute();
                        rs=st.executeQuery();
                }
                catch(Exception e){
                    
                }
                if(i == 0){
                    try{                       
                        if(rs.next()){
                            m_kitapadi1.setText(rs.getString("kitapadi"));
                            String fiyats;                          
                            fiyats=rs.getString("fiyat");
                            m_kitapfiyati1.setText(fiyats + " ₺"); 
                            byte[] resim=rs.getBytes("resim2");
                            ImageIcon icon = new ImageIcon(resim);
                            m_resim1.setIcon(icon);
                            //resim var unutma
                        }
                        con.close();
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null, i);
                    }
                }
                else if(i==1){
                    try{
                        
                        if(rs.next()){
                            m_kitapadi2.setText(rs.getString("kitapadi"));
                            String fiyats;                          
                            fiyats=rs.getString("fiyat");
                            m_kitapfiyati2.setText(fiyats + " ₺");
                            byte[] resim=rs.getBytes("resim2");
                            ImageIcon icon = new ImageIcon(resim);
                            m_resim2.setIcon(icon);
                        }
                        con.close();
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null, i);
                    }
                }
                else if(i==2){
                    try{
                       
                        if(rs.next()){
                            m_kitapadi3.setText(rs.getString("kitapadi"));
                            String fiyats;                          
                            fiyats=rs.getString("fiyat");
                            m_kitapfiyati3.setText(fiyats + " ₺");
                            byte[] resim=rs.getBytes("resim2");
                            ImageIcon icon = new ImageIcon(resim);
                            m_resim4.setIcon(icon);
                        }
                        con.close();
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null, i);
                    }
                }
                else if(i==3){
                    try{
                       
                        if(rs.next()){
                            m_kitapadi4.setText(rs.getString("kitapadi"));
                            String fiyats;                          
                            fiyats=rs.getString("fiyat");
                            m_kitapfiyati4.setText(fiyats + " ₺");
                            byte[] resim=rs.getBytes("resim2");
                            ImageIcon icon = new ImageIcon(resim);
                            m_resim5.setIcon(icon);
                        }
                        con.close();
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null, e);
                    }
                }                
            }  
        
        
        // kitap adına göre adet1 bilgisini güncelliyor
         m_adet1.setText( new kitp().kitapAdınaGöreAdetGüncelleme(m_kitapadi1.getText()));        
         m_adet2.setText( new kitp().kitapAdınaGöreAdetGüncelleme(m_kitapadi2.getText()));
         m_adet3.setText( new kitp().kitapAdınaGöreAdetGüncelleme(m_kitapadi3.getText()));
         m_adet4.setText( new kitp().kitapAdınaGöreAdetGüncelleme(m_kitapadi4.getText()));
         
         
         
          // kitap adına göre kitabın counter değerine bakıyoruz ve eğer counter 0'sa buton enabled özelliğini değiştiriyoruz
         new kitp().butonAktifliği(m_kitapadi1.getText(), m_sepettençıkar1);
         new kitp().butonAktifliği(m_kitapadi2.getText(), m_sepettençıkar2);
         new kitp().butonAktifliği(m_kitapadi3.getText(), m_sepettençıkar3);
         new kitp().butonAktifliği(m_kitapadi4.getText(), m_sepettençıkar4);
        
    }//GEN-LAST:event_m_HOMEPAGEActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void m_YAZAR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_YAZAR1ActionPerformed
        // TODO add your handling code here:
        
        
       
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/homework", "root", "");
            st=con.prepareStatement("select * from resim where yazar = ?");
            st.setString(1, m_YAZAR1.getText());
            st.execute();
            rs=st.executeQuery();  
         
             ArrayList<String>kitapadi = new ArrayList<String>();
             ArrayList<String>fiyat = new ArrayList<String>();
             ArrayList<ImageIcon> resimler = new ArrayList<ImageIcon>();
             while(rs.next()){
                kitapadi.add(rs.getString("kitapadi"));
                fiyat.add(rs.getString("fiyat"));
                byte[] resim=rs.getBytes("resim2");
                ImageIcon icon = new ImageIcon(resim);
                resimler.add(icon);
             }
             
             m_kitapadi1.setText(kitapadi.get(0));
             m_kitapfiyati1.setText(fiyat.get(0) + " ₺");
             m_resim1.setIcon(resimler.get(0));
             m_kitapadi2.setText(kitapadi.get(1));
             m_kitapfiyati2.setText(fiyat.get(1) + " ₺");
             m_resim2.setIcon(resimler.get(1));
             m_kitapadi3.setText(kitapadi.get(2));
             m_kitapfiyati3.setText(fiyat.get(2) + " ₺");
             m_resim4.setIcon(resimler.get(2));
             m_kitapadi4.setText(kitapadi.get(3));
             m_kitapfiyati4.setText(fiyat.get(3) + " ₺");
             m_resim5.setIcon(resimler.get(3));
  
             con.close();
       }
        catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
        }
        
        
        // kitap adına göre adet1 bilgisini güncelliyor
         m_adet1.setText( new kitp().kitapAdınaGöreAdetGüncelleme(m_kitapadi1.getText()));
         m_adet2.setText( new kitp().kitapAdınaGöreAdetGüncelleme(m_kitapadi2.getText()));
         m_adet3.setText( new kitp().kitapAdınaGöreAdetGüncelleme(m_kitapadi3.getText()));
         m_adet4.setText( new kitp().kitapAdınaGöreAdetGüncelleme(m_kitapadi4.getText()));
         
          
         // kullanıcı sepete ekleye 1 kere basmadan sepetten çıkara basmasın diye
         new kitp().butonAktifliği(m_kitapadi1.getText(), m_sepettençıkar1);
         new kitp().butonAktifliği(m_kitapadi2.getText(), m_sepettençıkar2);
         new kitp().butonAktifliği(m_kitapadi3.getText(), m_sepettençıkar3);
         new kitp().butonAktifliği(m_kitapadi4.getText(), m_sepettençıkar4); 
        
        
    }//GEN-LAST:event_m_YAZAR1ActionPerformed

    private void m_ÇIKIŞActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_ÇIKIŞActionPerformed
        // TODO add your handling code here:
        int result=JOptionPane.showConfirmDialog(null, "Emin misiniz?","Onay Kutusu", JOptionPane.YES_NO_OPTION);    
        if(result==JOptionPane.YES_OPTION){
           super.dispose();
           new login().setVisible(true);           
        }        
    }//GEN-LAST:event_m_ÇIKIŞActionPerformed

    
    
    
    
    
    
    
    
    private void m_sepettençıkar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_sepettençıkar2ActionPerformed
        // TODO add your handling code here:
        
       new kitp().deincrementCounter(m_kitapadi2.getText());      
       new sepetİşlemleri().çıkar(m_tutar, m_sepettençıkar2, m_kitapadi2.getText());
       m_adet2.setText( new kitp().kitapAdınaGöreAdetGüncelleme(m_kitapadi2.getText()));
    }//GEN-LAST:event_m_sepettençıkar2ActionPerformed

    private void m_sepeteekle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_sepeteekle2ActionPerformed
        // TODO add your handling code here:
         m_sepettençıkar2.setEnabled(true);       
         new sepetİşlemleri().ekle(m_kitapadi2.getText(), m_tutar);          
         m_adet2.setText( new kitp().kitapAdınaGöreAdetGüncelleme(m_kitapadi2.getText()));        
          // burada adete veri çekiyoruz
    }//GEN-LAST:event_m_sepeteekle2ActionPerformed


    
    
    
    
    private void m_SİPARİŞDURUMUMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_SİPARİŞDURUMUMActionPerformed
        // TODO add your handling code here:
        int miktar=Integer.parseInt(m_tutar.getText());
        if(miktar==0){
            JOptionPane.showMessageDialog(null,"SEPETİNİZ BOŞ");
        }
        else{
            new ödeme(m_ADSOYAD.getText(), m_tutar.getText()).setVisible(true);
        }        
    }//GEN-LAST:event_m_SİPARİŞDURUMUMActionPerformed

    
    
    private void m_sepeteekle4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_sepeteekle4ActionPerformed
        // TODO add your handling code here:
        m_sepettençıkar4.setEnabled(true); 
        new sepetİşlemleri().ekle(m_kitapadi4.getText(), m_tutar); // sepete ekleme işlemi için tanımlanan fonksiyonun kullanımı 
        m_adet4.setText( new kitp().kitapAdınaGöreAdetGüncelleme(m_kitapadi4.getText()));
          // burada adete veri çekiyoruz     
    }//GEN-LAST:event_m_sepeteekle4ActionPerformed

    private void m_sepettençıkar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_sepettençıkar4ActionPerformed
        // TODO add your handling code here:
        
        new kitp().deincrementCounter(m_kitapadi4.getText());
        new sepetİşlemleri().çıkar(m_tutar, m_sepettençıkar4, m_kitapadi4.getText());
        m_adet4.setText( new kitp().kitapAdınaGöreAdetGüncelleme(m_kitapadi4.getText()));
    }//GEN-LAST:event_m_sepettençıkar4ActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void m_sepettençıkar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_sepettençıkar1ActionPerformed
        // TODO add your handling code here:
        
       new kitp().deincrementCounter(m_kitapadi1.getText());      
       new sepetİşlemleri().çıkar(m_tutar, m_sepettençıkar1, m_kitapadi1.getText());       
       m_adet1.setText( new kitp().kitapAdınaGöreAdetGüncelleme(m_kitapadi1.getText()));
    }//GEN-LAST:event_m_sepettençıkar1ActionPerformed

    private void m_sepeteekle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_sepeteekle1ActionPerformed
        // TODO add your handling code here:
        
         m_sepettençıkar1.setEnabled(true); 
         new sepetİşlemleri().ekle(m_kitapadi1.getText(), m_tutar);         
         m_adet1.setText( new kitp().kitapAdınaGöreAdetGüncelleme(m_kitapadi1.getText()));         
          // burada adete veri çekiyoruz     
    }//GEN-LAST:event_m_sepeteekle1ActionPerformed

    
    
    
    
  
    
    
    private void m_sepettençıkar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_sepettençıkar3ActionPerformed
        // TODO add your handling code here:
        
        new kitp().deincrementCounter(m_kitapadi3.getText());      
        new sepetİşlemleri().çıkar(m_tutar, m_sepettençıkar3, m_kitapadi3.getText());
        m_adet3.setText( new kitp().kitapAdınaGöreAdetGüncelleme(m_kitapadi3.getText()));
        
    }//GEN-LAST:event_m_sepettençıkar3ActionPerformed

    private void m_sepeteekleeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_sepeteekleeActionPerformed
        // TODO add your handling code here:
       m_sepettençıkar3.setEnabled(true); 
       new sepetİşlemleri().ekle(m_kitapadi3.getText(), m_tutar);         
       m_adet3.setText( new kitp().kitapAdınaGöreAdetGüncelleme(m_kitapadi3.getText()));
        // burada adete veri çekiyoruz
           
      
    }//GEN-LAST:event_m_sepeteekleeActionPerformed

    
    
    
    
    private void m_YAZAR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_YAZAR2ActionPerformed
        // TODO add your handling code here:
         try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/homework", "root", "");
            st=con.prepareStatement("select * from resim where yazar = ?");
            st.setString(1, m_YAZAR2.getText());
            st.execute();
            rs=st.executeQuery();  
         
             ArrayList<String>kitapadi = new ArrayList<String>();
             ArrayList<String>fiyat = new ArrayList<String>();
             ArrayList<ImageIcon> resimler = new ArrayList<ImageIcon>();
             while(rs.next()){
                kitapadi.add(rs.getString("kitapadi"));
                fiyat.add(rs.getString("fiyat"));
                byte[] resim=rs.getBytes("resim2");
                ImageIcon icon = new ImageIcon(resim);
                resimler.add(icon);
               
             }
             
             m_kitapadi1.setText(kitapadi.get(0));
             m_kitapfiyati1.setText(fiyat.get(0) + " ₺");
             m_resim1.setIcon(resimler.get(0));
             m_kitapadi2.setText(kitapadi.get(1));
             m_kitapfiyati2.setText(fiyat.get(1) + " ₺");
             m_resim2.setIcon(resimler.get(1));
             m_kitapadi3.setText(kitapadi.get(2));
             m_kitapfiyati3.setText(fiyat.get(2) + " ₺");
             m_resim4.setIcon(resimler.get(2));
             m_kitapadi4.setText(kitapadi.get(3));
             m_kitapfiyati4.setText(fiyat.get(3) + " ₺");
             m_resim5.setIcon(resimler.get(3));
             
              
             
             con.close();
         
         
             
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
        }
         
         
       
      
            
         // kitap adına göre adet1 bilgisini güncelliyor
         m_adet1.setText( new kitp().kitapAdınaGöreAdetGüncelleme(m_kitapadi1.getText()));
         m_adet2.setText( new kitp().kitapAdınaGöreAdetGüncelleme(m_kitapadi2.getText()));
         m_adet3.setText( new kitp().kitapAdınaGöreAdetGüncelleme(m_kitapadi3.getText()));
         m_adet4.setText( new kitp().kitapAdınaGöreAdetGüncelleme(m_kitapadi4.getText()));
         
         
          new kitp().butonAktifliği(m_kitapadi1.getText(), m_sepettençıkar1);
         new kitp().butonAktifliği(m_kitapadi2.getText(), m_sepettençıkar2);
         new kitp().butonAktifliği(m_kitapadi3.getText(), m_sepettençıkar3);
         new kitp().butonAktifliği(m_kitapadi4.getText(), m_sepettençıkar4);
        
    }//GEN-LAST:event_m_YAZAR2ActionPerformed

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
            java.util.logging.Logger.getLogger(kitap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kitap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kitap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kitap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             
             // UYGULAMANIN BİRİNCİ SAYFASI
               new login().setVisible(true);
                

            }
        }
    );
        }
        
       
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel m_ADSOYAD;
    private javax.swing.JLabel m_BAŞHARFLER;
    private javax.swing.JButton m_HOMEPAGE;
    private javax.swing.JButton m_SİPARİŞDURUMUM;
    private javax.swing.JButton m_YAZAR1;
    private javax.swing.JButton m_YAZAR2;
    private javax.swing.JLabel m_adet1;
    private javax.swing.JLabel m_adet2;
    private javax.swing.JLabel m_adet3;
    private javax.swing.JLabel m_adet4;
    private javax.swing.JLabel m_kitapadi1;
    private javax.swing.JLabel m_kitapadi2;
    private javax.swing.JLabel m_kitapadi3;
    private javax.swing.JLabel m_kitapadi4;
    private javax.swing.JLabel m_kitapfiyati1;
    private javax.swing.JLabel m_kitapfiyati2;
    private javax.swing.JLabel m_kitapfiyati3;
    private javax.swing.JLabel m_kitapfiyati4;
    private javax.swing.JLabel m_resim1;
    private javax.swing.JLabel m_resim2;
    private javax.swing.JLabel m_resim4;
    private javax.swing.JLabel m_resim5;
    private javax.swing.JButton m_sepeteekle1;
    private javax.swing.JButton m_sepeteekle2;
    private javax.swing.JButton m_sepeteekle4;
    private javax.swing.JButton m_sepeteeklee;
    private javax.swing.JButton m_sepettençıkar1;
    private javax.swing.JButton m_sepettençıkar2;
    private javax.swing.JButton m_sepettençıkar3;
    private javax.swing.JButton m_sepettençıkar4;
    private javax.swing.JLabel m_tutar;
    private javax.swing.JButton m_ÇIKIŞ;
    // End of variables declaration//GEN-END:variables

    
}
