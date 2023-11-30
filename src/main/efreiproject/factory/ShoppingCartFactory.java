package efreiproject.factory;

import efreiproject.domain.ShoppingCart;


public class ShoppingCartFactory {
    public static ShoppingCart createShoppingCart( List<Book> books) {
        if (books == null) {
            return null;

        return new ShoppingCart.Builder()
                .setBooks()
                .build();

        }
    }
}