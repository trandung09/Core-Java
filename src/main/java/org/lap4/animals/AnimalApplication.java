package org.lap4.animals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnimalApplication {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private Animal[] animals;

    public void scanAllAnimals() throws IOException {

        int n;

        do {
            System.out.print("Enter number of animals: ");
            n = Integer.parseInt(br.readLine());

            if (n < 0) System.out.println("Invalid number of animals!");

        } while (n < 0);

        animals = new Animal[n];

        String name, description;
        boolean gender;

        for (int i = 0; i < n; i++) {

            System.out.print("Enter animal name: ");
            name = br.readLine();
            System.out.print("Enter animal gender(male/female): ");
            gender = br.readLine().equalsIgnoreCase("male");
            System.out.print("Enter animal description: ");
            description = br.readLine();

            animals[i] = new Animal(i, name, description, gender);
        }
    }

    public void printAllAnimals() {

        if (animals == null || animals.length == 0) {
            System.out.println("No animals found");
            return;
        }

        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    public void application() throws IOException {

        scanAllAnimals();
        printAllAnimals();
    }

    public static void main(String[] args) throws IOException {

        new AnimalApplication().application();
    }
}
