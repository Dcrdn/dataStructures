
public class Principal {
	
	public static void main(String[] args) {
		
		simpleLinkedList ll=new simpleLinkedList();
		
		ll.add(2);
		ll.add(5);
		ll.add(10);
		ll.add(1);
		ll.add(50);
	
		ll.remove(0);
		ll.remove(1);
		
		System.out.println(ll.get(0));
		System.out.println(ll.get(1));
		System.out.println(ll.get(2));
		System.out.println(ll.get(3));
		
	}

}
