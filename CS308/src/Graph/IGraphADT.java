package Graph;

public interface IGraphADT<TNode, TEdge> {

	void addNode(TNode node);

	void removeNode(TNode node);

	void addEdge(TNode u, TNode v);

	void removeEdge(TNode u, TNode v);
	
	
/*	void addNode(TNode node);
	void removeNode(TNode node);
	void addEdge(TNode start, TNode end);
	void removeEdge(TEdge edge);
	void addNode1(TNode node);*/
}
