package com.example.mvc.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Customer {

    @NotNull(message = "first name is required")
    @Size(min=1,message = "first name must be of 1 character")
    private String firstName;

    @NotNull(message = "last name is required")
    @Size(min=1,message = "last name must be of 1 character")
    private String lastName;

    public @NotNull(message = "first name is required") @Size(min = 1, message = "first name must be of 1 character") String getFirstName() {
        return firstName;
    }

    public void setFirstName(@NotNull(message = "first name is required") @Size(min = 1, message = "first name must be of 1 character") String firstName) {
        this.firstName = firstName;
    }

    public @NotNull(message = "last name is required") @Size(min = 1, message = "last name must be of 1 character") String getLastName() {
        return lastName;
    }

    public void setLastName(@NotNull(message = "last name is required") @Size(min = 1, message = "last name must be of 1 character") String lastName) {
        this.lastName = lastName;
    }
}
