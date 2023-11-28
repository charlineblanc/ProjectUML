package efreiproject.domain;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private float price;

    private Book() {}


    public Book(Builder builder) {
        this.isbn = builder.isbn;
        this.title = builder.title;
        this.author = builder.author;
        this.price = builder.price;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public float getPrice() {
        return price;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    public static class Builder {
        private String isbn;
        private String title;
        private String author;
        private float price;


        public Builder setIsbn(String isbn) {
            this.isbn = isbn;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public Builder setPrice(float price) {
            this.price = price;
            return this;
        }
        public Book build() {
            return new Book(this);
        }
    }
}
