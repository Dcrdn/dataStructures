
public class queueArray {

	private int tail,
				head;

	private Comparable[] q;
	
	public queueArray(int tamaño){
		this.q=new Comparable[tamaño];
		this.tail=this.head=-1;				
	}
	
	public Comparable rear(){
		if(this.isEmpty()){
			return -1;
		}
		else{
			return this.q[this.tail];
		}
	}
	
	public Comparable front(){
		if(this.isEmpty()){
			return -1;
		}
		else{
			return this.q[this.head];
		}
	}
	
	public boolean isEmpty(){
		if(this.tail==-1 && this.head==-1){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void enqueue(int data){
		if((this.tail+1)%this.q.length==this.head){
			System.out.println("overflow");
		}
		else if(this.isEmpty()){
			this.head++;
			this.tail++;
			this.q[head]=data;
		}
		else{
			tail=(tail+1)%this.q.length;
			this.q[tail]=data;
		}
	}
		
	public void dequeue(){
		if(this.isEmpty()){
			System.out.println("underflow");
		}
		else if(this.tail==this.head){
			this.q[this.head]=0;
			this.head=-1;
			this.tail=-1;
		}
		else{
			this.q[this.head]=0;
			this.head=(this.head+1)%this.q.length;
		}
	}
}
