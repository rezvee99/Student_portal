package StudentPortal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Teacheroutput {
//	`Name`, `Id`, `Email`, `Password`, `Security_Pin`, `Department`, `Phone_NO`, `Permanent_ad`, `Present_ad`

	String password;
	String email;
	int pin;
	String name,id,dept,phone,permanentAd,presentAd;
     int sn;
    
    public void Output(String Email) {
    	try{
        Connection conn = Dbconnection.dbcon();
        Statement statement = conn.createStatement();
        
        ResultSet rs = statement.executeQuery("SELECT * FROM `teacher` WHERE `Email` LIKE '"+Email+"'");
 
        while(rs.next()){
            password = rs.getString("password");
            sn = rs.getInt(1);
            email = rs.getString("email");
            pin= rs.getInt(6);
//          System.out.println(pin);
            name = rs.getString(2);
            id = rs.getString(3);
            dept = rs.getString(7);
            phone = rs.getString(8);
            permanentAd = rs.getString(9);
            presentAd = rs.getString(10);
            
              
        }
        conn.close();
        }
    	catch (Exception e) {
    		System.err.println(e.getMessage());
		}
        
    }
    
}