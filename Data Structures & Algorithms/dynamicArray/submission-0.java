

class DynamicArray {
    private int[] arr;
    private int size; // Keep track of how many elements are actually added

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
        if (size == 0) return -1; // Or throw exception
        int p = arr[size - 1];
        arr[size - 1] = 0; // Optional: Reset to default
        size--;
        return p;
    }

    private void resize() {
        arr = Arrays.copyOf(arr, arr.length * 2);
    }

    public int getSize() {
        return size; // Much faster than looping every time
    }

    public int getCapacity() {
        return arr.length;
    }
    public int get(int i) {
    // Ideally, check if i < size to prevent accessing uninitialized indices
    return arr[i];
}

public void set(int i, int n) {
    // Ideally, check if i < size before setting
    arr[i] = n;
}

    
    // get and set methods remain the same...
}
