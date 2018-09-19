package categories.composition;

public class TestAuthor {

    public static void main(String[] args) {
        Author ahTeck = new Author("Vlad", "vlad.marc@evozon.com", 'm');
        System.out.println(ahTeck);
        ahTeck.setEmail("newEmail@gmail.com");
        System.out.println("name is: " + ahTeck.getName());     // Test getter
        System.out.println("eamil is: " + ahTeck.getEmail());   // Test getter
        System.out.println("gender is: " + ahTeck.getGender()); // Test gExerciseOOP_MyPolynomial.pngetter
    }
}
