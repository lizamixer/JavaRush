package dop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class arraylistLinkedListTime {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5_000_000; i++) {
            list.add(new Integer(i));
        }

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {
            list.add(2_000_000, new Integer(Integer.MAX_VALUE));
        }
        System.out.println("Время работы для ArrayList (в миллисекундах) = " + (System.currentTimeMillis() - start));


        List<Integer> list2 = new LinkedList<>();

        for (int i = 0; i < 5_000_000; i++) {
            list.add(new Integer(i));
        }

        long start2 = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {
            list.add(2_000_000, new Integer(Integer.MAX_VALUE));
        }
        System.out.println("Время работы для LinkedList (в милисекундах) = " + (System.currentTimeMillis() - start));
    }
}

//Во-первых, доступ к элементу осуществляется в ArrayList за фиксированное время. Когда ты указываешь:
//list.add(2_000_000, new Integer(Integer.MAX_VALUE));
//то в случае с ArrayList [2_000_000] это конкретный адрес в памяти, ведь у него внутри массив.
//В то время как у LinkedList массива нет. Он будет искать элемент номер 2_000_000 по цепочке ссылок.
// Для него это не адрес в памяти, а ссылка, до которой еще надо дойти:
//fistElement.next.next.next.next.next.ext………
//В итоге при каждой вставке (удалении) в середине списка ArrayList уже знает точный адрес в
//памяти, к которому он должен обратиться, а вот LinkedList’у еще надо до нужного места “дотопать”.

//Во-вторых, дело в структуре самого ArrayList’a. Расширение внутреннего массива, копирование всех элементов
// и сдвиг элементов осуществляет специальная внутренняя функция — System.arrayCopy(). Она работает очень быстро,
// потому что специально оптимизирована для этой работы.
//А вот в ситуациях, когда “топать” до нужного индекса не нужно, LinkedList действительно показывает себя лучше.
// Например, если вставка происходит в начало списка.