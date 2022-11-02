package ru.dankras.collections;

public interface MyList<E> {
    void add(E object);

    void add(E object, int index);

    E get(int index);

    void remove(int index);

    int size();
}
