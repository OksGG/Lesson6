package gusakova;

public abstract class Product {

    protected int price;
    protected String name;
    protected String discountCategory;

    public Product(int price, String name, String discountCategory) {
        this.price = price;
        this.name = name;
        this.discountCategory = discountCategory;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDiscountCategory() {
        return discountCategory;
    }
}

