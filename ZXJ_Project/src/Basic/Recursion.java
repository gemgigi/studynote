package Basic;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

public class Recursion {

	public static int test(int n){
		
		if(n == 0||n==1){
			return 1;
		}else{
			
			return n*test(n-1);
		}
		
	}
	
	public static void move(int n,String from,String to){
		System.out.println("move num "+n+"from "+from+" to "+to);
		
	}
	public static void hanoi(int n,String from,String mid,String to){
		
		if(n==1){
			move(1,from,to);
		}else{
			hanoi(n-1,from,to,mid);
			move(n,from,to);
			hanoi(n-1,mid,from,to);
		}
		
		
	}
	
	public static void main(String[] args) {
		//System.out.println(Recursion.test(5));
		hanoi(3,"A","B","C");
	}
}
