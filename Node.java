
public class Node
{
	public char label;
	public boolean visited = false;
	Node next;
	
	public Node(Node next)
	{
		this.next = next;
	}

}
