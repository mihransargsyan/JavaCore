package homework.dynamicArray;

public class DynamicArray {

    // սա մեր հիմնական մասիվն է որտեղ պահելու ենք ավելացվող էլեմենտները
    private int[] array;
    // սա մեր մասիվիմեջ ավելացված էլեմենտների քանակն է
    private int size = 0;

    DynamicArray() {
        array = new int[10];
    }

    DynamicArray(int length) {
        array = new int[length];
    }


    // ստուգել եթե մասիվի մեջ տեղ չկա կանչել extend()
    // և ավելացնենք
    public void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;

    }

    // 1․ ստեղծել հին մասիվից 10 էլեմենտ ավելի մեծ մասիվ
    // 2․ քցել հին մասիվի էլեմենտները նորի մեջ
    // 3․ հին մասիվի հղումը կապենք նոր մասիվի հղման հետ
    private void extend() {
        int[] tmp = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }

    //եթե տրված ինդեքսը մեր ունեցած մասիվի ինդեքսի սահմաններում է, վարադարձնել մասիվի
    // index-երրորդ էլեմենտը, հակառակ դեպքում վերադարձնել -1։
    public int getByIndex(int index) {
        //  return index >= 0 && index < size ? index = array[index] : -1;
        if (index < 0 || index > size) {
            System.err.println("invalid index: ");
            return -1;
        }
        return array[index];
    }

    // տպել մասիվի ավելացված էլեմենտները
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    void delete(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++)
                array[i] = array[i + 1];
            size--;
        } else
            System.err.println("invalid index: ");

    }

    public void add(int[] numbers) {
        for (int number : numbers) {
            add(number);
        }
    }

    public void add(int value, int index) {
        if (size == array.length) {
            extend();
        }
        for (int i = size; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = value;
        size++;
    }

    public void set(int value, int index) {
        if (index >= 0 && index < size) {
            array[index] = value;
        } else
            System.err.println("invalid index: ");
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isExists(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }
}
