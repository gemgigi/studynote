package Basic;

public class GetclassTest {
	
	public void test(){
		System.out.println(getClass().getName());
	}
	
	public static void main(String[] args) {
		new GetclassTest().test();
	}
}
