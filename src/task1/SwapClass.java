package task1;

public class SwapClass <T> {

    T swap;

    public T[] swapElements(T[] array, int indexA, int indexB){
        swap = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = swap;
        return array;
    }

}
