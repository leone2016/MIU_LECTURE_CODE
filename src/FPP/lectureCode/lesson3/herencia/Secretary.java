package FPP.lectureCode.lesson3.herencia;

public class Secretary extends StaffPerson{
    private int numYears;
    private double bono;

    public Secretary(String name, String address, String telNum, String vehicleType, int numYears, double bono) {
        super(name, address, telNum, vehicleType, new IServiceSRI());
        this.numYears = numYears;
        this.bono = bono;
    }

    // @Override // sobrescritura
    //sin Override sobrecarga de metodos
    public double computeSalary() {
        return 1000 + bono;
    }

    @Override
    double pruebaConocimiento() {
        return 85.5;
    }

}
