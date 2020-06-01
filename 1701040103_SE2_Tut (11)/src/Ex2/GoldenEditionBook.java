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
public class GoldenEditionBook extends Book{
    
    
    public GoldenEditionBook(String title, String author, double price){
        super(title,author,price);
    }
    @Override
    public double getPrice(){
        return super.getPrice()+super.getPrice()*0.3;
    }
    
    @Override
    public String toString(){
    return super.toString();
    }
}
