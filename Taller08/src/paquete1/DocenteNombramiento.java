
package paquete1;

public class DocenteNombramiento extends Docente{
    private double valorSueldo;
    private double valorHoraExtra;
    private int numeroHorasExtra;
    private double sueldo;

    public double obtenerValorSueldo() {
        return valorSueldo;
    }

    public void establecerValorSueldo(double a) {
        valorSueldo = a;
    }

    public double obtenerValorHoraExtra() {
        return valorHoraExtra;
    }

    public void establecerValorHoraExtra(double a) {
        valorHoraExtra = a;
    }

    public int obtenerNumeroHorasExtra() {
        return numeroHorasExtra;
    }

    public void establecerNumeroHorasExtra(int a) {
        numeroHorasExtra = a;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public void calcularSueldo() {
        double valor = valorHoraExtra * numeroHorasExtra;
        sueldo = valor + valorSueldo;
    }

    @Override
    public String toString() {
        String m = String.format("\n------Docente Nombramiento------\n"
                + "Nombre: %s\n"
                + "Cedula: %s\n"
                + "Valor Sueldo: $%.2f\n"
                + "Valor Horas Extras: $%.2f\n"
                + "Nro. horas extra: %d\n\n"
                + "Sueldo: $%.2f\n", 
                
                nombre,
                cedula,
                valorSueldo,
                valorHoraExtra,
                numeroHorasExtra,
                sueldo);
        
        return m;
    }
    
}
