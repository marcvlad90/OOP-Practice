package classes.composition;

public class TestBook {

    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("vlad111", "vlad.marc@evozon111.com", 'm');
        authors[1] = new Author("vlad222", "vlad.marc@evozon222.com", 'm');
        System.out.println(authors[0]);
        Book dummyBook = new Book("Java for dummy", authors, 19.95, 22); // Test Book's
                                                                         // Constructor
        System.out.println(dummyBook);
        Book newBook = new Book("new book name", authors, 33.22, 33);
        System.out.println(newBook);

    }
}
