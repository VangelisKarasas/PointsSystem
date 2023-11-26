package pointsCalculations;

public class CalculatePoints {
	
	private static int Points;
	private static int Customer;
	private static int TotalPoints;
	
	
	public CalculatePoints(int Points,int Customer,int BasePoints) {
		
		setPoints(Points);
		setCustomer(Customer);
		TotalPoints=BasePoints+Points;
		}
	
			public void setTotalPoints(int TotalPoints){
				CalculatePoints.TotalPoints=TotalPoints;
			}
			
			public int getTotalPoints() {
				return TotalPoints;
			}
		
			public static int getPoints() {
				return Points;
			}
		
			public static void setPoints(int points) {
				Points = points;
			}
		
			public static int getCustomer() {
				return Customer;
			}
		
			public static void setCustomer(int customer) {
				Customer = customer;
			}
		

		    public static int getAvailablePoints() {
		    	return (TotalPoints-Points);
		    }

}
