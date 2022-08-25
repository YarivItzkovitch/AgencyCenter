
public class Secretary extends Thread{
	public Agency workplace;
	public String Name;
	public Queue<Call> v ;// call queue from agency
	public Secretary(String name, Agency a) {
		this.Name=name;
		this.workplace = a ;
		v = a.CallsQ;
	}
	
	public Call currentCall;// pointer to current call that secretary holding
	public  void run() {
		currentCall = v.extract();
		System.out.println(Name + "took a call");
		try {
			Thread.sleep((long)currentCall.duration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		workplace.TaskQ.insert(CallToTask());
		currentCall.FinishCall();
		System.out.println(Name + "inserted task");
	}
	public Task CallToTask() {// create task from a call
		Task t = new Task(currentCall.NameOfInterrogee,currentCall.OparationType,currentCall.CostumerType,currentCall.TimeOfArrival);
		return t;
	}

}
