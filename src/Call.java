
public class Call implements Runnable{
	public String NameOfInterrogee = new String();
	public String OparationType= new String();
	public int CostumerType;
	public int TimeOfArrival;
	public int duration;
	public static Queue<Call> callQ = new Queue<Call>();
	public boolean Finished = false;
	public Call(String Name,String Service,String Customer, int Arrival,int Duration) {
		NameOfInterrogee = Name;
		OparationType = Service;
		if(Customer.equals("private")){
			CostumerType=1;
		}if(Customer.equals("business")){
			CostumerType=2;
		}if(Customer.equals("government")){
			CostumerType=3 ;
		}
		TimeOfArrival = Arrival*1000;
		duration = Duration*1000;
	}
	public void run() {
		this.SleepUntilArrival();
		callQ.insert(this);
		waitForFinish();
		}
	public void SleepUntilArrival(){
	try {
			Thread.sleep(TimeOfArrival);
		} catch (InterruptedException e) {}
	}
	public synchronized void waitForFinish() {
		while(!Finished) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	}
	public synchronized void FinishCall(){
		this.Finished = true;
	}
}
