package dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdatePoints {
					
	public UpdatePoints(int Customer,int PointsRemaining) {
			{
			try {
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clientige","root","root");
				Statement stmt = conn.createStatement();
				stmt.executeUpdate("UPDATE client SET Points ="+ PointsRemaining+" where GID ="+Customer);
				}
			catch(Exception ex){
	            ex.printStackTrace();
	        		}
			}
			
	}		
}
