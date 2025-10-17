package FPP.lectureCode.lesson4.composition;

public class Main {
    public static void main(String[] args) {
        ElectricEngine electric = new ElectricEngine();
        GasEngine gas = new GasEngine();

        Vehicle car = new Vehicle(gas);
        car.startVehicle(); // Arranca con motor de gasolina

        // Cambiamos el motor en tiempo de ejecución
        car.setEngine(electric);
        car.startVehicle();// Arranca con motor eléctrico
    }
}