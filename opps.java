class MyClass
{
	String s = "Mohit";
	public void sayHello(String name)
	{
		System.out.println("My Class "+name+" "+s);
	}
}
public class opps
{
	public static void main(String[] args)
	{
		MyClass mc = new MyClass();
		mc.sayHello("Name");
	}
}