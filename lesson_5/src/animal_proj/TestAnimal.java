package animal_proj;

public class TestAnimal {
    public static void feedMeat(Animal animal){
        try {
            animal.feed("Meat");
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }

    public static void main(String[]args){
        Animal cow = new Cow();
        Animal tiger = new Tiger();
        System.out.println(cow.canEat("Meat"));
        System.out.println(tiger.canEat("Meat"));
        cow.ageOneYear();

        System.out.println(cow);
        System.out.println(tiger);
        feedMeat(cow);
        feedMeat(tiger);

    }

}
