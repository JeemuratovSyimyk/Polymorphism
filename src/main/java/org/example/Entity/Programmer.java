package org.example.Entity;

public class Programmer extends Person{
    public Programmer(String name, int age) {
        super(name, age);
    }

    @Override
    public void getWalk() {
        System.out.println(" I'm " + getName() + " My age " + getAge());

        }
    }
