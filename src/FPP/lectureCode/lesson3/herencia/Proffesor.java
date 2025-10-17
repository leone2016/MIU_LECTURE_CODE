package FPP.lectureCode.lesson3.herencia;

import java.util.Objects;

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
    public int hashCode() {
        return Objects.hashCode(numPublications);
    }

    @Override
    double pruebaConocimiento() {
        return 97.2;
    }
}
