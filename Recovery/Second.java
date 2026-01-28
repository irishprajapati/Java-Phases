class Second{
    public static void main(String[] args) {
        int x = 5;
        if( x>0){
            System.out.println("Positive");
        }
        else if( x > 3){
            System.out.println("Greater than 3");
        }
        else{
            System.err.println("Other");
        }
    }
}