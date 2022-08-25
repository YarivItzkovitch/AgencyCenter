
public class TaskManager {
	public String Name = new String();
	public TaskManager(String name) {
		this.Name=name;
	}

	public Strategy crateStrategy(Task t) {
		String CodeName = swap(t.NameOfInterrogee,0,t.NameOfInterrogee.length()-1);
		int level = levelDecider(t.OperationType);
		int Time = (level*t.CustomerType)*1000;
		return new Strategy(t.TaskNumber,CodeName,level,t.CustomerType,Time);
	}
	public void PutStrategyInDB(Strategy s) {
		//to do
	}
	
	public static String swap(String a, int i, int j) 
	{ 
		char temp; 
		char[] charArray = a.toCharArray(); 
		temp = charArray[i]; 
		charArray[i] = charArray[j]; 
		charArray[j] = temp; 
		return String.valueOf(charArray);
	}
	public static int levelDecider(String s) {
		if(s.equals("inquiry")){
			return 1;
		}if(s.equals("Background check")){
			return 2;
		} if(s.equals("surveillance")){
			return 3;
		} if(s.equals("fraud and illegal activity")){
			return 4;
		} if(s.equals("missing people")){
			return 5;
		}
		return 0;
	}
}
