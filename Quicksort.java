public class Quicksort{
    public <T extends Coparable<T>> void sort(T[] array){
        if(array == null){return;}
        quicksort(0, array.length-1, array);
    }

    private void quicksort(int low, int high, T[] array){
        int i = low;
        int j = high;
        int piv = low + (high-low)/2;

        while(i <= j){
            while (array[i].compareTo(piv) < 0){
                i++;
            }

            while (array[j].compareTo(piv) > 0){
                j--;
            }

            if(i <= j){
                T temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (j > low){
            quicksort(low, j, array);
        }

        if (i < high){
            quicksort(i, high, array);
        }
    }
}