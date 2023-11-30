package efreiproject.factory;

import efreiproject.domain.BookShop;
import efreiproject.util.Helper;

public class BookShopFactory {
    public static BookShop createBookShop(Map<Book,Integer> bookInStock) {
        if (bookInStock==null){
            return null;

        return new BookShop.Builder()
                .setBookInStock()
                .build();
        }
    }
}