package StudentPortal;
import java.sql.*;

public class StudentOutput {
//	`Name`, `Id`, `Email`, `Password`, `Security_Pin`, `Department`, `Section`, `Father's_Name`,
//	`Mother's_Name`, `Phone_NO`, `Permanent_ad`, `Present_ad
	String password;
	String email;
	String name,id,dept,section,fatherName,motherName,phone,permanentAd,presentAd;
	int pin;
	int sn;
	int amount;
    
    public void Output(String Email)  {
    	try {
        Connection conn = Dbconnection.dbcon();
        Statement statement = conn.createStatement();
        
        ResultSet rs = statement.executeQuery("SELECT * FROM `student` WHERE `Email` LIKE '"+Email+"'");
 
        while(rs.next()){
            password = rs.getString("password");
            sn=rs.getInt(1);
            email = rs.getString("email");
            pin= rs.getInt(6);
            name = rs.getString(2);
            id = rs.getString(3);
            dept = rs.getString(7);
            section = rs.getString(8);
            fatherName = rs.getString(9);
            motherName = rs.getString(10);
            phone = rs.getString(11);
            permanentAd = rs.getString(12);
            presentAd = rs.getString(13);
            
            
           
        }
        conn.close();
    	}
    	catch (Exception e) {
    		System.err.println(e.getMessage());
		}
    }

    public void IDOutput(String Id)  {
    	try {
        Connection conn = Dbconnection.dbcon();
        Statement statement = conn.createStatement();
        
        ResultSet rs = statement.executeQuery("SELECT * FROM `student` WHERE `Id` LIKE '"+Id+"'");
 
        while(rs.next()){
            password = rs.getString("password");
            sn=rs.getInt(1);
            email = rs.getString("email");
            pin= rs.getInt(6);
            name = rs.getString(2);
            id = rs.getString(3);
            dept = rs.getString(7);
            section = rs.getString(8);
            fatherName = rs.getString(9);
            motherName = rs.getString(10);
            phone = rs.getString(11);
            permanentAd = rs.getString(12);
            presentAd = rs.getString(13);
              
        }
        conn.close();
    	}
    	catch (Exception e) {
    		System.err.println(e.getMessage());
		}
    }
   
    public void payment(String Id)  {
    	try {
        Connection conn = Dbconnection.dbcon();
        Statement statement = conn.createStatement();
        
        ResultSet rs = statement.executeQuery("SELECT * FROM `payment_S` WHERE `Id` LIKE '"+Id+"'");
        //sn,id,Pay_amount
        while(rs.next()){
        	 amount=rs.getInt(3);
              
        }
        conn.close();
    	}
    	catch (Exception e) {
    		System.err.println(e.getMessage());
		}
    }
    
}