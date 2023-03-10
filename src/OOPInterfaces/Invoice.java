package OOPInterfaces;
// Invoice class that implements Payable.

public class Invoice {

    private final String partNumber;
    private final String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {

        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity must be >= 0");
        }

        if (pricePerItem < 0) {
            throw new IllegalArgumentException("Price per item must be >= 0");
        }
    }

}
