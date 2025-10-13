package FPP.lectureCode.lesson3.herencia;

public interface ServiceSRI {

    default double computeTax(){
        return 10;
    };
    double computeRetentionTax();
}
