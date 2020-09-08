package StudentPortal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class UpdateData {
     public void updatePassword(String password,int sn) {
       try {
        Connection connection = Dbconnection.dbcon();
        PreparedStatement ps = connection.prepareStatement("UPDATE `student` SET `Password` = ? WHERE `student`.`SN` = ?");
        ps.setString(1, password);
        ps.setInt(2, sn);
        ps.executeUpdate();   
        //System.out.println("updated success");
        JOptionPane.showMessageDialog(null, "Updated success!!");
       }
       catch (Exception e) {
    	   System.err.println(e.getMessage());
	}
    }
     
     
     
     public void updateAllData(int pin, String section,String father,String mother,String phone,String permanent,String present,int sn) {
    	 try {
    	        Connection connection = Dbconnection.dbcon();
    	        PreparedStatement ps = connection.prepareStatement("UPDATE `student` SET `Security_Pin` = ?, `Section` = ?, `Father's_Name` = ?, `Mother's_Name` = ?, `Phone_NO` = ?, `Permanent_ad` = ?, `Present_ad` = ? WHERE `student`.`SN` = ?");
    	        ps.setInt(1,pin );
    	        ps.setString(2, section);
    	        ps.setString(3, father);
    	        ps.setString(4, mother);
    	        ps.setString(5, phone);
    	        ps.setString(6, permanent);
    	        ps.setString(7, present);
    	        ps.setInt(8,sn );
    	        ps.executeUpdate();   
    	       //System.out.println("updated success");
    	        JOptionPane.showMessageDialog(null, "Updated success!!");
    	       }
    	       catch (Exception e) {
    	    	   System.err.println(e.getMessage());
    		}
     }
     public void updateTeacherPassword(String password,int sn) {
         try {
          Connection connection = Dbconnection.dbcon();
          PreparedStatement ps = connection.prepareStatement("UPDATE `teacher` SET `Password` = ? WHERE `teacher`.`SN` = ?");
          ps.setString(1, password);
          ps.setInt(2, sn);
          ps.executeUpdate();   
         // System.out.println("updated success");
          JOptionPane.showMessageDialog(null, "Updated success!!");
         }
         catch (Exception e) {
      	   System.err.println(e.getMessage());
         }
  	}
     public void updateTeacherAllData(int pin, String phone,String permanent,String present,int sn) {
    	 try {
    	        Connection connection = Dbconnection.dbcon();
    	        PreparedStatement ps = connection.prepareStatement("UPDATE `teacher` SET `Security_Pin` = ?, `Phone_NO` = ?, `Permanent_ad` = ?, `Present_ad` = ? WHERE `teacher`.`SN` = ?");
    	        ps.setInt(1,pin );
    	        ps.setString(2, phone);
    	        ps.setString(3, permanent);
    	        ps.setString(4, present);
    	        ps.setInt(5,sn );
    	        ps.executeUpdate();   
    	       // System.out.println("updated success");
    	        JOptionPane.showMessageDialog(null, "Updated success!!");
    	       }
    	       catch (Exception e) {
    	    	   System.err.println(e.getMessage());
    		}
     }
     
     public void deleteData(String id) {
    	 
         try {
         Connection connection = Dbconnection.dbcon();
         //System.out.println(id);
         PreparedStatement ps = connection.prepareStatement("DELETE FROM `student` WHERE `student`.`Id` = ? ");
         PreparedStatement ps1 = connection.prepareStatement("DELETE FROM `payment` WHERE `payment`.`Id` = ? ");
        
         ps.setString(1, id);
         ps1.setString(1, id);
        
         ps1.executeUpdate();
         ps.executeUpdate();   
         
         JOptionPane.showMessageDialog(null, "deleted success");
         }catch (Exception e) {
         	System.err.println(e.getMessage());
 		}
    	 
     }
     
     public void updatePayment(String Id,int amount)
     {
    	 try {
    		 Connection connection = Dbconnection.dbcon();
 	        PreparedStatement ps = connection.prepareStatement("UPDATE `payment_s` SET `Pay_amount` = ? WHERE `payment_s`.`Id` = ?;" );
 	        ps.setString(2, Id);
			ps.setInt(1, amount);
			 ps.executeUpdate();   
			 JOptionPane.showMessageDialog(null,"Adding Successfuly");
		} catch (Exception e) {
			 System.err.println(e.getMessage());
		}
    	 
     }
     
}       
