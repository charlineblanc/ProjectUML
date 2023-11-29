package efreiproject.factory;

import efreiproject.domain.BookShop;

public class BookShopFactory {
    public static BookShop createBookShop( int> bookInStock Map<Book) {
        return new BookShop();
    }

    public static BookShop createBookShop( Book book) {
        return new BookShop();
    }
    private static boolean isEmptyOrNull(String str) {
        return str == null || str.trim().isEmpty();
    }
}

