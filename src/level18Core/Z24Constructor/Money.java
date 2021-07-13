package level18Core.Z24Constructor;

public abstract class Money {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public Money(double amount) {
        this.amount = amount;
    }

    public abstract String getCurrencyName();
}
/*
public abstract class Money {
    public Money(double amount) {
    }

    public abstract double getAmount();

    public abstract String getCurrencyName();
}
 */