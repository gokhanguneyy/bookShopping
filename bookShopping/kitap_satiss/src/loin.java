
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gokha
 */
public class loin {
    Connection con= null;
    PreparedStatement st;
    ResultSet rs;
    ResultSetMetaData stData;
    int q;
    
    public boolean girisyap(String nickname, String parola){
        boolean sayfaKapanis = false;
            try{
                // gelen kullanıcı adı ve şifreyi sorguda kullanıyoruz
                con = DriverManager.getConnection("jdbc:mysql://localhost/homework", "root", "");
               st=con.prepareStatement("select * from kayitol WHERE KULLANICIADI = ? AND PAROLA = ?");
               st.setString(1, nickname);
               st.setString(2, parola);
               st.execute();
               rs=st.executeQuery();
       
        
                if(rs.next()){
                   String kullanıcıadı=rs.getString("KULLANICIADI");
                   String ad=rs.getString("AD");
                   String soyad=rs.getString("SOYAD");
                   // anasayfaya veri yolluyoruz
                   new kitap(kullanıcıadı, ad, soyad).setVisible(true);
                   sayfaKapanis = true;
                  
                }
                else{
                    JOptionPane.showMessageDialog(null, "LÜTFEN GİRİŞ BİLGİLERİNİZİ KONTROL EDİNİZ..."); 
                }          
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "LÜTFEN BOŞLUK BIRAKMAYINIZ");
                sayfaKapanis=false;
            }        
      return sayfaKapanis;  
         
    }
    
    
    
    
    
   
    
    
    
   
}
