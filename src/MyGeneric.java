public class MyGeneric<T, S> {
    private T t_attribute;
    private S s_attribute;

    MyGeneric(T t, S s) {
        this.t_attribute = t;
        this.s_attribute = s;
    }

    public S getS_attribute() {
        return s_attribute;
    }

    public T getT_attribute() {
        return t_attribute;
    }
}
