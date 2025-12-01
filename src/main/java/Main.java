import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        Meat meat = new Meat(5, 100.0);
        Apple redApple = new Apple(10, 50.0, Colour.RED);
        Apple greenApple = new Apple(8, 60.0, Colour.GREEN);

        Food[] foods = {meat, redApple, greenApple};

        ShoppingCart cart = new ShoppingCart(foods);

        double totalWithoutDiscount = cart.getTotalPriceWithoutDiscount();
        double totalWithDiscount = cart.getTotalPriceWithDiscount();
        double vegetarianTotal = cart.getVegetarianTotalPrice();

        System.out.println("Общая сумма товаров без скидки: " + totalWithoutDiscount);
        System.out.println("Общая сумма товаров со скидкой: " + totalWithDiscount);
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + vegetarianTotal);
    }
}
