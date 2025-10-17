package FPP.lectureCode.lesson4.composition;

class Vehicle {
    private Engine maquina;  // composición

    public Vehicle(Engine engine) {
        this.maquina = engine;
    }

    public void startVehicle() {
        maquina.start();
        System.out.println("Vehicle is now ready to drive 🚗");
    }


    public void setEngine(Engine newEngine) {
        this.maquina = newEngine;  // se puede cambiar el motor dinámicamente
    }
}