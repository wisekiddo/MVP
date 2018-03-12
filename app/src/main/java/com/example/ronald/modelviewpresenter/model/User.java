package com.example.ronald.modelviewpresenter.model;

/**
 * Created by ronald on 6/3/18.
 *
 * Model-Typically represents a real world object that is related to the problem or domain space.
 * While programming, we create classes to represent them. These classes, known as models,
 * have some properties and methods (defining their behavior) in a particular domain space.
 *
 */

public class User {
    private int id;
    private String firstName;
    private String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
}
