public class firstarray{
    public static void main(String[] args) {
        int nums[] = {1,6,7,9};
        nums[1] = 5;//assigned value to 5 of index 1
        System.out.println(nums[1]);
        int data[] = new int[4];
        data[0] = 9;
        data[1] = 0;
        data[2] = 3;
        data[3] = 1;
        for(int i = 0; i<=3; i++){
            System.out.println(data[i]);

        }
    }
    
}