package Basic;



public class EqualsTest {
	
	public static void main(String[] args) {
		People a = new People(20, "男", "小王");
		People b = new People(20, "女", "小芳");
		System.out.println(a.getAge()==b.getAge());
		System.out.println(a.equals(b));
		
	
		
	}
}

class People{
	
	private int age;
	private String sex;
	private String name;
	public People(int age,String sex,String name){
		this.age = age;
		this.sex = sex;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public String getSex() {
		return sex;
	}
	public String getName() {
		return name;
	}
	
	public boolean equals(People people) {
		// TODO Auto-generated method stub
		return this.getAge()==people.getAge();
		
	}
	
}