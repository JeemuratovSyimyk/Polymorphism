package org.example;

import org.example.Entity.Dancer;
import org.example.Entity.Person;
import org.example.Entity.Programmer;
import org.example.Entity.Singer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Person[] people = {
                new Programmer("Syimyk",21),
                new Dancer("Aizada",18),
                new Singer("Meerim",20)};

        for (Person person: people)
            person.getWalk();
    }
}
