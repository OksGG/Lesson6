package gusakova;

public class DiscountPolicy {

    private String currentDicountCategory;
    private double currentDiscountValue;

    public DiscountPolicy(String currentDicountCategory, double discountValue) {
        this.currentDicountCategory = currentDicountCategory;
        this.currentDiscountValue = discountValue;
    }

    public double getModifiedPrice(Product product) {
        double price = 0;
        if (product.getDiscountCategory().equals(currentDicountCategory)) {
            price = product.getPrice() * currentDiscountValue;
        } else {
            price = product.getPrice();
        }
        return price;
    }


}
