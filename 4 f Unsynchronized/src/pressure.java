class pressure extends Thread {
	int id;
	public pressure(int id) {  this.id = id;}

	void RaisePressure() {
		if (p.pressureGauge < p.safetyLimit-15) {  
			// wait briefly to simulate some calculations
			 try{sleep(100);} catch (Exception e){} 
			p.pressureGauge += 15;
			System.out.println("Thread  "+id +"    " + p.pressureGauge);
		}  else 
		           System.out.println("Thread  " + id + "   " + "not OK");
                                       ; // pressure too high -- don't do anything.
	}

	public void run() {
		RaisePressure();
	}
}


