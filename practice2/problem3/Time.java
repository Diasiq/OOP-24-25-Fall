package problem3;

public class Time {
	public int hour ; 
	public int minute ; 
	public int second ;
	
	public Time(int h , int m , int s) {
		this.hour = h ; 
		this.minute = m ; 
		this.second= s ; 
	}
	public String toUniversal() {
		return (hour < 10 ? "0" + hour : hour) + ":" +  (minute < 10 ? "0" + minute : minute) + ":" + (second < 10 ? "0" + second : second); 
	}
	public String toStandard() {
		return (hour > 12 ? hour - 12 : (hour < 10 ? "0" + hour : hour)) + ":" + (minute < 10 ? "0" + minute : minute) + ":" + (second < 10 ? "0" + second : second + hour) + " " + (hour > 12 ? "PM" : "AM"); 
	}
	public void add(Time time) {
		this.hour = time.hour ;
		this.minute = time.minute ; 
		this.second = time.second ; 
	}
}
