package gusakova;

public class Main {
    public static void main(String[] args) {
        DiscountPolicy policy = new DiscountPolicy("Йогурт",0.75);

        Product prod = new FoodProduct(115, "Йогурт вишневый", "Йогурт");
        Product prod2 = new FoodProduct(120, "Йогурт абрикосовый", "Йогурт");
        Product prod3 = new FoodProduct(50, "Молоко 0,5л", "Молоко");
        Product prod4 = new FoodProduct(75, "Сок апельсиновый", "Сок");

        Purchase purchase = new Purchase(new Product[]{prod, prod2, prod3, prod4}, policy);

        System.out.println(purchase.getCheck());
    }
}
