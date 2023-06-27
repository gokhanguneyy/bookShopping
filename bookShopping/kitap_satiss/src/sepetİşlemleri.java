
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gokha
 */
public class sepetİşlemleri {
     Connection con= null;
    PreparedStatement st;
    ResultSet rs;
    ResultSetMetaData stData;
    int q;
    
    public void ekle(String kitapadı, JLabel tutar){
         int toplam=Integer.parseInt((tutar.getText()));    

          try{
             con = DriverManager.getConnection("jdbc:mysql://localhost/homework", "root", "");
            st=con.prepareStatement("select * from resim WHERE kitapadi = ? ");
            st.setString(1, kitapadı);
            st.execute();
            rs=st.executeQuery();
            
            if(rs.next()){
                 int fiyat;
                fiyat=Integer.parseInt(rs.getString("fiyat") );
                
                tutar.setText(Integer.toString(toplam+fiyat));
                con.close();    
                
                new kitp().incrementCounter(kitapadı);
                
                
         
            }
            con.close();
         
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    public void çıkar(JLabel tutar, JButton sepettenÇıkar, String kitapadı){
        String a = tutar.getText();
          int çıkarma=Integer.parseInt(a);    
        
          try{
             con = DriverManager.getConnection("jdbc:mysql://localhost/homework", "root", "");
            st=con.prepareStatement("select * from resim WHERE kitapadi = ? ");
            st.setString(1, kitapadı);
            st.execute();
            rs=st.executeQuery();
            
            if(rs.next()){
               
              
                
                int counters=rs.getInt("counter");
               
                if(counters==0){                  
                  sepettenÇıkar.setEnabled(false);
                }
                int fiyat;
                fiyat=Integer.parseInt(rs.getString("fiyat") );
                tutar.setText(Integer.toString(çıkarma-fiyat));             
            }          
                  con.close();        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }   
    }
    
}
