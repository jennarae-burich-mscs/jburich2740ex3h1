package jburich2740ex3h;

public class Rainfall {

	private double [] rainfallArray;
	
	public Rainfall(double [] rArray) {
		rainfallArray = new double[rArray.length];
		
		for(int i=0; i < rArray.length; i++)
			this.rainfallArray[i] = rArray[i];
	}
	
	public Rainfall(String [] rStrArray) {
		rainfallArray = new double[rStrArray.length];
		
		for(int i=0; i < rStrArray.length; i++)
			this.rainfallArray[i] = Double.parseDouble(rStrArray[i]);
	}
	
	public double getTotal() {
		double total = 0.0;
		for (double value : this.rainfallArray)
			total += value;
		return total;
	}
	
	public double getAverage() {
	
		return getTotal() / this.rainfallArray.length;
	}
	
	public double getHighest() {
		double highest = this.rainfallArray[0];
		for (int index = 1; index < this.rainfallArray.length; index++) {
			if (rainfallArray[index] > highest)
				highest = rainfallArray[index];
		}
		return highest;
	}
	
	public double getLowest() {
		double lowest = this.rainfallArray[0];
		for (int index = 1; index < this.rainfallArray.length; index++) {
			if (rainfallArray[index] < lowest)
				lowest = rainfallArray[index];
		}
		return lowest;
	}
	
}
