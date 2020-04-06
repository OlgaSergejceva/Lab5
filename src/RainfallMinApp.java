import java.util.Scanner;
public class RainfallMinApp {

	public static void main(String[] args) {
		//declare 2D[]
		double rainfall[][];
		//set the size for 4 weeks 7 days
		rainfall = new double[4][7];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Plz enter number of weeks: ");
		int weeks = sc.nextInt();
		
		System.out.println("Plz enter number of days per week: ");
		int days = sc.nextInt();
		
		//create a 2D[] with as many rows as user provided for weeks
		//as many columns as user provided for days
		rainfall = new double[weeks][days];
		
		//input
		//traverse the 2D[] by using loop
		//store the values provided by the user
		
		for(int row = 0; row<rainfall.length; row++) {
			for (int col=0; col<rainfall[row].length; col++) {
				System.out.print("enter rainfall value for week: " +(row+1)+ " day " +(col+1) + ":");
				
				rainfall[row][col] = sc.nextDouble();	
			}
		}//end for
		
		//processing
		//calculate the min value in the []
		double min;
		min = rainfall[0][0];
		
		//traverse the 2D [] using outer and inner loop
		for (int row=0; row<rainfall.length; row++) {
			//retrieve the current row, located at the index given by the value of the row
			double r[] = rainfall[row];
			//traverse all the element of current row
			for(int col=0; col<r.length; col++) {
				//if the value of min variable is lower then the current element 
				//from the rainfall[] the update the min with that element
				if(min>rainfall[row][col]) {
					//a new min value has been found
					min = rainfall[row][col];//store the value of current element in the min
					//the previous value from the min is replaced
				}//end if
			}//inner loop
		}//end outer loop
		
		//output
		System.out.println("min is: "+ min);
	
	
	}//end main
}//end class

