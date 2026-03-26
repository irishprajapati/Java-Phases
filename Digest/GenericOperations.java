package Digest;
enum Operations{
    ADD, SUBTRACT, MULTIPLY, DIVIDE;
    public <T extends Number> double apply(T a, T b){
        switch(this){
            case ADD -> {return a.doubleValue() + b.doubleValue();}
            case SUBTRACT -> {return a.doubleValue() - b.doubleValue();}
            case DIVIDE -> {return a.doubleValue() / b.doubleValue();}
            case MULTIPLY -> {return a.doubleValue() * b.doubleValue();}
            default->
                throw new  AssertionError("Unknowm exception: " + this);
        }
    }
}
public class GenericOperations{
    static void main(String[] args) {
        System.out.println(Operations.ADD.apply(10,20));
        System.out.println(Operations.SUBTRACT.apply(90,10));


    }
}