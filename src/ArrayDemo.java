
public class ArrayDemo {
	
	//declare data members
	private int nums[][];

	//constructor
	public ArrayDemo() {
	}

	//getter
	public int[][] getNums() {
		return nums;
	}
	
	//setter
	public void setNums(int[][] nums) {
		this.nums = nums;
	}

	public void setArrayNumber(int row, int col, int num) {
		nums[row][col] = num;
	}
	
	

}
