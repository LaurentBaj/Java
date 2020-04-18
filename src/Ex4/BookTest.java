package Ex4;

public class BookTest {
    public static void main(String[] args){
        Author author2 = new Author("Ben", "Ben@hgmail.com", 'm');
        Author author3 = new Author("Jennie", "Jennie@hgmail.com", 'f');
        Book theIdiot = new Book("The Idiot", author2, 22.4, 33);
        System.out.println(theIdiot);
    }
}
