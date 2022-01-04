package HerbertSchildt.Exercises.Gl8_Z1.qpack;

//динамическая очередь
public class DynQueue implements ICharQ {
    private char q[];
    private int putloc, getloc;

    public DynQueue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    @Override
    public void put(char ch) {
        if (putloc == q.length) {
            char t[] = new char[q.length * 2];
            for (int i = 0; i < q.length; i++) {
                t[i] = q[i];
            }
            q = t;
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
