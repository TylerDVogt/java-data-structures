public class Stack<T> {
	
	private static final int DEFAULT_SIZE = 10;
	private int count;
	private int size;
	private Object[] arr;
	
	public Stack() {
		arr = new Object[DEFAULT_SIZE];
		this.size = DEFAULT_SIZE;
	}
	
	/**
	 * Inserts top element O(1)
	 * @param <T> element
	 * @return <T> element
	 */
	public T push(T element) {
		if(count==size) {
			grow();
		}
		arr[count] = element;
		count++;
		return element;
	}
	
	/**
	 * Peeks element on top of stack without removing O(1)
	 * @return Object
	 */
	public Object peek() {
		return arr[count-1];
	}
	
	/**
	 * Removes the top element and returns that element O(1)
	 * @return Object
	 */
	public Object pop() {
		if(count == 0) {
			return null;
		}
		count--;
		return arr[count];
	}
	
	/**
	 * Sets all current elements to null
	 */
	public void clear() {
		for(int i = 0;i<size;i++) {
			arr[i] = null;
		}
		count = 0;
	}
	
	/**
	 * Searches for specified element O(n)
	 * @param <T> item
	 * @return i - index or -1 if not found
	 */
	public int search(T element) {
		for(int i = 0;i<count;i++) {
			if(arr[i] == element) {
				return i;
			}
		}
		return -1;
	}
	/**
	 * 
	 * @return size of stack
	 */
	public int getSize() {
		return size;
	}
	
	/**
	 * Displays the contents of the stack
	 */
	public void display() {
		for(int i = 0;i<count;i++) {
			System.out.println(arr[i]);
		}
	}

	private void grow() {
		size = (int)(size*1.5);
		Object[] temp = new Object[size];
		for(int i = 0;i<count;i++) {
			temp[i] = arr[i];
		}
		arr = temp;
	}
}
