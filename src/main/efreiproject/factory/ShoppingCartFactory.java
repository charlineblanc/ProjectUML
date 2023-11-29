package efreiproject.factory;

import efreiproject.domain.ShoppingCart;

public class ShoppingCartFactory {
    public static ShoppingCart createShoppingCart( List<Book> books) {
        return new ShoppingCart();

    }
    public static ShoppingCart createShoppingCart( Book book) {
        return new ShoppingCart();

    }

    private static boolean isEmptyOrNull(String str) {
        return str == null || str.trim().isEmpty();
    }
}