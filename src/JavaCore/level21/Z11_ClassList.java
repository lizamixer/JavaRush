package JavaCore.level21;

import java.util.*;

/*
Общий список
1. Изменить класс Solution так, чтобы он стал списком. (Необходимо реализовать интерфейс java.util.List).
2. Список Solution должен работать только с целыми числами Long.
3. Воспользуйся полем original.
4. Список будет использоваться нитями, поэтому позаботься, чтобы все методы были синхронизированы.
Requirements:
1. Класс Solution должен реализовывать интерфейс List<Long>.
2. Класс Solution должен содержать private поле original типа ArrayList<Long>.
3. Все переопределенные в классе Solution методы интерфейса List должны вызывать соответствующие методы объекта original.
4. Все методы класса Solution, кроме метода main, должны быть синхронизированы.
 */

public class Z11_ClassList implements List<Long> {
    private ArrayList<Long> original = new ArrayList<Long>();

    public static void main(String[] args) {

    }

    @Override
    public synchronized int size() {
        original.size();
        return 0;
    }

    @Override
    public synchronized boolean isEmpty() {
        original.isEmpty();
        return false;
    }

    @Override
    public synchronized boolean contains(Object o) {
        original.contains(o);
        return false;
    }

    @Override
    public synchronized Iterator<Long> iterator() {
        original.iterator();
        return null;
    }

    @Override
    public synchronized Object[] toArray() {
        original.toArray();
        return new Object[0];
    }

    @Override
    public synchronized <T> T[] toArray(T[] a) {
        original.toArray(a);
        return null;
    }

    @Override
    public synchronized boolean add(Long aLong) {
        original.add(aLong);
        return false;
    }

    @Override
    public synchronized boolean remove(Object o) {
        original.remove(o);
        return false;
    }

    @Override
    public synchronized boolean containsAll(Collection<?> c) {
        original.containsAll(c);
        return false;
    }

    @Override
    public synchronized boolean addAll(Collection<? extends Long> c) {
        original.addAll(c);
        return false;
    }

    @Override
    public synchronized boolean addAll(int index, Collection<? extends Long> c) {
        original.addAll(0, c);
        return false;
    }

    @Override
    public synchronized boolean removeAll(Collection<?> c) {
        original.removeAll(c);
        return false;
    }

    @Override
    public synchronized boolean retainAll(Collection<?> c) {
        original.retainAll(c);
        return false;
    }

    @Override
    public synchronized void clear() {
        original.clear();
    }

    @Override
    public synchronized Long get(int index) {
        original.get(0);
        return null;
    }

    @Override
    public synchronized Long set(int index, Long element) {
        original.set(0, element);
        return null;
    }

    @Override
    public synchronized void add(int index, Long element) {
        original.add(0, element);
    }

    @Override
    public synchronized Long remove(int index) {
        original.remove(0);
        return null;
    }

    @Override
    public synchronized int indexOf(Object o) {
        original.indexOf(o);
        return 0;
    }

    @Override
    public synchronized int lastIndexOf(Object o) {
        original.lastIndexOf(o);
        return 0;
    }

    @Override
    public synchronized ListIterator<Long> listIterator() {
        original.listIterator();
        return null;
    }

    @Override
    public synchronized ListIterator<Long> listIterator(int index) {
        original.listIterator(0);
        return null;
    }

    @Override
    public synchronized List<Long> subList(int fromIndex, int toIndex) {
        original.subList(0, 1);
        return null;
    }
}

