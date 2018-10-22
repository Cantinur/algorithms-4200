public class Mergsort <T extends Comparable<T>>{
    public void sort(T[] array){
        if(array == null){return;}

        T[] buffer = (T[]) new Comparable(array.length);

        mergsort(0, array.length-1, array, buffer);
    }

    private void mergsort(int low, int high, T[] array, T[] buffer){
        if(low >= high){return;}

        int middel  = low + (high -low)/2;
        mergsort(low, middel, array, buffer);
        mergsort(middel+1, high, array, buffer);
        merge(low, middel, high, array, buffer);
    }

    private void merge(int low, int middel, int high,T[] array, T[] buffer){
        for (int i = 0; i < array.length; i++){
            buffer[i] = array[i];
        }
        int i = low;
        int j = middel+1;


        for (int k = 0; k < buffer.length; k++){
            if (i > middel){
                array[k] = buffer[j++]; 
            }else if (j > high){
                array[k] = buffer[i++];
            } else {
                array[k] = (buffer[j].compareTo(buffer[i]) > 0) ? buffer[j++] : buffer[i++];
            }
        }
    }
}