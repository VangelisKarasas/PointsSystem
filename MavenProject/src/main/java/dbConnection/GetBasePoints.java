package dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;


public class GetBasePoints {
			
			private int Customer;
			private static int BasePoints;
			
			public GetBasePoints(int Customer) {
					{
					try {
						Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clientige","root","root");
						Statement stmt = conn.createStatement();
						ResultSet rs = stmt.executeQuery("select Points from client where client.GID="+Customer);
						while(rs.next()) {
							BasePoints=rs.getInt("Points");
							System.out.println(rs.getString("Points"));
							return;
										}
						}
					catch(Exception ex){
			            ex.printStackTrace();
			        		}
					}
					
			}		
			
			
			
			public int getBasePoints() {
				return BasePoints;
			}
			
			public static void setBasePoints(int basePoints) {
				BasePoints = basePoints;
				
			}

			public int getCustomer() {
				return Customer;
			}

			public void setCustomer(int customer) {
				Customer = customer;
			}
}