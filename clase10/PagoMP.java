package pagos:
public class PagoMP implements 

MetPago{
    @Override 
    public void pagar (int monto) {
        System.out.println("pagaste $" + monto "con MP")
    }
}