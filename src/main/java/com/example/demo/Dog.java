package com.example.demo;

public class Dog {
    private String privateName;
    private String breed;

    public Dog(String privateName, String breed) {
        this.privateName = privateName;
        this.breed = breed;
    }

    public String getPrivateName() {
        return privateName;
    }

    public void setPrivateName(String privateName) {
        this.privateName = privateName;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
