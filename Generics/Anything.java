package Generics;
public class Anything <T>{
        T printAnything;
        public Anything(T printAnything){
            this.printAnything = printAnything;
        }
    @Override
    public String toString() {
        return "Value: " + printAnything;
    }
}