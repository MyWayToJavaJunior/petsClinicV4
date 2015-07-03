package kz.petsclinic.clinic.pets;

/**
 * Абстрактный класс -
 * основа для всех животных
 */
public abstract class Pet {

    private String nameOfPet;
    private String petAbility;

    public Pet(final String nameOfPet, final String petAbility) {
        this.nameOfPet = nameOfPet;
        this.petAbility = petAbility;
    }

    public String getNameOfPet() {
        return this.nameOfPet;
    }

    public String getClassOfPet() {
        return this.getClass().getSimpleName();
    }

    public void setNameOfPet(final String nameOfPet) {
        this.nameOfPet = nameOfPet;
    }

    @Override
    public String toString() {
        return "name of Pet: " + this.nameOfPet + ", class is " + this.getClassOfPet() + ", ability " + this.petAbility;
    }
}
