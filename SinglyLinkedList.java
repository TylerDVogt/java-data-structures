
public class SinglyLinkedList<T> {
	
	private Node<T> head;
	private int size;
	
	/**
	 * Inserts at head O(1)
	 * @param <T> data
	 */
	public void insertFirst(T data) {
		Node<T> temp = head;
		head = new Node<T>(data);
		head.next = temp;
		size++;
	}
	
	/**
	 * Inserts at tail O(n)
	 * @param data
	 */
	public void insertLast(T data) {
		if(size==0) {
			insertFirst(data);
		}
		Node<T> temp = head;
		for(int i = 1;i<size;i++) {
			temp = temp.next;
		}
		temp.next = new Node<T>(data);
		size++;
	}
	
	/**
	 * Displays contents of the Singly Linked List
	 */
	public void display() {
		Node<T> node = head;
		for(int i = 0;i<size;i++) {
			System.out.println(node.data);
			node = node.next;
		}
	}
	
	
	
	public int getSize() {
		return size;
	}



	private class Node<E>{
		private Node<E> next;
		private E data;
		
		Node(E data){
			this.data = data;
			this.next = null;
		}
	}
}
