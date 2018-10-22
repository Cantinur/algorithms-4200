public class Test{
    public static void main(String[] args) {
        Integer[] array = {9,32,5,4,1,2,7,8};
        Mergsort sort = new Mergsort();
        sort.sort(array);

        System.out.println("____________________");

        System.out.println("The sort alg used: " + sort.count + " swaps");
        String printable = "";
        for (int i = 0; i < array.length; i++){
            printable = printable + "["+array[i]+"]";
        }
        System.out.println(printable);
        System.out.println("--------------------");
    }
}

// BinarySeach search = new BinarySeach<Integer>();
// Integer[] array = {1,2,3,4,5,6,7,8};
// int look = 6;

// System.out.println("Find adress of value " + look);
// System.out.println("It's on adress " + search.findAdress(0, array.length, array, look));