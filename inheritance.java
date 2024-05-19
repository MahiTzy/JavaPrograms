import java.util.*;

/*class RunDog{
	public void bark(){
		System.out.println("Sheru Barking...");
	}
}
class BullDog extends RunDog{
	public void growl(){
		System.out.println("Tuffy Growling...");
	}
}*/
/*class Shape{
	int size;
	public void setSize(int size){
		this.size = size;
	}
}
class Square extends Shape{
	public void area(){
		System.out.println("Area of Square: "+size*size);
	}
}
class Cube extends Shape{
	public void volume(){
		System.out.println("Volume of cube : "+size*size*size);
	}
}*/
class X{
	public void show(){System.out.println("From X");}
}
class Y extends X{
	@Override
	public void show(){super.show();System.out.println("From Y");}
}
class Z extends Y{
	@Override
	public void show(){super.show();System.out.println("From Z");}
}
public class inheritance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Z obj = new Z();
		obj.show();
    }
}