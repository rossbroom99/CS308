package Graph;

public class Tester {

	public static void main(String[] args) {
			GraphADT graph = new GraphADT();
			for(int i=1;i<6;i++) {
				graph.addNode(new Node(new String("Station:" + Integer.toString(i)), i));
			}
			
			graph.addEdge(new Node(new String("Station:" + Integer.toString(1)), 1), new Node(new String("Station:" + Integer.toString(2)), 2));
			graph.addEdge(new Node(new String("Station:" + Integer.toString(2)), 2), new Node(new String("Station:" + Integer.toString(3)), 3));
			graph.addEdge(new Node(new String("Station:" + Integer.toString(3)), 3), new Node(new String("Station:" + Integer.toString(1)), 1));
			graph.addEdge(new Node(new String("Station:" + Integer.toString(4)), 4), new Node(new String("Station:" + Integer.toString(1)), 1));
			graph.addEdge(new Node(new String("Station:" + Integer.toString(1)), 1), new Node(new String("Station:" + Integer.toString(4)), 4));
			graph.addEdge(new Node(new String("Station:" + Integer.toString(1)), 1), new Node(new String("Station:" + Integer.toString(3)), 3));
			graph.addEdge(new Node(new String("Station:" + Integer.toString(5)), 5), new Node(new String("Station:" + Integer.toString(3)), 3));
			graph.addEdge(new Node(new String("Station:" + Integer.toString(5)), 5), new Node(new String("Station:" + Integer.toString(1)), 1));
			
			graph.getGraph().forEach((k,v)->System.out.println( k + ", Adjacent Stations: " + v));
	}

}
