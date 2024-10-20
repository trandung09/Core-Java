package org.lap8.lap5;

import org.lap8.lap5.models.Pet;
import org.lap8.lap5.models.Gender;
import org.lap8.lap5.models.Type;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PetManager {

    private final List<Pet> pets = new ArrayList<>();

    private PetManager() {

        pets.add(new Pet("Buddy", 3, Gender.MALE, "A playful dog", Type.DOG, "Dog.jpg"));
        pets.add(new Pet("Luna", 2, Gender.FEMALE, "A curious cat", Type.CAT, "Cat.jpg"));
        pets.add(new Pet("Kiwi", 1, Gender.MALE, "A colorful bird", Type.BIRD, "Bird.jpg"));
        pets.add(new Pet("Coco", 4, Gender.FEMALE, "A fluffy rabbit", Type.RABBIT, "Rabbit.jpg"));
    }

    public void add(Pet pet) {
        if (pet == null) return;
        pets.add(pet);
    }

    public void remove(int petID) {
        pets.removeIf((pet) -> pet.getId() == petID);
    }

    public Pet findPetByID(int petID) {
        return pets.stream()
                .filter(o -> o.getId() == petID)
                .findFirst()
                .orElse(null);
    }

    public ArrayList<Pet> findPetForMatch(Pet pet) {

        return (ArrayList<Pet>) pets.stream()
                .filter(o -> {
                    return o.getGender() != pet.getGender() && o.getType() == pet.getType();
                }).collect(Collectors.toList());
    }

    public static PetManager getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final PetManager INSTANCE = new PetManager();
    }
}
