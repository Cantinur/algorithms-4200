public class Quicksort {
    public int count = 0;

    public <T extends Comparable<T>> void sort(T[] array){
        if (array == null){return;}
        quicksort(0, array.length-1, array);
    }

    private <T extends Comparable<T>> void quicksort(int low, int high, T[] array){
        if (low >= high){return;}

        int i = low;
        int j = high;
        String current = "";
        for (int k = i; k <= j; k++){
            current = current + "["+ array[k] + "]";
        }
        System.out.println("*******Current Array******");
        System.out.println(current);

        T pivot = array[low + (high - low)/2];

        System.out.println("PIVOT: " + pivot);

        while (i <= j){

            while(array[i].compareTo(pivot) < 0){
                i++;
            }

            while (array[j].compareTo(pivot) > 0){
                j--;
            }

            if(i <= j){
                count++;
                T temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;

                System.out.println("--------------------");
                for(int k = 0; k < array.length; k++){
                    String print = "";
                    if (array[k].compareTo(array[i-1]) == 0){
                        print = "-> [" + array[k] + "]";
                    }else if (array[k].compareTo(array[j+1]) == 0){
                        print = "-> [" + array[k] + "]";
                    }else {
                        print = "[" + array[k] + "]";
                    }
                    System.out.println(print);
                }
                System.out.println("--------------------");
            }
        }

        if (i < high){
            quicksort(i, high, array);
        }

        if (j > low){
            quicksort(low, j, array);
        }
    }
}