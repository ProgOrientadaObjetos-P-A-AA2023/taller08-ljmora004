package paquete2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import paquete1.DocenteFactura;
import paquete1.DocenteNombramiento;

public class Ejecutor {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int opcion;
        boolean bandera = true;

        while (bandera) {
            System.out.print("\nIngrese:\n"
                    + "1. Ingresar Docente Nombramiento.\n"
                    + "2. Ingresar Docente Factura.\n"
                    + "3. Salir.\n>> ");
            opcion = ent.nextInt();

            switch (opcion) {
                case 1:
                    String[] data = ingresoNombre();
                    ingresoDN(data);
                    break;
                case 2:
                    String[] data2 = ingresoNombre();
                    ingresoDF(data2);
                    break;
                case 3:
                    bandera = false;
                    break;
                default:
                    System.out.println("Error, la opcion ingresada no existe..");
            }
        }
    }

    public static String[] ingresoNombre() {
        Scanner ent = new Scanner(System.in);
        
        String nombre;
        String cedula;
        
        System.out.print("Ingrese el nombre: ");
        nombre = ent.nextLine();
        System.out.print("Ingrese la cedula: ");
        cedula = ent.nextLine();
        
        String[] data = {nombre, cedula};
        
        return data;
    }

    public static void ingresoDN(String[] data) {
        Scanner ent = new Scanner(System.in);
        ent.useLocale(Locale.US);

        String nombre = data[0];
        String cedula = data[1];
        double valorSueldo;
        double valorHoraExtra;
        int numeroHorasExtra;
        double sueldo;

        System.out.print("Ingrese el valor del sueldo: ");
        valorSueldo = ent.nextDouble();
        System.out.print("Ingrese el valor de las horas extras: ");
        valorHoraExtra = ent.nextDouble();
        System.out.print("Ingrese el numero de horas extras: ");
        numeroHorasExtra = ent.nextInt();

        DocenteNombramiento docente = new DocenteNombramiento();
        docente.establecerNombre(nombre);
        docente.establecerCedula(cedula);
        docente.establecerValorSueldo(valorSueldo);
        docente.establecerValorHoraExtra(valorHoraExtra);
        docente.establecerNumeroHorasExtra(numeroHorasExtra);
        docente.calcularSueldo();

        System.out.println(docente);
    }

    public static void ingresoDF(String[] data) {
        Scanner ent = new Scanner(System.in);
        ent.useLocale(Locale.US);

        String nombre = data[0];
        String cedula = data[1];
        double valorFactura;
        double valorIva;

        System.out.print("Ingrese el valor de la factura: ");
        valorFactura = ent.nextDouble();
        System.out.print("Ingrese el porcentaje del IVA: ");
        valorIva = ent.nextDouble();

        DocenteFactura docente = new DocenteFactura();
        docente.establecerNombre(nombre);
        docente.establecerCedula(cedula);
        docente.establecerValorFactura(valorFactura);
        docente.establecerValorIva(valorIva);
        docente.calcularValorCancelar();

        System.out.println(docente);
    }

}
