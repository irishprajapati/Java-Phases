class third{
    public static void main(String[] args) {
        int age = 17;
        boolean hasCitizenship = true;

        if (age >= 18 && hasCitizenship) { //false first statement and second statement is true
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }

    }
}