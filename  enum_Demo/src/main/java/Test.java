/**
 * Created by a07 on 17/1/9.
 */
public interface Test<T extends Comparable<T>> {
    T getMax(T[] arrays);
}
