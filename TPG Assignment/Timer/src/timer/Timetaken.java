package timer;


public class Timetaken {
	static Multiplication m = new Multiplication();
	public static int Add(int n1,int n2)
	{
		return n1+n2;
	}
	public static void main(String[] args) {
		int result;
		long elapsedTime;
		long startTime = System.nanoTime();
		result=m.multiply(20,30);
		elapsedTime = System.nanoTime() - startTime;
		System.out.println("Printing result"+result);
		System.out.println("Time Taken in nano seconds"+elapsedTime);
	
		
		
	}

}
