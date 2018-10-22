public class Mergesort <T extends Comparable<T>> {
    public sort(T[] array){
        if (array == null){return null;}

        T[] buffer = (T[]) new Comparable[array.length];
        mergesort(0, array.length-1, array, buffer);
    }

    private void mergsort(int low, int high, T[] array, T[] buffer){
        if (low >= high){return;}
        int middel = low + (high-low)/2;

        mergsort(low, middel, array, buffer);
        mergsort(middel+1, high, array, buffer);
        merge(low, middel, high, array, buffer);
    }


    private <T extends Comparable<T>> void merge(int low, int middel, int high, T[] array, T[] buffer){
        for (int i = 0; i < array.length; i++){
            buffer[i] = array[i];
        }

        int i = low;
        int j = middel+1;

        for (int k = 0; k < array.length; k++){
            if(i > middel){
                array[k] = buffer[j++];

            } else if (j > high){
                array[k] = buffer[i++];
            }else {
                array[k] = array[j].compareTo(array[i]) < 0 ? array[j++] : array[i++];
            }
        }

    }
}