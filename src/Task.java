
public class Task {
	public static int numberOfTasks = 1;
	public int TaskNumber;
	public String NameOfInterrogee = new String();
	public String OperationType= new String();
	public int CustomerType ;
	public int TimeOfArrival;
	public Task(String NameOfInterrogee,String OperationType,int CustomerType,int TimeOfArrival) {
		this.TaskNumber = numberOfTasks;
		this.NameOfInterrogee = NameOfInterrogee;
		this.OperationType = OperationType;
		this.CustomerType = CustomerType;
		this.TimeOfArrival = TimeOfArrival;
		numberOfTasks++;
	}
}
