/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex2;

/**
 *
 * @author Win 8.1 Version 2
 */
public class Book {
    protected String title;
    protected String author;
    protected double price;
    
    public Book(String title, String author, double price){
        this.setTitle(title);
        this.setAuthor(author);
        this.setPrice(price);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title)throws IllegalArgumentException  {
        if(title.length()<3){
            throw new IllegalArgumentException("Author's length must bigger than 3");
        }
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author)throws IllegalArgumentException {
        if (author.contains(" ")){
            String[] sp = author.split(" ");
           char[] charAray = sp[1].toCharArray();
           boolean check = Character.isDigit(charAray[0]);
           if(check){
               throw new IllegalArgumentException("Author must start with character");
           }
        }
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price)throws IllegalArgumentException {
        if(price<= 0){
            throw new IllegalArgumentException("Price must bigger than 0");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", price=" + price + '}';
    }
    
}
