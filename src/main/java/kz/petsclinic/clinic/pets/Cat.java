package kz.petsclinic.clinic.pets;

/**
 * ����� - ���, ����������� �� Pet
 */
public class Cat extends Pet{

    private static final String CAT_ABILITY = "KILL BIRDS";

    public Cat(final String nameOfCat) {
        super(nameOfCat, CAT_ABILITY);
    }
}
