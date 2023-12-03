package org.example.Entity;

public class Dancer extends Person{
    public Dancer(String name, int age) {
        super(name, age);
    }

    @Override
    public void getWalk() {
        System.out.println(" I'm " +getName()+ " My age " +getAge());}
}
