package newHomework.dynamicArray;

public class DynamicArray {

    private int[] array;
    private int size = 0;

    DynamicArray() {
        array = new int[10];
    }

    void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    private void extend() {
        int[] tmp = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public int getByIndex(int index) {
        if (index > 0 && index < size) {
            return array[index];
        }
        System.err.println("invalid index ");
        return -1;
    }

    public void delete(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                array[i] = array[i + 1];
            }
            size--;
        } else System.err.println("invalid index " + index);
    }

    public void add(int[] numbers) {
        for (int number : numbers) {
            add(number);
        }
    }

    public void add(int value, int index) {
        if (index < 0 || index > size) {
            System.err.println("invalid index " + index);
        } else {
            if (size == array.length) {
                extend();
            }
            for (int i = size; i >= index; i--) {
                array[i + 1] = array[i];
            }
            array[index] = value;
            size++;
        }
    }

    public void set(int value, int index) {
        if (index < 0 || index > size) {
            System.err.println("invalid index " + index);
        } else {
            array[index] = value;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isExists(int velue) {
        for (int i = 0; i < size; i++) {
            if (array[i] == velue) {
                return true;
            }
        }
        return false;
    }

}
