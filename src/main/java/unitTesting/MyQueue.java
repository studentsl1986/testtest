package unitTesting;

public interface MyQueue<E> {
    void put(E object);

    E poll();

    E peek();

    int size();
}
