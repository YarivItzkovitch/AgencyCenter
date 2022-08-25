import java.util.*;
public class Queue<T> {
	public Vector<T> buffer = new Vector<T>();
    public synchronized void insert(T item) {
        buffer.add(item);
        System.out.println(item);
        notifyAll();
}
    
 public synchronized T extract()  {
     while(buffer.isEmpty())  {
    	 try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
     }
	 T item = buffer.remove(0);
        return item;
    }



}
