package CollectionFramework;
import java.util.*;
public class Generics<T> {
    T value;

    public Generics(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
