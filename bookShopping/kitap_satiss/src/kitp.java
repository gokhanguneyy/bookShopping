
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gokha
 */
public class kitp {
      Connection con= null;
    PreparedStatement st;
    ResultSet rs;
    ResultSetMetaData stData;
    int q;
    
    
    
    public int counteraDeğerAtama(){
         int defaultCounterDeğeri = 0;
         try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/homework", "root", "");
            st=con.prepareStatement("update resim set counter = ?");
            st.setInt(1, defaultCounterDeğeri);          
            st.execute();  
            con.close();
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }  
         
         return defaultCounterDeğeri;
    }
    
    public void incrementCounter(String kitapadı){
         try{
                con = DriverManager.getConnection("jdbc:mysql://localhost/homework", "root", "");
                st=con.prepareStatement("update resim set counter=counter+1 where kitapadi = ?");
                st.setString(1, kitapadı);
                st.execute();
                con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void deincrementCounter(String kitapadı){
         try{
                con = DriverManager.getConnection("jdbc:mysql://localhost/homework", "root", "");
                st=con.prepareStatement("update resim set counter=counter-1 where kitapadi = ?");
                st.setString(1, kitapadı);
                st.execute();
                con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
   
    
    
    
    
    
    
    
    
    public String kitapAdınaGöreAdetGüncelleme(String kitapadı){
        String deger = null;
        // kitabın ismie göre adet bilgisini çekiyoruz
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/homework", "root", "");
            st=con.prepareStatement("select counter from resim WHERE kitapadi = ? ");
            st.setString(1, kitapadı);
            st.execute();
            rs=st.executeQuery();
            rs.next();
            deger=Integer.toString(rs.getInt("counter"));
            con.close();
        }
     
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        return deger;
    }
    
    
    
    
    
    public void butonAktifliği(String kitapadı, JButton button){
        try{
             con = DriverManager.getConnection("jdbc:mysql://localhost/homework", "root", "");
            st=con.prepareStatement("select * from resim WHERE kitapadi = ? ");
            st.setString(1, kitapadı);
            st.execute();
            rs=st.executeQuery();
            
            if(rs.next()){
               
            // kitap adına göre kitabın counter değerine bakıyoruz ve eğer counter 0'sa buton enabled özelliğini değiştiriyoruz
 
                int counters=rs.getInt("counter");
               
                if(counters==0){                  
                  button.setEnabled(false);
                }
                else{
                    button.setEnabled(true);
                }
                             
            }          
                  con.close();        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }   
    }
    
    
   
}
