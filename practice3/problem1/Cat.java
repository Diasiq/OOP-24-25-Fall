package problem1;

public class Cat extends Animal {
	public Cat() {
		super(); 
	}
	public Cat(String name , int age , String color) { 
		super(name , age , color);
	}
	@Override 
	public String voice() {
		return "Meowww"; 
	} 
	public String voice(int times) {
		String repeat = "I say " ; 
		for(int i = 0 ; i < times ; i++) {
			repeat +=voice();
			repeat +=" "; 
		}
		return repeat ;
	}
	@Override 
	public String toString(){
		return super.toString() ;
	}
}
