package modelos;

public class TarjetaCredito extends TarjetaDebito{
        private double cupo;


    public TarjetaCredito(double cupo, double numero, double fv, double ccv) {
        super(cupo, numero, fv, ccv);
    }
}
