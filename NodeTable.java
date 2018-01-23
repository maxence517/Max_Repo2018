
public class NodeTable{
	
	public Node node_0, node_1, node_2, node_3, node_4, node_5, pos;
	public String State;
	
	
	//Set the node with the correct value
	public NodeTable() {
		node_0 = new Node(1, 0);
		node_1 = new Node(4, 1);
		node_2 = new Node(2, 2);
		node_3 = new Node(5, 3);
		node_4 = new Node(3, 4);
		node_5 = new Node(0, 5);
		pos = node_5;
	
		//----Connection to node 0
		node_0.addNode(node_1);
		node_0.addNode(node_3);
		//----Connection to node 1
		node_1.addNode(node_0);
		node_1.addNode(node_2);
		node_1.addNode(node_4);
		//----Connection to node 2
		node_2.addNode(node_1);
		node_2.addNode(node_5);
		//----Connection to node 3
		node_3.addNode(node_0);
		node_3.addNode(node_4);
		//----Connection to node 4
		node_4.addNode(node_3);
		node_4.addNode(node_1);
		node_4.addNode(node_5);
		//----Connection to node 5
		node_5.addNode(node_4);
		node_5.addNode(node_2);
		
	}
	
	public void printTable() {
		
		System.out.println("Initial State ------- Progessive State");
		System.out.println("    1 4 2     ------- " + node_0.toValue() + " " + node_1.toValue() +  " " + node_2.toValue() );
		System.out.println("    5 3 0     ------- " + node_3.toValue() + " " + node_4.toValue() +  " " + node_5.toValue() );
		System.out.println("-------------------------");
		
	}
	
	public void moveBlock(Node next) {
		if(pos.adjacencyList.contains(next)) {
			int temp = pos.toValue();
			pos.setValue(next.value);
			next.setValue(temp);
			this.pos = next;
			State = ("" + node_0.value + node_1.value + node_2.value + node_3.value + node_4.value + node_5.value);
			
			//System.out.println("///Case 0 moved Successfully");
		}
		else {
			System.out.println("/// ERROR : Move not possible. The case with 0 can move can only move to adjacent case");
		}
	}
	
	//Copy Constructor
	public void CopyTable(NodeTable newtable) {
		this.node_0 = newtable.node_0;
		this.node_1 = newtable.node_1;
		this.node_2 = newtable.node_2;
		this.node_3 = newtable.node_3;
		this.node_4 = newtable.node_4;
		this.node_5 = newtable.node_5;
		
	}
	
	
	//Give the state as a string to keep memory of the previous states
	public String tablestate() {
		
		return State;
	}
	
	

}
