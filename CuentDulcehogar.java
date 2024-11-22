
        // TODO code application logic here
package dulcehogar;

public class Cuenta {
    private Socio numeroSocio; // FK
    private double valorCuota;
    private double cantidadAportada; // Cambiado a double para reflejar el monto en pesos

    public Cuenta(Socio numeroSocio, double valorCuota) {
        this.numeroSocio = numeroSocio;
        this.valorCuota = valorCuota;
        this.cantidadAportada = 0; // Inicialmente, la cantidad aportada es 0
    }

    public Socio getNumeroSocio() {
        return numeroSocio;
    }

    public double getValorCuota() {
        return valorCuota;
    }

    public double getCantidadAportada() {
        return cantidadAportada;
    }

    // Método para registrar un pago
    public void registrarPago(double monto) {
        if (monto > 0) {
            cantidadAportada += monto; // Aumentar la cantidad aportada
            System.out.println("Pago registrado: " + monto + " pesos.");
        } else {
            System.out.println("El monto debe ser mayor a cero.");
        }
    }

    @Override
    public String toString() {
        return "Número Socio: " + numeroSocio.getNumeroSocio() + 
               "\nValor Cuota: " + valorCuota + 
               "\nCantidad Aportada: " + cantidadAportada;
    }
}
  
