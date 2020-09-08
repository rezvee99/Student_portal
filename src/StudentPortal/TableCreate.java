package StudentPortal;
import java.sql.*;

import javax.swing.JOptionPane;

public class TableCreate {
	
	//CREATE TABLE `student` ( `SN` INT NOT NULL AUTO_INCREMENT , `Name` VARCHAR(50) , `Id` VARCHAR(20)  , `Email` VARCHAR(50), `Password` VARCHAR(40) , `Security_Pin` INT  , `Department` VARCHAR(30) , `Section` VARCHAR(10) , `Father's_Name` VARCHAR(100) , `Mother's_Name` VARCHAR(100) , `Phone_NO` VARCHAR(20) , `Permanent_ad` VARCHAR(200) , `Present_ad` VARCHAR(200)  , PRIMARY KEY (`SN`), UNIQUE (`Email`), UNIQUE (`Id`));
    public void InfoTable()
    {

  	  
            
            Connection connection = Dbconnection.dbcon();
            
            
            //Student Iformation table
            try {
            	Statement statement = connection.createStatement();
             	statement.execute("CREATE TABLE `student` ( `SN` INT NOT NULL AUTO_INCREMENT , `Name` VARCHAR(50) , `Id` VARCHAR(20)  ,"+
                  " `Email` VARCHAR(50), `Password` VARCHAR(40) , `Security_Pin` INT  , `Department` VARCHAR(30) , `Section` VARCHAR(10) ,"+
                  " `Father's_Name` VARCHAR(100) , `Mother's_Name` VARCHAR(100) , `Phone_NO` VARCHAR(20) , `Permanent_ad` VARCHAR(200) ,"+
                  " `Present_ad` VARCHAR(200)  , PRIMARY KEY (`SN`), UNIQUE (`SN`), UNIQUE (`Email`), UNIQUE (`Id`))");
                        
                     //   JOptionPane.showMessageDialog(null,"Student Table Create Successfully");
            	
			}catch(SQLException e){
	            //System.err.println(e.getMessage());
	            JOptionPane.showMessageDialog(null,e.getMessage());
	        }
            
            
            
            // Student Payment
            try{
            Statement statement = connection.createStatement();
            statement.execute("CREATE TABLE `payment_S` (`SN` INT NOT NULL AUTO_INCREMENT ,  `Id` VARCHAR(20), `Pay_amount` INT,"+
            " PRIMARY KEY (`SN`),UNIQUE (`SN`), UNIQUE (`Id`))");
            
           // JOptionPane.showMessageDialog(null,"Student Payment Create Successfully");
            
            }catch(SQLException e){
	            //System.err.println(e.getMessage());
	            JOptionPane.showMessageDialog(null,e.getMessage());
	        }
            
            
            //Teacher Information Table
            
           try { 
            Statement statement = connection.createStatement();
            statement.execute("CREATE TABLE `teacher` ( `SN` INT NOT NULL AUTO_INCREMENT , `Name` VARCHAR(50) , `Id` VARCHAR(20)  ,"+
            " `Email` VARCHAR(50), `Password` VARCHAR(40) , `Security_Pin` INT  , `Department` VARCHAR(30)  , `Phone_NO` VARCHAR(20) ,"+
            " `Permanent_ad` VARCHAR(200) , `Present_ad` VARCHAR(200)  , PRIMARY KEY (`SN`),UNIQUE (`SN`), UNIQUE (`Email`),"+
            " UNIQUE (`Id`))");
                   
            // JOptionPane.showMessageDialog(null,"Teacher Table Create Successfully");
            
           }catch(SQLException e){
	            //System.err.println(e.getMessage());
	            JOptionPane.showMessageDialog(null,e.getMessage());
	        }
            
         //   JOptionPane.showMessageDialog(null, "Table Create Successfully");
           
            
            
       
       
  	
    }
    
 
	
  
}