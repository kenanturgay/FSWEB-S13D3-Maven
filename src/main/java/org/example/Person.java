package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;


    // Default constructor
    public Person(String firstName, String lastName, int age ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }




    public String getFirstName() {
        return this.firstName;
    }

    // Getter for lastName
    public String getLastName() {
        return this.lastName;
    }

    // Getter for age
    public int getAge() {
        return this.age;
    }

    // Method to check if person is a teen
    public boolean isTeen() {
        return this.age >= 13 && this.age <= 19;
    }
}
