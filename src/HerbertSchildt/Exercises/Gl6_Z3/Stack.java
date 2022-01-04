package HerbertSchildt.Exercises.Gl6_Z3;

class Stack {
    private char[] stck;
    private int x;

    Stack(int size) {
        stck = new char[size];
        x = 0;
    }

    Stack(Stack ob) {
        x = ob.x;
        stck = new char[ob.stck.length];

        for (int i = 0; i < x; i++) {
            stck[i] = ob.stck[i];
        }
    }

    Stack(char[] a) {
        stck = new char[a.length];

        for (int i = 0; i < a.length; i++) {
            push(a[i]);
        }
    }

    void push(char ch) {
        if (x == stck.length) {
            System.out.println("- Стек заполнен");
            return;
        }
        stck[x] = ch;
        x++;
    }

    char pop() {
        if (x == 0) {
            System.out.println("- Стек пуст");
            return (char) 0;
        }
        x--;
        return stck[x];

    }

    public static void main(String[] args) {
        Stack stack1 = new Stack(10);

        char name[] = {'T', 'o', 'm'};
        Stack stack2 = new Stack(name);
        int i;
        char ch;

        for (i = 0; i < 10; i++) {
            stack1.push((char) ('A' + i));
        }

        Stack stack3 = new Stack(stack1);

        System.out.print("Содержимое stack1: ");
        for (i = 0; i < 10; i++) {
            ch = stack1.pop();
            System.out.print(ch);
        }
        System.out.println("\n");

        System.out.print("Содержимое stack2: ");
        for (i = 0; i < 3; i++) {
            ch = stack2.pop();
            System.out.print(ch);
        }
        System.out.println("\n");

        System.out.print("Содержимое stack3: ");
        for (i = 0; i < 10; i++) {
            ch = stack3.pop();
            System.out.print(ch);
        }
    }
}