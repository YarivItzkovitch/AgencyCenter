
public class BoundedQueue extends Queue<Operation>{
    private Operation[] buffer;
    private int first;
    private int last;
    private int N =15;
    public BoundedQueue() {
        buffer = new Operation[N];
        first = 0;
        last = 0;  
}
    public synchronized void insert(Operation item) {
        while (last - first == N)
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        buffer[last % N] = item;
        notifyAll();
        last++; 
}
    
 public synchronized Operation extract()  {
        while (last == first)
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        Operation item = buffer[first % N];
        first++;
        notifyAll();
        return item;
    }

}
