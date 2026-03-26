package Digest;
public  class GenericMethod{
    static void main(String[] args) {
        String [] method = {"Hello", "Data"};
        Integer [] data = {1,2,3,4,5};
        printArray(method);
        printArray(data);
        display(10.90);
    }
    public static <T> void display(T element){
        System.out.println(" Generic Display: " + element);
    }
    public static void display(Integer element){
        System.out.println("Integer display: " + element);
    }
    public static <T> void printArray(T[] array){
        for(T element: array){
            System.out.println(element + " ");
        }
        System.out.println();
    }
}