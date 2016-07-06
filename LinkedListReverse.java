import java.util.*;
import java.io.*;

/*Reverse linked list:
 * 1. Recursive
 * 2. Iterative
 * */

public class LinkedListReverse {
	
	//recursive
	public Node reverse1(Node head)
	{
		if(head==null || head.next == null)
		{
			return head;
		}
		
		Node newHead = reverse1(head.next); //reverse all but head
		head.next.next = head;
		head.next = null;
		
		return newHead;
		
	}
	
	//iterative
	public Node reverse2(Node head)
	{
		if(head==null || head.next == null)
		{
			return head;
		}
		
		Node prev = null;
		Node current = head;
		Node nextNode = null;
		
		while(current!=null)
		{
			nextNode = current.next;
			current.next = prev;
			prev = current;
			current = nextNode;
		}
		head = prev;
		
		return head;
	}

}
