package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//make this abstract for final implementation
public class GraphADT<TNode, TEdge> implements IGraphADT<TNode, TEdge> {
	
	private Map<TNode, List<TNode>> graph;
	
	
	public GraphADT() {
		graph = new HashMap<>();
	}
	@Override
	public void addNode(TNode node) {
		if(node instanceof Node) {
			graph.putIfAbsent(node, new ArrayList<TNode>());
		}else {
			System.out.println("Vertices must extend class Node or be a direct instance of Node");
		}
		
	}
	
	@Override
	public void removeNode(TNode node) {
	    graph.values().stream().forEach(e -> e.remove(node));
	    graph.remove(node);
	}
	
	@Override
	public void addEdge(TNode u, TNode v) {
	    graph.get(u).add(v);
	}
	
	@Override
	public void removeEdge(TNode u, TNode v) {
	    List<TNode> adjacentNodesU = graph.get(u);
	    List<TNode> adjacentNodesV = graph.get(v);
	    if(adjacentNodesU != null) adjacentNodesU.remove(v);
	    if(adjacentNodesV != null) adjacentNodesV.remove(u);
	}
	
	public Map getGraph() {
		return graph;
	}
	
	
}
