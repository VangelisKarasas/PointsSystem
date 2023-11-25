package PointsSystem.MavenProject;
import java.util.Scanner;
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
        System.out.println( "Εισήγαγε τους πόντους απο την νέα συναλλαγή για τον συγκεκριμένο πελάτη!\n" );
        Scanner PointsSC = new Scanner(System.in);
        int Points=PointsSC.nextInt();
    
        CalculatePoints NewPoints=new CalculatePoints(Points,Customer);
        
        int Totalnew = NewPoints.getTotalPoints();
        
        int AvailablePoints=Totalnew-Points;
        
        System.out.printf("%nΟ πελάτης με κωδικό %d έχει πλέον %d πόντους και μπορεί να χρησιμοποιήσει τους %d σήμερα%n",Customer,Totalnew,AvailablePoints);
        
        System.out.printf("%nΈχει εξαργύρωση πόντων σε αυτή τη συναλλαγή ο πελάτης;%n%nΑν έχει πληκτρολόγησε το ποσό διαφορετικά πληκτρολόγησε 0%n");
        
        int PointsDeduction=PointsSC.nextInt();
        
        int PointsRemaining=AvailablePoints-PointsDeduction;
        
        System.out.printf("%nΜετά την εξαργύρωση του απομένουν %d",(AvailablePoints-PointsDeduction));
        
    }
}
