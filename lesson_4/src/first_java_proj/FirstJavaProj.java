package first_java_proj;

public class FirstJavaProj {

    public static void doSomethig(Pet pet){
        System.out.println(pet);
        pet.eat();
    }

    public static void main(String[] args){
        Pet ralph = new Pet("Ralph");
        Pet bob = new Dog("Bob", true);
        Dog spike = new Dog("Spike", true);
        Dog fifi = new Dog("Fifi", false);
        Cat daisy = new Cat("Daisy");

        Pet[] pets = {spike, fifi,daisy, bob, ralph};
        for (int i=0; i<5;i++){
           doSomethig(pets[i]);
        }

    }

}
