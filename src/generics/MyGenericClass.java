package generics;

/** * Generic version of the Box class.
 * @param <T> the type of the value being boxed
 */
public class MyGenericClass <T> {
    // T stands for "Type"
    private T t;

    /**
     * Generic method
     * @param t
     */
    public void set(T t) {
        this.t = t;
    }

    /**
     * Generic method
     * @return
     */
    public T get() {
        return t;
    }
}
