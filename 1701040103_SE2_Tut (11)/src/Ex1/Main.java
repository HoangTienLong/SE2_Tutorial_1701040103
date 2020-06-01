/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex1;

/**
 *
 * @author Win 8.1 Version 2
 */
public class Main {
    public static void main(String[] args){
        try{
        Person p1 = new Person("Phucnguyen", 2);
        Person p2 = new Child("phucnguyen",13);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        }catch(IllegalArgumentException ill){
            ill.printStackTrace();
        }
    }
}
