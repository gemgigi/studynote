package Basic;

public abstract class AbstractClassTest {

	public abstract void a();
	public abstract void c();
	public void d(){};
}

//子类必须重写所有抽象方法，不然子类就要定义为acstract
class TestA extends AbstractClassTest{
	@Override
	public void a() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void c() {
		// TODO Auto-generated method stub
		
	}
	
	
}


