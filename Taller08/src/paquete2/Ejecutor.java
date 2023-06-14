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
                    ingresoDN();
                    break;
                case 2:
                    ingresoDF();
                    break;
                case 3:
                    bandera = false;
                    break;
                default:
                    System.out.println("Error, la opcion ingresada no existe..");
            }
        }
    }

    public static String ingresoNombre() {
        Scanner ent = new Scanner(System.in);
        
        String nombre;
        String cedula;
        
        System.out.print("Ingrese el nombre: ");
        nombre = ent.nextLine();
        System.out.print("Ingrese la cedula: ");
        cedula = ent.nextLine();
        
        

    }

    public static void ingresoDN() {
        Scanner ent = new Scanner(System.in);
        ent.useLocale(Locale.US);

        String nombre;
        String cedula;
        double valorSueldo;
        double valorHoraExtra;
        int numeroHorasExtra;
        double sueldo;

        System.out.print("Ingrese el nombre: ");
        nombre = ent.nextLine();
        System.out.print("Ingrese la cedula: ");
        cedula = ent.nextLine();
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

    public static void ingresoDF() {
        Scanner ent = new Scanner(System.in);
        ent.useLocale(Locale.US);

        String nombre;
        String cedula;
        double valorFactura;
        double valorIva;

        System.out.print("Ingrese el nombre: ");
        nombre = ent.nextLine();
        System.out.print("Ingrese la cedula: ");
        cedula = ent.nextLine();
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
