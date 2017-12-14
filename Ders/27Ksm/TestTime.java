
public class TestTime {

	public static void main(String[] args) {
		Time t1=new Time();
		t1.setTime(23, 50, 40);
		
		System.out.println(t1.toString());
		
		System.out.println(t1.toUniversalString());
		System.out.println(t1.toStringg());
	}
}