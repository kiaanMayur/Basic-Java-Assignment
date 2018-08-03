/*class which has a method to calculate the simple interest of a principle amouont*/
public class SimpleInterest {
	
	private double principle;
	private int rate;
	private int time;
	
	
	public double getPrinciple() {
		return principle;
	}
	public void setPrinciple(double principle) {
		this.principle = principle;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	
	// method to calculate the simple interest
	public double calculateSimpleInterest(double principle, int rate, int time) {
		
		return ((principle * rate * time) / 100);
		
	}
	@Override
	public String toString() {
		return "SimpleInterest [principle=" + principle + ", rate=" + rate + ", time=" + time + "]";
	}
}
