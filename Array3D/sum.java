public class sum{
    public static void main(String[] args) {
        int [] arr = {5,10,15,20}; //printing the sum of the array
        int sum = 0; //declaring the memory space in JVM
        for(int i = 0; i<arr.length; i++){ //initialization, condition and updation
            sum +=arr[i]; //adding the each value inside of array from index i
        }
        System.out.println(sum);//printing the sum
    }
}