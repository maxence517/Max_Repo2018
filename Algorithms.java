import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Algorithms {
	
	public ArrayList<String> States = new ArrayList<String>(1);
	
	public void BFS (NodeTable newTable) {
		
		//Create a queue to stack the possible event
		LinkedList<NodeTable> queue = new LinkedList<NodeTable>();
		
		//Add Current State in the ArrayList of state (Visited) already done by the NodeTable Class
		//and put the State in the queue
		queue.add(newTable);
		States.add("" + newTable.node_0.value + newTable.node_1.value + newTable.node_2.value + newTable.node_3.value + newTable.node_4.value + newTable.node_5.value);
		
		while(queue.size() !=0) {
			
			//Dequeue an event from the queue 
			newTable = queue.poll();
			newTable.printTable();
			
			//Get all the events possible from present state
			//If an event haven't occur yet, create this event and enqueue it
			
			Iterator<Node> i = newTable.pos.adjacencyList.listIterator(); 
			
			while(i.hasNext()) {
				Node actual = newTable.pos;
				Node next = i.next();
				NodeTable nextTable = newTable;
				nextTable.moveBlock(next);
				
				if(States.contains(nextTable.tablestate()) == false) {
					States.add(nextTable.tablestate());
					queue.add(nextTable);
					nextTable.printTable();
				}
				nextTable.moveBlock(actual);
			}
		}
		
		
	}
	
	public void DFS () {
		
	//TO DO
		
	}
	
	public void UCS () {
	
	//TO DO
	
	}
	
	public void ID () {
		
	//TO DO
		
	}

}
