import mypack.myutil;
class Main{
public static void main(String[] args) {
	myutil obj = new myutil();
	int Add = obj.add(4,5);
	int Greatest = obj.greatest(4,5);
		
	System.out.println("Addition : "+Add);
	System.out.print("Greatest : "+Greatest);
    }
}