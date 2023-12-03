package org.example.Entity;

public class Singer extends Person{
    public Singer(String name, int age) {
        super(name, age);
    }

    @Override
    public void getWalk() {
        System.out.println(" I'm " + getName() + " My age " + getAge());
    }
}
