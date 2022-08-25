import java.io.*;
import java.util.*;
public class Agency {
	public Queue<Call> CallsQ = new Queue<Call>();
	public Queue<Task> TaskQ = new Queue<Task>();
	public Agency(String Calls) {
		CallsQ = readCalls(Calls);
		for (Call c : CallsQ.buffer) {
		Thread t = new Thread(c);
		t.start();
		}
		
	}
	public Queue<Call> readCalls(String Calls) {
		Queue<Call> CallsQ = new Queue<Call>();
		try {
			Scanner input = new Scanner(new File(Calls));
			input.useDelimiter("	|\n|\r");
			input.nextLine();
			while (input.hasNext()) {
				String Callname = input.next();
				String Service = input.next();
				String Customertype = input.next();
				int Arrival = input.nextInt();
				int Duration = input.nextInt();
				Call c = new Call(Callname, Service,Customertype,Arrival, Duration);
				CallsQ.insert(c);
				input.nextLine();
			}
		} catch (IOException IOE) {
			IOE.printStackTrace();
		}
		return CallsQ;
	}
	
	
}
