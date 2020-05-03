package Repetition.Ex7;

public class BooksMoreThanOneAuthor {
    private String name;
    private Author[] authors;
    private double price;
    private int quantity;

    // Constructors
    public BooksMoreThanOneAuthor(String name, Author authors[], double price){
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public BooksMoreThanOneAuthor(String name, Author authors[], double price, int quantity){
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.quantity = quantity;
    }

    // GS
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public String getAuthors() {
        String authorContainer = "";
        for (Author author:authors){
            authorContainer = authorContainer + author.getName() + ", ";
        }
        return authorContainer;
    }
    public String getEmails(){
        String emailContainer = "";
        for(Author author:authors){
            emailContainer = emailContainer + "," + author.getEmail();
        }
        return emailContainer;
    }
    public String getGenders(){
        String genderContainer = "";
        for(Author a:authors){
            genderContainer = genderContainer + "," + a.getGender();
        }
        return genderContainer;
    }

    // Methods
    public String toString(){
        return "Book[name = " + name + ", " + "authors [" + getAuthors() +
                "], price = " + price + ", quantity = " + quantity + "]";
    }
}
