
public class RainfallAvgMaxMin {
	
	//declare instance variables
	private int rainfall[][];
	private double avg;
	private double max;
	private double min;
	
	//constructor
	public RainfallAvgMaxMin() {
	}
	
	//setter
	public void setRainfall(int[][] rainfall) {
		this.rainfall = rainfall;
	}
	
	//getters
	public double getAvg() {
		return avg;
	}

	public double getMax() {
		return max;
	}

	public double getMin() {
		return min;
	}

	//calculations avg
	public void computeAvg() {
		int sum = 0;
		int counter = 0;
		for(int row = 0; row<rainfall.length; row++) {
			for(int col=0; col<rainfall[row].length; col++) {
			sum = sum + rainfall[row][col];
			counter++;
		}
	}
		avg = (double) sum/counter;
	}
	
	//calculations max
	public void computeMax() {
		max = rainfall[0][0];
		for (int row=0; row<rainfall.length; row++) {
			for(int col=0; col<rainfall[row].length; col++) {
				if(max<rainfall[row][col]) {
					max = rainfall[row][col];
				}
			}
		}
	}
		
	//calculations min
	public void computeMin() {
		min = rainfall[0][0];
		for (int row=0; row<rainfall.length; row++) {
			for(int col=0; col<rainfall[row].length; col++) {
				if(min>rainfall[row][col]) {
					min = rainfall[row][col];
				}
			}
		}
	}
}//end class
