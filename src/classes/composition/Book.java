package classes.composition;

public class Book {

    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthor(Author[] authors) {
        this.authors = authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    @Override
    public String toString() {
        // return String.format(
        // "Book[name=%s, authors={Author[name=%s, email=%s, gender=%c]},price=%.2f, qty=%d", name,
        // authors[0].getName(), authors[0].getEmail(), authors[0].getGender(), price, qty);
        return String
                .format("Book[name=%s, authors={Author[name=%s, email=%s, gender=%c][name=%s, email=%s, gender=%c]},price=%.2f, qty=%d",
                        name, authors[0].getName(), authors[0].getEmail(), authors[0].getGender(),
                        authors[1].getName(), authors[1].getEmail(), authors[1].getGender(), price, qty);
    }
}
