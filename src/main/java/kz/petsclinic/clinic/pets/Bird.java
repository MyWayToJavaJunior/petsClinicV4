package kz.petsclinic.clinic.pets;

/**
 * Класс - птица, унаследован от Pet
 */
public class Bird extends Pet{

    private final String BIRD_ABILITY = "KILL DOGS";

    public Bird(final String nameOfBird) {
        super(nameOfBird);
    }
}
