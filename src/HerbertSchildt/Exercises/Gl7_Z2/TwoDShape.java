package HerbertSchildt.Exercises.Gl7_Z2;

abstract class TwoDShape {
    private double width;
    private double height;
    private String name;

    public TwoDShape () {
        width = height = 0.0;
        name = "none";
    }

    TwoDShape (double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    TwoDShape (double x, String n) {
        width = height = x;
        name = n;
    }

    TwoDShape (TwoDShape ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    double getWidth() {
        return width;
    }

    public void setWidth(double w) {
        width = w;
    }
    double getHeight() {
        return height;
    }

    public void setHeight(double h) {
        height = h;
    }

    public String getName() {
        return name;
    }

    abstract double area ();

    class Circle extends TwoDShape {

        Circle() {
            super();
        }

        public Circle(double x) {
            super(x, "circle");
        }

        public Circle(TwoDShape ob) {
            super(ob);
        }

        @Override
        double area() {
            return (getWidth()/2) * (getHeight()/2) * 3.1416;
        }
    }
}
