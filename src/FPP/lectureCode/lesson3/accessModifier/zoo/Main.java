package FPP.lectureCode.lesson3.accessModifier.zoo;

import java.util.GregorianCalendar;

public class Main  {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "SI");
        dog.showName();       // Acceso permitido
        dog.makeSound();      // Acceso permitido porque Dog sobrescribe el método
        //dog.name;          // ❌ Error si lo intentas desde aquí, no está permitido fuera de la subclase


        int age = 19;
        Integer age2 = age;
        age = age2;
        if(age2 < age ){

        }
    }
}