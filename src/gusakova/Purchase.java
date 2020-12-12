package gusakova;

public class Purchase {

    Product[] purchasedProducts;
    DiscountPolicy policy;

    public Purchase(Product[] purchasedProducts, DiscountPolicy policy) {
        this.purchasedProducts = purchasedProducts;
        this.policy = policy;
    }

    public String getCheck() {
        double totalPrice = 0;

        StringBuilder bld = new StringBuilder();
        bld.append("Детализация покупок");
        for (int y = 0; y < purchasedProducts.length; y++) {
            double productPrice = policy.getModifiedPrice(purchasedProducts[y]);
            totalPrice+=productPrice;
            bld.append("\n");
            bld.append(purchasedProducts[y].getName() + ": " + productPrice);
        }
        bld.append("\n");
        bld.append("Итоговая цена " + totalPrice);
        return bld.toString();
    }

}

