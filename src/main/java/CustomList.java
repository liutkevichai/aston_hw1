import java.util.Collection;

public interface CustomList<E> {
    void add(int index, E element);
    boolean remove(Object element);
    E remove(int index);
    E get(int index);
    E set(int index, E element);
    int indexOf(Object element);
    int lastIndexOf(Object element);
    boolean addAll(Collection<? extends E> c);
}
