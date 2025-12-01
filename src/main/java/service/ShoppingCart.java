package service;

import model.Food;
import model.Discountable;

public class ShoppingCart {

    private Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    public double getTotalPriceWithoutDiscount() {
        double sum = 0.0;
        for (Food food : foods) {
            sum += food.getTotalPrice();
        }
        return sum;
    }

    public double getTotalPriceWithDiscount() {
        double sum = 0.0;
        for (Food food : foods) {
            double totalPrice = food.getTotalPrice();
            double discountPercent = 0.0;

            if (food instanceof Discountable) {
                discountPercent = ((Discountable) food).getDiscount();
            }

            double discountValue = totalPrice * discountPercent / 100.0;
            sum += (totalPrice - discountValue);
        }
        return sum;
    }

    public double getVegetarianTotalPrice() {
        double sum = 0.0;
        for (Food food : foods) {
            if (food.isVegetarian()) {
                sum += food.getTotalPrice();
            }
        }
        return sum;
    }
}
