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
public class Main {
        public static void main(String[] args){
            Book b1 = new Book("Phuc Nguyen","Grown up",30);
            Book b2 = new GoldenEditionBook("Phuc", "Hello World", 20);
            System.out.println(b1.toString());
            System.out.println(b2.toString());
            System.out.println(b2.getPrice());
        }
}
