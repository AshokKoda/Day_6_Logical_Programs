package stopWatch;


public class StopWatch {
	
	public long startTimer=0;
	public long stopTimer=0;
	public long elapsed;
	
	public void start()
	{
		startTimer = System.currentTimeMillis();
		System.out.println("Start Time is: " + startTimer);
	}
	
	public void stop()
	{
		stopTimer = System.currentTimeMillis();
		System.out.println("Stop Time is: " + stopTimer);
	}
	
	public long getElapsedTime()
	{
		elapsed = stopTimer - startTimer;
		return elapsed;
	}
	
	

	public static void main(String[] args) {
		
		StopWatch sw = new StopWatch();
		Helper hp = new Helper();
		System.out.println("Press '1' to Start Time: ");
		hp.inputInteger();
		sw.start();
		
		System.out.println();
		System.out.println("Press '2' to Stop Time: ");
		hp.inputInteger();
		sw.stop();
		
		long l=sw.getElapsedTime();
		System.out.println();
		System.out.println("Total Time Elapsed(in millisec) is:" + l);
		System.out.println();
		System.out.println("Converting millisec to seconds: "+ (l/1000) + " sec");

	}
}
