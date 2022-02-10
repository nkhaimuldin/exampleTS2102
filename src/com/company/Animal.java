package com.company;

public class Animal {
    private String name;

    public Animal(String name){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeSound(){
        System.out.println("Unknown sound");
    }

    @Override
    public String toString() {
        return "Animal name " + name;
    }
}
