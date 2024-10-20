package org.lap8.lap5;

import org.lap8.lap5.models.Pet;
import org.lap8.lap5.services.PetService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class PetApplication {

    private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private final PetService petService = PetService.getInstance();
    private final PetManager petManager = PetManager.getInstance();

    private void match() throws IOException {

        String answer;
        do {

            System.out.println("Please, enter your pet infomation.");
            Pet pet = petService.getPet(br);

            ArrayList<Pet> matchPets = petManager.findPetForMatch(pet);

            if (matchPets.isEmpty()) {
                System.out.println("Sorry, but you have no pet matches for your pet.");
            }
            else {
                Random random = new Random();
                int index = random.nextInt(matchPets.size());
                System.out.println("Yeah, Your pet matches is:");
                System.out.println(matchPets.get(index));
            }

            System.out.print("Do you want to play again? (y/n): ");
            answer = br.readLine();

            if (answer.equalsIgnoreCase("n")) {
                return;
            }
        } while (true);
    }

    public void application() {
        try {
            match();
        } catch (IOException e) {
            System.out.println("Something went wrong");
        }
    }

    public static void main(String[] args) throws IOException {

        new PetApplication().application();
    }
}
