public class Test{
    public static void main(String[] args) {
        BinarySeach search = new BinarySeach<Integer>();
        Integer[] array = {1,2,3,4,5,6,7,8};
        int look = 6;

        System.out.println("Find adress of value " + look);
        System.out.println("It's on adress " + search.findAdress(0, array.length, array, look));
    }
}