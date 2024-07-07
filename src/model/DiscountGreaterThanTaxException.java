package model;

public class DiscountGreaterThanTaxException extends Exception {
    public DiscountGreaterThanTaxException(String message) {
        super(message);
    }
}
