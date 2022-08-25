
public class Strategy {
public int SerialNum;
public String CodeName = new String();
public int level;
public int CustomerType;
public int EstimatedOpTime;
public Strategy(int Tasknum,String Name,int level,int CustomerType,int Time) {
	SerialNum  = Tasknum;
	CodeName = Name;
	this.level=level;
	this.CustomerType = CustomerType;
	EstimatedOpTime = Time;
}
}
