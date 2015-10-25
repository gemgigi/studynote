package DataStructure;



public class LinkedList{

	private Node head; //头结点
	private Node tail; //尾节点
	private int size;
	

	public LinkedList(){
		this.head = null;
		this.tail = null;
	}
	
	public int getSize() {
		return size;
	}
	
	
	//尾插法
	public void addNodeByTailInsert(String data){
		if(head!=null){
			Node node = new Node(data,null);
			tail.setNext(node);
			tail = node;
		}else{
			head = tail = new Node(data,null);
			
		}
		size++;
	}
	
	//头插法
	public void addNode(String data){
		if(head!=null){
			if(data==""){
				Node node = new Node(null,head);
				head = node;
			}else{
				Node node = new Node(data,head);
				head = node;
			}
			size++;
		}else{
			head = new Node(data,null);
			size++;
		}
	}
	public void removeNode(int index){
		int count = 0;
		for(Node current = head;current!=null;current = current.getNext()){
			if(count == index - 1){
				//如果被删除是最后一个节点
				if(count == size - 1){
					current.setNext(null);
				}else{
					current.setNext(current.getNext().getNext());
				}
				size--;
				return;
			}
			count++;
		}
		
	}
	public void findNode(int index){

		int count = 0;
		for(Node current = head;current!=null;current = current.getNext()){
			if(count == index){
				System.out.print("当前是第"+index+"个结点： 数据为： "+current.getData()+" ");
				break;
			}
			count++;
		}
		
	}
	
	public void printLinkedList(){
		Node current = head;
		System.out.println("链表大小为："+getSize());
	    while(current!=null){
			System.out.print(current.getData()+" ");
			current = current.getNext();
		}
	}

	public static void main(String[] args) {
		LinkedList linkedList1 = new LinkedList();
		LinkedList linkedList2 = new LinkedList();
		String[] datas = {"!","U","O","Y","E","V","O","L","I",""};
		System.out.println("头插法：");
		for(String s:datas){
			linkedList1.addNode(s);
		}
		System.out.println("删除前:");
		linkedList1.printLinkedList();
		System.out.println();
		System.out.println("尾插法：");
		for(String s:datas){
			linkedList2.addNodeByTailInsert(s);
		}
		System.out.println("删除前:");
		linkedList2.printLinkedList();
		
		
//		System.out.println();
//		linkedList.removeNode(5);
//		System.out.println("删除后");
//		linkedList.printLinkedList();
//		System.out.println();
//		linkedList.findNode(5);
		
	}
	
}
class Node{
	private Node next;
	private Object data;
	public Node(Object data,Node next){
		this.data = data;
		this.next = next;
	}
	public Node(Node next){
		this.next = next;
	}
	public Node getNext() {
		return next;
	}
	public Node setNext(Node next) {
		return this.next = next;
	}
	public Object getData() {
		return data;
	}
	public Object setData(Object data) {
		return this.data = data;
	}

		
	
}
