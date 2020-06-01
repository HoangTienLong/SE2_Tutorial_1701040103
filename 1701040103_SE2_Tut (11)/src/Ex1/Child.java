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
public class Child extends Person{
    public Child(String name, int age){
        super(name, age);
    }
    @Override
    public boolean validateAge(int age) {
        if(age >15){
            return false;
        }
       return super.validateAge(age);
    }
    @Override
    public String toString(){
        return super.toString();
    }
}
