package com.example.greeting;

public class Character {
    private String name;
    private int age;
    private double bounty;

    public Character(String name, int age, double bounty) {
        this.name = name;
        this.age = age;
        this.bounty = bounty;
    }
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getBounty() {
        return this.bounty;
    }
}
