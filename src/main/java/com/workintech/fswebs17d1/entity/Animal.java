package com.workintech.fswebs17d1.entity;

public class Animal {
    private int Integer;
    private String name;

    public Animal(int integer, String name) {
        Integer = integer;
        this.name = name;
    }

    public int getInteger() {
        return Integer;
    }

    public void setInteger(int integer) {
        Integer = integer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "Integer=" + Integer +
                ", name='" + name + '\'' +
                '}';
    }
}
