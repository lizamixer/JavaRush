package JavaCore.level22;

import java.util.List;

/*
Таблица
Измени класс TableInterfaceWrapper так, чтобы он стал Wrapper-ом для TableInterface.
Метод setModel должен вывести в консоль количество элементов в списке перед обновлением модели
(вызовом метода setModel у объекта типа TableInterface).
Метод getHeaderText должен возвращать текст в верхнем регистре - используй метод toUpperCase().

Requirements:
1. Класс TableInterfaceWrapper должен реализовывать интерфейс TableInterface.
2. Класс TableInterfaceWrapper должен инициализировать в конструкторе поле типа TableInterface.
3. Метод setModel() должен вывести в консоль количество элементов в новом листе перед обновлением модели.
4. Метод getHeaderText() должен возвращать текст в верхнем регистре.
5. Метод setHeaderText() должен устанавливать текст для заголовка без изменений.
 */

public class Z14_Decorator {
    public class TableInterfaceWrapper implements TableInterface {
        private TableInterface component;
        public TableInterfaceWrapper(TableInterface component) {
            this.component = component;
        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            component.setModel(rows);
        }

        @Override
        public String getHeaderText() {
            return component.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            component.setHeaderText(newHeaderText);
        }
    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}

/*
public class Solution {
    public class TableInterfaceWrapper {

    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}
 */