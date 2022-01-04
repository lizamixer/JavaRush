package HerbertSchildt.Exercises.Gl8_Z1.qpack;

public class FixedQueue implements ICharQ {
    private char q[];
    private int putloc, getloc;

    public FixedQueue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    @Override
    public void put(char ch) {
        if (putloc == q.length) {
            System.out.println("-Очередь заполнена");
            return;
        }
        q[putloc++] = ch;
    }

    @Override
    public char get() {
        if (getloc == putloc) {
            System.out.println("-Очередь пуста");
            return (char) 0;
        }
        return q[putloc++];
    }
}
