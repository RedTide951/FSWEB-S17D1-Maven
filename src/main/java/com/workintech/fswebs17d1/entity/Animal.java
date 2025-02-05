package com.workintech.fswebs17d1.entity;

public class Animal {
    private int id;
    private String name;

    public Animal(int integer, String name) {
        id = integer;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int integer) {
        id = integer;
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
                "Integer=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
