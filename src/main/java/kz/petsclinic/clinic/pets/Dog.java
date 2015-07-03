package kz.petsclinic.clinic.pets;

/**
 * Класс - Собака, унаследован от Pet
 */
public class Dog extends Pet{

    private final String DOG_ABILITY = "KILL CATS";

    public Dog(final String nameOfDog) {
        super(nameOfDog);
    }
}
