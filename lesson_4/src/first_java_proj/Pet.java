package first_java_proj;

public class Pet {
    private String name;
    private int age;

    public Pet(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void eat() {
        System.out.println("Nom, nom...");
    }

    public String toString() {
        return "Pet named " + name;
    }

}
