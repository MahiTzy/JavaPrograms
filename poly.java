import java.util.*;

/*class A{
	public static double add(int a, int b){
		return a+b;
	}
	public static double add(int a, double b, int c){
		return a+b+c;
	}
}*/
class A{
	A(){
		System.out.println("Inside A Constructor");
	}
	A(String name){
		System.out.println("Inside A Para Constructor "+name);
	}
	public void displayMsg(){
		System.out.println("Inside A");
	}
}
class B extends A{
	B(){
		System.out.println("Inside B Constructor");
	}
	B(String name){
		super("Rohit");
		System.out.println("Inside B Para Constructor "+name);
	}
	@Override
	public void displayMsg(){
		super.displayMsg();
		System.out.println("Inside B");
	}
}
public class poly {
	public static void main(String[] args) {
		B obj = new B();
		B obj1 = new B("Mohit");
		obj.displayMsg();
		
    }
}