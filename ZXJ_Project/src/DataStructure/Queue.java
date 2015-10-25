package DataStructure;

import java.util.Date;

public class Queue<T> {
	private Object[] elements;
	private int front = 0;
	private int rear = 0;
	private int capacity = 0;
	private static final int DEFAULT_SIZE = 10;

	public Queue() {
		this.capacity = DEFAULT_SIZE;
		elements = new Object[DEFAULT_SIZE];
	}
	public Queue(T data){
		this();
		elements[0] = data;
		rear++;
	}
	public Queue(T data,int initsize){
		this.capacity = initsize;
		elements = new Object[capacity];
		elements[0] = data;
		rear++;
	}
	public boolean isEmpty(){
		if(front == rear){
			return true;
		}
		return false;
	}
	
	public boolean isFullness(){
		if(rear > capacity - 1){
			return true;
		}
		return false;
	}
	
	public void addElement(T data){
		if(isFullness()){
			System.out.println("full");
			return;
		}
		elements[rear] = data;
		rear++;
	}
	public T removeElement() throws Exception{
		if(isEmpty()){
			throw new Exception("empty");
		}
		T removeDate = (T) elements[front];
		
		//利用整体移动元素解决假溢出
		int r = rear;
		for(int i = front;i<r;i++){
			elements[i] = elements[i+1];
			
		}
		rear--;
	//	front++;
		System.out.println("front = "+front);
		return removeDate;
		
	}
	public void traverse(){
		while(front!=rear){
			System.out.println(elements[front]);
			front++;
		}
		front = 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue = new Queue<String>("I");
		queue.addElement("L");
		queue.addElement("O");
		queue.addElement("V");
		queue.addElement("E");
		queue.addElement("Y");
		queue.addElement("O");
		queue.addElement("U");
		queue.traverse();
		try {
			System.out.println(queue.removeElement());
			System.out.println(queue.removeElement());	
			System.out.println(queue.removeElement());	
			System.out.println(queue.removeElement());	
			System.out.println(queue.removeElement());	
			System.out.println(queue.removeElement());	
			System.out.println(queue.removeElement());	
			System.out.println(queue.removeElement());
			queue.addElement("HHH");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
