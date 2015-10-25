package Basic;

import java.util.Date;

public class StringAndStringBuffer {

	public static void main(String[] args) {
		StringBuffer sbf = new StringBuffer();
		
		long startTime = System.currentTimeMillis();

		for(int i=0;i<200000;i++){
			sbf.append(i);
		}
		long endTime = System.currentTimeMillis();
		System.out.println((endTime-startTime)/1000f);
		
//		long startTime2 = System.currentTimeMillis();
//		String str = new String();
//		for(int i=0;i<200000;i++){
//			str += i;
//		}
//		System.out.println((System.currentTimeMillis()-startTime2)/1000f);
	}
}
