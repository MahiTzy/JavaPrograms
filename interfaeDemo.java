interface School{
	void reg();
	void feeSub();
	void btcAlt();
}
abstract class Registration implements School{
	public void reg(){System.out.println("Registration Done!");}
}
abstract class FeeSubmission extends Registration{

	public void feeSub(){System.out.println("FeeSubmission Done!");}
}
class BatchAllotment extends FeeSubmission{

	public void btcAlt(){System.out.println("BatchAllotment Done!");}
}
public class interfaeDemo {
	public static void main(String[] args) {
		BatchAllotment obj = new BatchAllotment();
		obj.reg();
		obj.feeSub();
		obj.btcAlt();
    }
}