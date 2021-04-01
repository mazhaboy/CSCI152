package first_java_proj;

public class Dog extends Pet {
    private boolean isBig;

    public Dog(String name, boolean isBig){
        super(name);

        this.isBig=isBig;
    }

    public boolean isBig() {
        return isBig;
    }

    public void bark(){
        if (isBig){
            System.out.println("Woof!");
        } else {
            System.out.println("guf, guf.");
        }
    }

    public void eat(){
        if (isBig){
            System.out.println("MUNCH, SLURP!!!");
        } else {
            System.out.println("chomp, chomp.");
        }
    }

    public String toString(){
        return "Dog named "+ getName();
    }

}
