package FPP.lectureCode.lesson3.herencia;

public class IServiceSRI implements ServiceSRI {

    public IServiceSRI( ) {
        //aqui me conecto a la base de datos del SRI
        //consulto el tipo de contribuyente
        //consulto el tipo de actividad economica
    }
    @Override
    public double computeTax() {
        return 0;
    }

    @Override
    public double computeRetentionTax() {
        return 0;
    }
}
