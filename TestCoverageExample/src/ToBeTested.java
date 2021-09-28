public class ToBeTested {
	
	public double getPrice(double x, boolean f, boolean c){
		if (f) 
			x=x*0.9;
		if (c) 
			x=x*0.95;
		return x;
	}
}
