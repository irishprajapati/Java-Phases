public class enhanced{
    public static void main(String[] args) {
        int nums[] = new int[5];
        nums[0] = 9;
        nums[1] = 4;
        nums[2] = 8;
        nums[3] = 1;
        nums[4] = 2;
        for( int n: nums){ //give me one value at a time which will go to n
            System.out.println(n);
        }
    }
}