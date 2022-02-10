package com.company;

public class Main {
    public static void main(String args){

        Animal animal = new Animal("Unknown animal");

        System.out.println(animal.toString());
        animal.makeSound();
    }
}
