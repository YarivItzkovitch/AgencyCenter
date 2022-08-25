
public class testing {

	public static void main(String[] args) {
		Agency a= new Agency("C:\\Users\\idand\\Desktop\\calls.txt");
		Secretary s1 = new Secretary("s1", a);
		Secretary s2 = new Secretary("s2", a);
		Secretary s3 = new Secretary("s3", a);
		Secretary s4 = new Secretary("s4", a);
		Secretary s5 = new Secretary("s5", a);
		s1.start();
		s2.start();
		s3.start();
		s4.start();
		s5.start();
	}

}
