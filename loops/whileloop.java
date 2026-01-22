class whileLoop{
    public static void main(String[] args) {
    int x = 10;
    while ( x > 0){
        if ( x % 3 == 0) break; 
        System.out.println(x + "");
    }
    x--;
    }
}