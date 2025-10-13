package FPP.lectureCode.lesson3.herencia;

public class Proffesor extends StaffPerson{
    private int numPublications;

    public Proffesor(String name, String address, String telNum, String vehicleType, int numPublications) {
        super(name, address, telNum, vehicleType, new IServiceSRI());
        this.numPublications = numPublications;
    }

    @Override
    public double computeSalary() {
        return 1000 + (numPublications * 100);
    }


    @Override
    public String toString() {
        return "Proffesor{" +
                "numPublications=" + numPublications +
                '}';
    }

    @Override
    double pruebaConocimiento() {
        return 97.2;
    }
}
