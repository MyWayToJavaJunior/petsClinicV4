package kz.petsclinic.clinic.pets;

/**
 * ����� - �����, ����������� �� Pet
 */
public class Bird extends Pet{

    private static final String BIRD_ABILITY = "KILL DOGS";

    public Bird(final String nameOfBird) {
        super(nameOfBird, BIRD_ABILITY);
    }
}
