package SWE.lesson5.record.model;

public record MoneyRecord(
    String currency,
    Double amount
){
    public MoneyRecord {
        if (currency == null || currency.isBlank()) {
            throw new IllegalArgumentException("Currency cannot be null or blank");
        }
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }

    }

    @Override
    public String toString() {
        return "MoneyRecord{" +
                "currency='" + currency + '\'' +
                ", amount=" + amount +
                '}';
    }
}
