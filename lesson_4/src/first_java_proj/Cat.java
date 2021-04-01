package first_java_proj;

public class Cat extends Pet {
    /**
     *
     * @param name
     */
   public Cat(String name){
       super(name);
   }


   public void meow(){
       System.out.println("mew...");
   }
   public void eat(){
       System.out.println("slurp, slurp");
   }

    /**
     *
     * @return name of the cat
     */
   public String toString(){
       return "Cat named "+ getName();
   }

}
