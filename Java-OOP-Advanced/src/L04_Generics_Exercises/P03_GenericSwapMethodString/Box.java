package L04_Generics_Exercises.P03_GenericSwapMethodString;

public class Box<T> {
    private T value;
    
    public Box(T value) {
        this.value = value;
    }
    
    @Override
    public String toString() {
        return this.value.getClass().getName()+ ": " + this.value;
    }
}
