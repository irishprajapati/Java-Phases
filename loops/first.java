class first{
    public static void main(String[] args) {
        //lets understand how the for loop works
        // for(int i = 0; i<3; i++){
        //     System.out.println("i="+i);
        // }
        // for (int a = 0; a<10; ++a){
        //     //how the loops run are set as 
        //     // initialize the integer variable as 0 then 
        //     //when to stop write the boolen at there
        //     //then write post increment
        //     System.out.println("Hello: "+a);
        // for (int i = 0; i<3; i++){
        //     System.out.println("i:"+i);
        // }
        // for (int i = 3; i >0; i--){
        //     System.out.println(i + "");
        // }
        // for(int i = 0; i <5;){
        //     System.out.println(i + "");
        //     i++;
        // }
        for (int i = 0, j = 5; i < j; i++, j--) {
            System.out.print(i + ":" + j + " ");
        }
    }
}
