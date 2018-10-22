//Data must be storted

public class BinarySeach <T extends Comparable<T>>{
    
    
    public int findAdress(int low, int high, T[] array, T value){
        if(array == null){return -1;}

        int mid = low + (high - low)/2;
        System.out.println("-----------------------------");
        System.out.println("Mid = " + low + " + " +"("+ high + " - "+ low + ")/2 = "+ mid + " => " + array[mid]);

        if (array[mid].compareTo(value) == 0){
            System.out.println(array[mid] + " - " + value +" == 0 TRUE");
            return mid;
        }else if (array[mid].compareTo(value) > 0){
            System.out.println(array[mid] + " - " + value +" < 0 TRUE");
            high = mid - 1;
            System.out.println("High: "+mid+" - 1 = " + high + " => " + array[high]);
            return findAdress(low, high, array, value);
        }else if (array[mid].compareTo(value) < 0){
            System.out.println(array[mid] + " - " + value +" > 0 TRUE");
            low = mid + 1;
            System.out.println("Low: "+mid+" + 1 = " + low + " => " + array[low]);
            return findAdress(low, high, array, value);
        }

        return -1;
    }
}

// Value == 7
// [1,2,3,4,5,6,7,8]
// mid = 0 + (8-0)/2 = 4 => 5
// if 5.comapreTo(7) < 0 => 5 -7 = -2 TRUE
// low = 4 + 1 = 5 => 6
// findAdress(6, 7, array, 7)
// mid = 6 + (8 - 6)/2 = 7 => 8 
// if 8 == 7 FALSE
// if 8.comapreTo(7) > 0 => 8 -7 = 1 TRUE
// high = 7 - 1 = 6
// findAdress(6, 6, array, 7)
// mid = 6 + (6-6)/2 = 6 => 7 
// if 7 == 7 TRUE!