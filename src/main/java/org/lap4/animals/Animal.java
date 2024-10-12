package org.lap4.animals;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
public class Animal {

    private int id;
    private String name;
    private String description;
    private boolean gender;

    public Animal(String name, boolean gender) {
        this.name = name;
        this.gender = gender;
    }

    public Animal(String name, boolean gender, String description) {
        this.name = name;
        this.gender = gender;
        this.description = description;
    }

    public String toString() {

        return "Animal info:"
                + "\n\t\tName: " + this.name
                + "\n\t\tGender: " + this.gender
                + "\n\t\tDescription: " + this.description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal animal)) return false;
        return id == animal.id && gender == animal.gender && Objects.equals(name, animal.name) && Objects.equals(description, animal.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, gender);
    }
}
