package FPP.lectureCode.lesson3.accessModifier.animals;

public class Animal {
    protected String name;  // variable protegida

    public Animal(String name) {
        this.name = name;
    }

    protected void makeSound() {  // método protegido
        System.out.println("Some generic animal sound");
    }

    public String getName() {
        System.out.println(" -->" + name);
        return name;
    }
}