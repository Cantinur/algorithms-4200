public class LinearSearch<T extends Comprable<T>>{

    public int search(T[] array, T value){
        for (int i = 0; i < array.length; i++){
            if (array[i].compareTo(value) == 0){
                return i;
            }
        }
        return -1;
    }
}