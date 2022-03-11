public class Stack<T> {
	
	private static final int DEFAULT_SIZE = 10;
	private int count;
	private int size;
	private Object[] arr;
	
	public Stack() {
		arr = new Object[DEFAULT_SIZE];
		this.size = DEFAULT_SIZE;
	}

	public T push(T item) {
		if(count==size) {
			grow();
		}
		arr[count] = item;
		count++;
		return item;
	}
	
	public Object peek() {
		return arr[count-1];
	}
	public Object pop() {
		if(count == 0) {
			return null;
		}
		count--;
		return arr[count];
	}
	
	public void clear() {
		for(int i = 0;i<size;i++) {
			arr[i] = null;
		}
		count = 0;
	}
	
	public int getSize() {
		return size;
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
