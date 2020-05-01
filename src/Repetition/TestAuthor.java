package Repetition;

public class TestAuthor {
    public static void main(String[] args){

        // Testing the Author Class
        Author author1 = new Author("Fjodor Dostojevskij", "fjodor@hotmail.com", 'm');
        System.out.println(author1);

        Author author2 = new Author("Ayn Rand", "ayn@hotmail.com", 'f');
        System.out.println(author2);

        Author author3 = new Author("Sjw", "socialism@hotmail.com", 'a');
        System.out.println(author3);
        author3.setGender('f');
        System.out.println(author3);

        Author[] authors = new Author[2];
        authors[0] = author1;
        authors[1] = author2;

        // Testing the Book Class
        System.out.println("");
        Book book1 = new Book("The idiot", author1, 9.9, 22);
        System.out.println(book1);

        // Testing the Book Class containing more than one author
        System.out.println("");
        BooksMoreThanOneAuthor bmtoa = new BooksMoreThanOneAuthor("Russian Novels Collection", authors, 22.3, 33);
        System.out.println(bmtoa);

    }
}
