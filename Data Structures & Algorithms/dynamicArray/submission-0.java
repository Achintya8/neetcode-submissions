

class DynamicArray {
    private int[] arr;
    private int size; 
    public DynamicArray(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    public void pushback(int n) {
        if (size == arr.length) {
            resize();
        }
        arr[size] = n;
        size++;
    }

    public int popback() {
        if (size == 0) return -1; 
        int p = arr[size - 1];
        arr[size - 1] = 0;
        size--;
        return p;
    }

    private void resize() {
        arr = Arrays.copyOf(arr, arr.length * 2);
    }

    public int getSize() {
        return size; 
    }

    public int getCapacity() {
        return arr.length;
    }
    public int get(int i) {
   
    return arr[i];
}

public void set(int i, int n) {
    
    arr[i] = n;
}

    
    // get and set methods remain the same...
}
