package JavaCollections.level26.Z13_AbstractList;


import java.io.Serializable;
import java.util.*;

class CustomTree extends AbstractList<String> implements Cloneable, Serializable {
    Entry<String> root; //4
    List<Entry<String>> list = new ArrayList<>(); //4

    @Override
    public String get(int index) {
        throw new UnsupportedOperationException();  //2 добавила выхов исколючения
    }

    public CustomTree() { //4 добавили и описали конструктор
        this.root = new Entry<>("0");
        list.add(root);
    }

    @Override
    public int size() {
        return list.size() - 1; //4
    }

    @Override
    public String set(int index, String element) {
        throw new UnsupportedOperationException(); //2 добавила выхов исколючения
    }

    public String remove(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean add(String s) {
        Entry<String> entry = new Entry<>(s);

        for (Entry currEntry : list) {
            if (currEntry.isAvailableToAddChildren()) {
                if (currEntry.availableToAddLeftChildren) {
                    currEntry.leftChild = entry;
                    currEntry.availableToAddLeftChildren = false;
                    entry.parent = currEntry;
                    list.add(entry);
                    return true;
                } else if (currEntry.availableToAddRightChildren) {
                    currEntry.rightChild = entry;
                    currEntry.availableToAddRightChildren = false;
                    entry.parent = currEntry;
                    list.add(entry);
                    return true;
                }
            }
        }
        return false;
    }

    // Рекурсивная функция для обхода дерева в глубину
    public void treePassed(Entry<?> element) { //5 добавила метод
        if (element == null) {
            return; //выходим из цикла
        }
        treePassed(element.leftChild); //проходим сначала в глубину по левою сторону
        treePassed(element.rightChild); //потом по правой
        list.remove(element); //каждый раз проходя цикл удаляем вершину
    }

    public boolean remove(Object o) { //5 добавила метод
        if (!(o instanceof String)) throw new UnsupportedOperationException();
        Entry<String> element = null;
        Entry<String> elementParent = null;

        for (Entry<String> stringEntry : list) { //нашли элемент и родителя чтобы потом с ним работать
            if (o.equals(stringEntry.elementName)) {
                element = stringEntry;
                elementParent = element.parent;
                break;
            }
        }

        treePassed(element);

        if (elementParent.leftChild == element) { //добавляем rooty возможность добавлять детей
            //elementParent.leftChild = null;
            elementParent.availableToAddLeftChildren = true;
        } else {
            //elementParent.rightChild = null;
            elementParent.availableToAddRightChildren = true;
        }
        return true;
    }

    public String getParent(String s) {
        try {
            for (Entry<String> stringEntry : list) {
                if (s.equals(stringEntry.elementName)) {
                    return stringEntry.parent.elementName;
                }
            }
        } catch (NullPointerException e) {
        }
        return null;
    }

    public List<String> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException(); //2 добавила выхов исколючения
    }

    protected void removeRange(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException(); //2 добавила выхов исколючения
    }


    public boolean addAll(int index, Collection<? extends String> c) {
        throw new UnsupportedOperationException(); //2 добавила выхов исколючения
    }

    static class Entry<T> implements Serializable { //3 добавила класс с контсурктором и методом
        String elementName;
        boolean availableToAddLeftChildren;
        boolean availableToAddRightChildren;
        Entry<T> parent;
        Entry<T> leftChild;
        Entry<T> rightChild;

        public Entry(String elementName) {
            this.elementName = elementName;
            this.availableToAddLeftChildren = true;
            this.availableToAddRightChildren = true;
        }

        public boolean isAvailableToAddChildren() {
            return availableToAddLeftChildren || availableToAddRightChildren;
        }

    }
}