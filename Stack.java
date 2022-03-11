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
	 * 
	 * @param <T> item
	 * @return <T> item
	 */
	public T push(T item) {
		if(count==size) {
			grow();
		}
		arr[count] = item;
		count++;
		return item;
	}
	
	/**
	 * Peeks element on top of stack
	 * @return Object
	 */
	public Object peek() {
		return arr[count-1];
	}
	
	/**
	 * Removes the top element and returns that object
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
	 * 
	 * @param <T> item
	 * @return i - index or -1 if not found
	 */
	public int search(T item) {
		for(int i = 0;i<count;i++) {
			if(arr[i] == item) {
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
