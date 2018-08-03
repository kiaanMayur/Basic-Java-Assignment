import java.lang.Math.*;

/*class which contains method to calculate the compound interest on a principle*/
public class CompoundInterest {
	
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
	
	//method to calculate the compound interest
	public double calculateCompoundInterest(double principle, int rate, int time) {
		
		return (principle * Math.pow((1 + (rate / 100)),time));
	}
	@Override
	public String toString() {
		return "CompoundInterest [principle=" + principle + ", rate=" + rate + ", time=" + time + "]";
	}
	
	

}
