public class Mergsort <T extends Comparable<T>>{
    public int count = 0;

    public <T extends Comparable<T>> void sort(T[] array){
        if(array == null){return;}

        T[] buffer = (T[]) new Comparable[array.length];

        mergsort(0, array.length-1, array, buffer);
    }

    private <T extends Comparable<T>> void mergsort(int low, int high, T[] array, T[] buffer){
        if(low >= high){return;}

        int middel  = low + (high -low)/2;
        mergsort(low, middel, array, buffer);
        mergsort(middel+1, high, array, buffer);
        merge(low, middel, high, array, buffer);
    }

    private <T extends Comparable<T>>  void merge(int low, int middel, int high,T[] array, T[] buffer){
        for (int i = 0; i < array.length; i++){
            buffer[i] = array[i];
        }
        int i = low;
        int j = middel+1;
        
        String printable = "";
        for(int k = i; k <= high; k++){
            printable = printable + "["+array[k]+"]";
        }
        System.out.println(printable);

        System.out.println("--------------------");
        for (int k = low; k <= high; k++){
            printable = "["+array[k]+"]";
            if (i > middel){
                array[k] = buffer[j++]; 
                printable = "[ -->"+ array[k] + "]";
            }else if (j > high){
                array[k] = buffer[i++];
                printable = "[ -->"+ array[k] + "]";
            } else {
                array[k] = (buffer[j].compareTo(buffer[i]) < 0) ? buffer[j++] : buffer[i++];
                printable = "[ ->"+ array[k] + "<-]";
            }
            count++;
            System.out.println(printable);
        }
        System.out.println("--------------------");
    }
}