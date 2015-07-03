package kz.petsclinic.clinic.pets;

/**
 * Класс - Бланк, унаследован от Pet
 * необходим для текущей реализации
 * поиска в программе
 */
public class Blank extends Pet{
        private static final String BLANK_ABILITY = "";

        public Blank(final String nameOfBlank) {
            super(nameOfBlank, BLANK_ABILITY);
        }

}
