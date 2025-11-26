package in.problems.code.collection;

public class CustomArrayList<E> {
	
	private E[] data;
	private int size;
	private static final int DEFAULT_CAPCITY=10;
	
	@SuppressWarnings("unchecked")
	public CustomArrayList() {
		data=(E[])new Object[DEFAULT_CAPCITY];
		size=0;
	}
	@SuppressWarnings("unchecked")
	private void ensureCapcity() {
		if(size==data.length) {
			E[] newData=(E[]) new Object[data.length*2];
			System.arraycopy(data, 0, newData, 0, data.length);
			data=newData;
		}
	}
	// Add element at end
	public void add(E element) {
		ensureCapcity();
		data[size++]=element;
	}
	// Add element at given index
	public void add(int index,E eleement) {
		checkIndexForAdd(index);
		ensureCapcity();
		System.arraycopy(data, index, data, index+1, size - index);
		data[index]=eleement;
		size++;
	}
	
	public E get(int index) {
        checkIndex(index);
        return data[index];
    }

    // Set value at index
    public E set(int index, E element) {
        checkIndex(index);
        E old = data[index];
        data[index] = element;
        return old;
    }
	
	private void checkIndex(int index) {
		if(index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		}
	}
	
	private void checkIndexForAdd(int index) {
		if(index < 0 || index > size ) {
			throw new ArrayIndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		}
	}
	
	// Remove element at index
    public E remove(int index) {
        checkIndex(index);
        E removed = data[index];

        System.arraycopy(data, index + 1, data, index, size - index - 1);
        size--;
        data[size] = null; // avoid memory leak
        return removed;
    }

	 @Override
	    public String toString() {
	        StringBuilder sb = new StringBuilder("[");
	        for (int i = 0; i < size; i++) {
	            sb.append(data[i]);
	            if (i < size - 1) sb.append(", ");
	        }
	        sb.append("]");
	        return sb.toString();
	    }

	    // Main test
	    public static void main(String[] args) {
	        CustomArrayList<Integer> list = new CustomArrayList<>();
	        list.add(1);
	        list.add(2);
	        list.add(3);
	        list.add(3, 10);     // insert 10 at index 3
	        list.remove(2);      // remove element at index 2
	        System.out.println(list);
	    }

}
