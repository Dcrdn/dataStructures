public class stackLinkedList {

	public class Node{
		public Node next;
		public Comparable node;
		
		public Node(Comparable node){
			this.node=node;
			this.next=null;
		}	
	}

	private Node top = null;
	
	public boolean isEmpty(){
		return(top==null);
	}
		
	public void push(Comparable data){
		Node node=new Node(data);
		node.next=this.top;
		this.top=node;
	}

	public Node pop(){
		if(!this.isEmpty()){
			this.top=this.top.next;
		}
		return this.top;
	}

	public void vaciarTodo(){
		this.top=null;
	}

	public Comparable peek(){
		if(!this.isEmpty()){
			return this.top.node;
		}
		else{
			return "";
		}
	}
	
}