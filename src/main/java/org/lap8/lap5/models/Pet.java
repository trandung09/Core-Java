package org.lap8.lap5.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pet {

    private static int AUTO_INCREMENT_ID = 0;

    private final int id;
    private String name;
    private int age;
    private Gender gender;
    private String description;
    private Type type;
    private String image;

    public Pet(String name, int age, Gender gender, String description, Type type, String image) {

        this.id = AUTO_INCREMENT_ID++;

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.description = description;
        this.image = image;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", description='" + description + '\'' +
                ", gender=" + gender +
                ", type=" + type +
                ", image='" + image + '\'' +
                '}';
    }
}
