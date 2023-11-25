package PointsSystem.MavenProject;

public class CalculatePoints {
	
	public int Points;
	public int Customer;
	public int TotalPoints;
	
	public CalculatePoints(int Points,int Customer) {
		
		this.Points=Points;
		this.Customer=Customer;
		int basePoints=1000;
		TotalPoints=basePoints+Points;
		}
	
	public void setTotalPoints(int TotalPoints){
		this.TotalPoints=TotalPoints;
	}
	
	public int getTotalPoints() {
		return TotalPoints;
	}
	

}
