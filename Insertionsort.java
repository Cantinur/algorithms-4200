public class Insertionsort <T extends Comparable<T>>{
    public sort(T[] array){
        if (array == null){return;}
    
        for (int i = 1; i < array.length; i++){
            for (int j = i-1; array.length; j++){
                if (array[j].compareTo(array[j+1]) > 0){
                    T temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }else {
                    break;
                }
            }
        }
    }
}