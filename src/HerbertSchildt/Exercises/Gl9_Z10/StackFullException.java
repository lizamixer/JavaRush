package HerbertSchildt.Exercises.Gl9_Z10;

class StackFullException extends Exception {
    int size;

    StackFullException (int s) {
        size = s;
    }

    public String toString() {
        return "\nСтек заполнен. Максимальный размер стека: " + size;
    }
}
