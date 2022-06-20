package com.learning.Challange;

public class User {
    int id;
    private String firstName;
    private String lastName;

    public User() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        builder.append("User").append("id=").append(id)
        .append("firstName=").append(firstName)
        .append("lastName=").append(lastName);
    

        return builder.toString();
    }

}
