package Linklist;

public interface LinkListADT<E> {
    void add(E item);
    E remove();
    int search(E item);
    void print();

}