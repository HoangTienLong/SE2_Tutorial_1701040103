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
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) throws IllegalArgumentException {
        if(validateAge(age)==false || validateName(name)==false){
            throw new IllegalArgumentException("Constraint is wrong");
        }
        else{
            this.name = name;
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(validateName(name)){
        this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(validateAge(age)){
        this.age = age;
        }
    }
    public boolean validateAge(int age){
        boolean result = true;
        if(age<1){
         result = false;
        }
        return result;
    }
    public boolean validateName(String name) {
        boolean result = true;
        if(name.length()<3){
            result = false;
        }
        return result;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + '}';
    }
    
}
