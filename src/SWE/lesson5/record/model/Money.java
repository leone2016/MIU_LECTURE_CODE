package SWE.lesson5.record.model;

// this is a value object type  -- immutable

/**
 * there are 4 rules to make a class immutable:
 * 1. Declare the class as final so that it can't be extended.
 * 2. Make all fields private and final.
 * 3. Provide a constructor that initializes all fields.
 * 4. Don't provide setter methods for any fields.
 */
public final class Money {
    private final Double amount;
    private final String currency;

    public Money(String currency, Double amount) {
        this.currency = currency;
        this.amount = amount;
    }
    public Money(){
        this(null, null);
    }

    public String getCurrency() {
        return currency;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Money{" +
                "currency='" + currency + '\'' +
                ", amount=" + amount +
                '}';
    }
}
