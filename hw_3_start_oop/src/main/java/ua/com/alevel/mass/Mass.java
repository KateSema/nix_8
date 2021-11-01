package ua.com.alevel.mass;

public class Mass<T> {
    private Object[] array = new Object[0];
    private int pointer = 0;

    public void add(T item) {
        resize(array.length + 1); // увеличу в 2 раза, если достигли границ
        array[pointer++] = item;
    }

    public T get(int index) {
        return (T) array[index];
    }

    public void remove(int index) {
        for (int i = index; i < pointer - 1; i++)
            array[i] = array[i + 1];
        //array[pointer] = null;
        pointer--;
        resize(array.length - 1);
    }

    public int size() {
        return pointer;
    }

    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }
}
