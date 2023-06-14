package paquete1;

public class DocenteFactura extends Docente {

    private double valorFactura;
    private double valorIva;
    private double valorCancelar;

    public double obtenerValorFactura() {
        return valorFactura;
    }

    public void establecerValorFactura(double b) {
        this.valorFactura = b;
    }

    public double obtenerValorIva() {
        return valorIva;
    }

    public void establecerValorIva(double b) {
        this.valorIva = b;
    }

    public double obtenerValorCancelar() {
        return valorCancelar;
    }

    public void calcularValorCancelar() {
        double valor = (valorFactura * valorIva)/100;
        valorCancelar = valorFactura - valor;
    }

    @Override
    public String toString() {
        String m = String.format("\n------Docente Factura------\n"
                + "Nombre: %s\n"
                + "Cedula: %s\n"
                + "Valor Factura: $%.2f\n"
                + "Valor IVA: $%.2f\n"
                + "Valor a Cancelar: $%.2f\n\n",
                nombre,
                cedula,
                valorFactura,
                valorIva,
                valorCancelar);

        return m;
    }
}
