public class Array {

    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        // If the array is full, resize it.
        if (count == items.length) {
            int[] newItems = new int[count * 2];
            System.arraycopy(items, 0, newItems, 0, count);
            items = newItems;
        }
        items[count++] = item;
    }

    public void print() {
        if (count == 0) {
            System.out.println("[]");
            return;
        }

        System.out.print("[");
        for (int i = 0; i < count; i++) {
            System.out.print(items[i]);
            if (i < count - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException("Invalid index: " + index);

        System.arraycopy(items, index + 1, items, index, count - index - 1);
        items[--count] = 0; // Clear the last element
    }

    public int indexAt(int index) {
        if(index < 0 || index >= count)
            throw new IllegalArgumentException("Invalid index: " + index);
        System.out.print(items[index]);
        return items[index];
    }

    public static void main(String[] args) {
        Array numbers = new Array(3); // Starting with a smaller size for demonstration
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(50);
        numbers.insert(100);// Triggers resizing
        //numbers.removeAt(0); // Removes the item at index 2
        numbers.print(); // Expected to print [10, 20, 40]
        numbers.indexAt(0);
    }
}
