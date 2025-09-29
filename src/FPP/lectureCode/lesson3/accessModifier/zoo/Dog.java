package FPP.lectureCode.lesson3.accessModifier.zoo;

import FPP.lectureCode.lesson3.accessModifier.animals.Animal;

public class Dog extends Animal {
    private String vacunas;
    public Dog(String name, String vacunas) {
        super(name);
        this.vacunas = vacunas;
    }

    public void showName() {
        this.vacunas = "hola";
        // Accedemos a la variable protected "name"
        System.out.println("Dog's name is: " + name);
    }

    @Override
    protected void makeSound() {
        System.out.println("Woof! Woof!");
    }
}