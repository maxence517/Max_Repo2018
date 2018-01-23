import java.util.ArrayList;

public class Node {
	
	//Parameters of the nodes
	public int value;
	public int position; //0 to 5 for all the cases
	
	public ArrayList<Node> adjacencyList = new ArrayList<Node>(3);
	

	
	//Constructor for Nodes
	public Node(int value, int position) {
		
		this.value = value;
		this.position = position;
		
	}
	
	//Create connection to other nodes
	public void addNode(Node connect) {
		this.adjacencyList.add(connect);
		
	}
	//Set Value
	public void setValue(int newValue) {
		this.value = newValue;
		
	}
	
	//Return the value at the node
	public int toValue(){
		return value;
		
	}
	
	//Return the Position of the node (FIX)
	public int toPosition() {
		return position;
		
	}
	
}