package org.lap8.lap5.services;

import org.lap8.lap5.models.Gender;
import org.lap8.lap5.models.Pet;
import org.lap8.lap5.models.Type;

import java.io.BufferedReader;
import java.io.IOException;

public class PetService {

    private PetService() {
    }

    public Pet getPet(BufferedReader br) throws IOException {

        System.out.print("Enter pet name: ");
        String petName = br.readLine();
        System.out.print("Enter pet age: ");
        int petAge = Integer.parseInt(br.readLine());
        System.out.print("Enter pet sex(male/female): ");
        String petSex = br.readLine();
        System.out.print("Enter pet description: ");
        String petDescription = br.readLine();
        System.out.print("Enter pet type: ");
        String petType = br.readLine();
        System.out.print("Enter pet image path: ");
        String petImagePath = br.readLine();

        Type type = Type.valueOf(petType.toUpperCase());
        Gender gender = Gender.valueOf(petSex.toUpperCase());

        return new Pet(petName, petAge, gender, petDescription, type, petImagePath);
    }

    public static PetService getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final PetService INSTANCE = new PetService();
    }
}
