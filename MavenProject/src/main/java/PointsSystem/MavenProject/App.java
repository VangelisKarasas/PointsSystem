package PointsSystem.MavenProject;
import java.util.Scanner;

import dbConnection.GetBasePoints;
import dbConnection.UpdatePoints;
import pointsCalculations.CalculatePoints;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Εισήγαγε τον κωδικό του πελάτη για την εισαγωγή των πόντων:\n" );
        Scanner CustomerSC = new Scanner(System.in);
        int Customer=CustomerSC.nextInt();
        
        
        GetBasePoints NewConnection=new GetBasePoints(Customer);
        int BasePoints=NewConnection.getBasePoints();
        
        
        System.out.println( "Εισήγαγε τους πόντους που κέρδισε απο την νέα συναλλαγή ο συγκεκριμένος πελάτη!\n" );
        Scanner PointsSC = new Scanner(System.in);
        int Points=PointsSC.nextInt();
        
        
        
        CalculatePoints NewPoints=new CalculatePoints(Points,Customer,BasePoints);
        int Totalnew = NewPoints.getTotalPoints();
        int AvailablePoints=CalculatePoints.getAvailablePoints();
        
        System.out.printf("%nΟ πελάτης με κωδικό %d έχει πλέον %d πόντους και μπορεί να χρησιμοποιήσει τους %d σήμερα%n",Customer,Totalnew,AvailablePoints);
        
        System.out.printf("%nΈχει εξαργύρωση πόντων σε αυτή τη συναλλαγή ο πελάτης;%n%nΑν έχει πληκτρολόγησε το ποσό διαφορετικά πληκτρολόγησε 0%n");
        
        int PointsDeduction=PointsSC.nextInt();
        
        int PointsRemaining=Totalnew-PointsDeduction;
        
        System.out.printf("%nΜετά την εξαργύρωση του απομένουν %d",PointsRemaining);
        
        UpdatePoints UpdateDBPoints = new UpdatePoints(Customer,PointsRemaining);
        
    }
}
 