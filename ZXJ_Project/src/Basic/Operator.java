package Basic;

public class Operator {

	private static int num = 0;
	
	public void changeNum(){
		num += 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		short a = 1;
		a =(short)(a+ 1);
		
		
		//staic 
		Operator operator1 = new Operator();
		operator1.changeNum();
		System.out.println(num);
		Operator operator2 = new Operator();
		operator2.changeNum();
		System.out.println(num);
		
		//final
		final int a_final = 0;
		//a_final = 1
		final String str_fString = new String("abc");
	//	str_fString = str_fString+"efg";
		System.out.println(str_fString.concat("efg"));
		
		//String 内存
		
		String str = new String("hello world!");
		String str5 = new String("hello world!");
		System.out.println("*******************"+str==str5);
		
		String str1 = "abc";
		String str2 = "abc";
		String str3 = "hello world!";
		String str4 = str;
		//因为String 是final 的，所以修改后相当于新创建了一个String对象
		//str4 = str4+"hahah";
		System.out.println(str==str4);
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		//System.out.println("str == str3"+str == str3);
		System.out.println("str == str4"+str == str4);
		
		
		StringBuffer sb = new StringBuffer("Hello");
		StringBuffer sb2 = sb;
		sb2.append(",world!");
		System.out.println(sb);
		
		
		
		
	}

}
