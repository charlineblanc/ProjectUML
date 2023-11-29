package efreiproject.factory;

import efreiproject.domain.Book;

public class BookFactory {

    public static Book createBook(String isbn, String title, String author, float price, String genre, int quantityAvailable) {
        if (isEmptyOrNull(isbn) || isEmptyOrNull(title) || isEmptyOrNull(author))
            return null;

        if (price <= 0)
            return null;

        return new Book.Builder()
                .setIsbn(isbn)
                .setTitle(title)
                .setAuthor(author)
                .setPrice(price)
                .setGenre(genre)
                .setQuantityAvailable(quantityAvailable)
                .build();
    }

    public static Book createBook(String title, String author, float price, String genre, int quantityAvailable) {
        if (isEmptyOrNull(title) || isEmptyOrNull(author))
            return null;

        if (price <= 0)
            return null;

        return new Book.Builder()
                .setTitle(title)
                .setAuthor(author)
                .setPrice(price)
                .setGenre(genre)
                .setQuantityAvailable(quantityAvailable)
                .build();
    }

    private static boolean isEmptyOrNull(String str) {
        return str == null || str.trim().isEmpty();
    }
}
