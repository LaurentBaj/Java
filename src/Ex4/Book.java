package Ex4;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int quantity;

    // Getters and Setters
    public String getName(){
        return name;
    }
    public Author getAuthor(){
        return author;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public String getAuthorName(){
        return author.getName();
    }

    public String getAuthorEmail(){
        return author.getEmail();
    }
    public char getAuthorGender(){
        return author.getGender();
    }

    // Constructors
    public Book(String name, Author author, int quantity){
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, Author author, double price, int quantity){
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    // Output
    public String toString(){
        return "Book[name = " + this.name + ", Author[name = " + author.toString() + "], price = " +
                this.price + ", quantity = " + this.quantity;
    }
}
