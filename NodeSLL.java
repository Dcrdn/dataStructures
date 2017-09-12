import java.io.IOException;

public class NodeSLL<N extends Comparable<N>> {
	    
		public final Comparable data;
	    public NodeSLL next;
	    public int index;
	    
	    public NodeSLL(Comparable data){
	        this.data = data;
	        this.next = null;
	    }

	    public boolean hasNext(){
	        return !(this.next==null);
	    }
	    
	    public String toString(){
	    	return this.data+"";
	    }

}
