public class p {
	static int pressureGauge=0;
	static final int safetyLimit = 20;
    
	public static void main(String[]args) {
		pressure []p1 = new pressure[5];
		for (int i=0; i<5; i++)  {
			p1[i] = new pressure(i); 
			p1[i].start();
		} 
                 // the 5 threads are now running in parallel
		try{ 
			for (int i=0;i<5;i++) 
				p1[i].join();  // wait for thread to end
		} catch(Exception e){ }

		System.out.println(
			"gauge reads "+pressureGauge+", safe limit is 20");
	}

}