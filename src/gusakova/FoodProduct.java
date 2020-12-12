package gusakova;

public class FoodProduct extends Product {

    private String expiryDate;

    public FoodProduct(int price, String name, String discountCategory) {
        super(price, name, discountCategory);
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
}
