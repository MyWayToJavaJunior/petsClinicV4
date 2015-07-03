package kz.petsclinic.clinic.pets;

/**
 * Абстрактный класс -
 * основа для всех животных
 */
public abstract class Pet {

    private String nameOfPet;
    private String petAbility;

    public Pet(final String nameOfPet) {
        this.nameOfPet = nameOfPet;
    }

    public String getNameOfPet() {
        return this.nameOfPet;
    }

    public String getClassOfPet() {
        return this.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return " name of Pet: " + this.nameOfPet + ", class is " + this.getClassOfPet() + ", ability " + this.petAbility;
    }
}
