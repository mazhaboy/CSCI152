package animal_proj;

/**
 * The Tiger class which implements Animal interface
 */
public class Tiger implements Animal {

    private int age;

    /**
     * Returns the kind of animal
     *
     * @return the kind of animal
     */
    @Override
    public String animalKind() {
        return "Tiger";
    }

    /**
     * Returns the current age of animal
     *
     * @return the age of the animal
     */
    @Override
    public int getAge() {
        return age;
    }

    /**
     * Returns true if the animal can eat
     * the given kind of food
     *
     * @param food - the name of the food
     * @return whether or not the animal can eat the
     * given food
     */
    @Override
    public boolean canEat(String food) {
        if (food.equals("Meat")){
            return true;
        }
        return false;
    }

    /**
     * Increments the animal's age by one year
     */
    @Override
    public void ageOneYear() {
        age++;
    }

    /**
     * Returns the current age of animal
     * @return the current age of animal
     */
    public String toString(){
        return "A tiger which is "+age+" years old";
    }
    /**
     * Attempt to feed the animal the given food.
     * Throws an exception if the animal cannot eat
     * the food.
     * @param food the food to be fed to the animal
     * @throws Exception if the animal cannot eat the food
     */
    public void feed(String food) throws Exception {
        if (!this.canEat(food)){
            throw new Exception("Tiger cannot eat "+food);
        }
        System.out.println("Munch, munch...");
    }
}
