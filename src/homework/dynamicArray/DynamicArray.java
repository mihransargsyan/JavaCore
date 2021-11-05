package homework.dynamicArray;

public class DynamicArray {

    // սա մեր հիմնական մասիվն է որտեղ պահելու ենք ավելացվող էլեմենտները
    private int[] array = new int[10];
    // սա մեր մասիվիմեջ ավելացված էլեմենտների քանակն է
    private int size = 0;

    // ստուգել եթե մասիվի մեջ տեղ չկա կանչել extend()
    // և ավելացնենք
    public void add(int value) {
        if (size < array.length) {
            array[size] = value;
            size++;
        } else
            extend();
    }

    // 1․ ստեղծել հին մասիվից 10 էլեմենտ ավելի մեծ մասիվ
    // 2․ քցել հին մասիվի էլեմենտները նորի մեջ
    // 3․ հին մասիվի հղումը կապենք նոր մասիվի հղման հետ
    private void extend() {
        int[] array2 = new int[array.length + 10];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            array2[index] = array[i];
            index++;
        }
        array = array2;
    }

    //եթե տրված ինդեքսը մեր ունեցած մասիվի ինդեքսի սահմաններում է, վարադարձնել մասիվի
    // index-երրորդ էլեմենտը, հակառակ դեպքում վերադարձնել -1։
    public int getByIndex(int index) {
        return index >= 0 && index < size ? index = array[index] : -1;
    }

    // տպել մասիվի ավելացված էլեմենտները
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
