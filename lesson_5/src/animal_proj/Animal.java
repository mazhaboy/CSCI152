package animal_proj;

public interface Animal {
    /**
     * Returns the kind of animal
     * @return the kind of animal
     */
    public String animalKind();

    /**
     * Returns the current age of animal
     * @return the age of the animal
     */
    public int getAge();

    /**
     * Returns true if the animal can eat
     * the given kind of food
     * @param food - the name of the food
     * @return whether or not the animal can eat the
     * given food
     */
    public boolean canEat(String food);

    /**
     * Increments the animal's age by one year
     */
    public void ageOneYear();

    /**
     * Attempt to feed the animal the given food.
     * Throws an exception if the animal cannot eat
     * the food.
     * @param food the food to be fed to the animal
     * @throws Exception if the animal cannot eat the food
     */
    public void feed(String food) throws Exception;
}
