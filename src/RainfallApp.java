import java.util.Scanner;
public class RainfallApp {

	public static void main(String[] args) {
		
		int rainfall[][];
		rainfall = new int [4][7];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Plz enter number of weeks: ");
			int weeks = sc.nextInt();
		
		System.out.println("Plz enter number of days per week: ");
			int days = sc.nextInt();
			
		rainfall = new int [weeks][days];
		
		//input
		for (int row=0; row<rainfall.length; row++) {
			for (int col=0; col<rainfall[row].length; col++) {
				System.out.print("enter value for week: " + (row+1) + " day " +(col+1)+ ":");
				rainfall[row][col] = sc.nextInt();
			}
		}
		
		//processing
		RainfallAvgMaxMin avgmaxmin = new RainfallAvgMaxMin();
		avgmaxmin.setRainfall(rainfall);
		avgmaxmin.computeAvg();
		avgmaxmin.computeMax();
		avgmaxmin.computeMin();
		
		//output
		double a = avgmaxmin.getAvg();
		double b = avgmaxmin.getMax();
		double c = avgmaxmin.getMin();
						
		System.out.println("Average is: " + a);
		System.out.println("Max is: " + b);
		System.out.println("Min is: " + c);
			
			
		
	}//end main
}//end class
