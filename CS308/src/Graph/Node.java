package Graph;

import java.util.Objects;

//must extend this class to make stations and add specific functionality
public class Node extends Label implements IEdge {
	
	private int id; 
	
	public Node(Object label, int id) {
		super(label);
		this.id = id;
	}
	
	@Override
	public boolean equals(Object o) {
		
		if (o == this) return true;
        if (!(o instanceof Node)) {
            return false;
        }

        Node node = (Node) o;

        return id == node.getID() && this.getLabel().toString().equals(node.getLabel().toString());
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, getLabel().toString());
	}
	
	public int getID() {
		return this.id;
	}
	
	
}
